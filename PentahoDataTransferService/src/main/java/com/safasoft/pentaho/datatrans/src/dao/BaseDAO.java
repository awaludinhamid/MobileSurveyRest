/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.safasoft.pentaho.datatrans.src.dao;

import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.exception.GenericJDBCException;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * DAO template used as parent class
 * Containing basic DAO statement
 * Sub-class extend this class to gather its field/method
 * @created Aug 26, 2014
 * @author awal
 * @param <T>
 */
public class BaseDAO<T> {
  protected Class<?> domainClass;
  @Autowired
  protected SessionFactory sessionFactory;
  
  private final Logger logger = Logger.getLogger("dao");

  /**
   * Using java reflection to get current bean class which used this class
   */
  public BaseDAO() {
    this.domainClass = (Class<?>) ((ParameterizedType) getClass()
            .getGenericSuperclass())
            .getActualTypeArguments()[0];
  }

  /**
   * Save current record into database
   * @param domain
   * @return class bean
   */
  public T save(T domain) {
    sessionFactory.getCurrentSession().saveOrUpdate(domain);
    return domain;
  }
  
  /**
   * Bulk save to eliminate time trip
   * @param domain
   * @param bulkRecord, number of record in one transaction
   */
  public List<T> save(List<T> domain, int bulkRecord) {
  	List<T> temp = new ArrayList<T>();
    Session session = sessionFactory.openSession();
    Transaction tx = session.beginTransaction();
    try {
      int idxTx = 0;
      for(T t : domain) {
        session.saveOrUpdate(t);
        temp.add(t);
        if(++idxTx % bulkRecord == 0) {
          session.flush();
          session.clear();
        }
      }
      tx.commit();      
    } catch(GenericJDBCException gje) {
    	tx.rollback();
      logger.error(gje);
    } finally {
    	session.close();
    }
    return temp;
  }

  /**
   * Delete current record from database
   * @param domain
   * @return class bean
   */
  public T delete(T domain) {
    sessionFactory.getCurrentSession().delete(domain);
    return domain;
  }

  /**
   * Retrieve record from database by integer id
   * @param id
   * @return class bean
   */
  @SuppressWarnings("unchecked")
public T getById(int id) {
    return (T) sessionFactory.getCurrentSession().get(domainClass, id);
  }

  /**
   * Retrieve record from database by String id
   * @param id
   * @return class bean
   */
  @SuppressWarnings("unchecked")
public T getById(String id) {
    return (T) sessionFactory.getCurrentSession().get(domainClass, id);
  }

  /**
   * Retrieve all of records
   * @return List of class bean
   */
  @SuppressWarnings("unchecked")
public List<T> getAll() {
    return sessionFactory.getCurrentSession().createQuery("from " + domainClass.getName()).list();
  }

  /**
   * Retrieve all of records by paging
   * @param start
   * @param num
   * @return List of class bean
   */
  @SuppressWarnings("unchecked")
public List<T> getByRange(int start, int num) {
    return sessionFactory.getCurrentSession().createQuery(
    				"from " + domainClass.getName() + " x " +
    					"order by rowid")//specific to oracle
            .setFirstResult(start)
            .setMaxResults(num)
            .list();
  }

  /**
   * Get records count
   * @return integer
   */
  public int count() {
    return ((Long) sessionFactory.getCurrentSession().createQuery(
            "select count(*) from " + domainClass.getName() + " x")
            .iterate().next()).intValue();
  }
}
