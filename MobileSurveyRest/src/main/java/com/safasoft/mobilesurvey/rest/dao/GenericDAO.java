package com.safasoft.mobilesurvey.rest.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * DAO various object
 * @created Jan 9, 2017
 * @author awal
 */
@Repository("genericDAO")
public class GenericDAO {

  @Autowired	
  private SessionFactory sessionFactory;
  
  /**
   * common lookup table 
   * @param tableName
   * @param columnQuery , list of columns in the form of query
   * @return list of table contents based on given table
   */
  @SuppressWarnings("unchecked")
public List<String> getTableData(String tableName, String columnQuery) {
    return sessionFactory.getCurrentSession().createSQLQuery(
            "select " + columnQuery + " " +
              "from " + tableName)
            .list();
  }
  
/**
 * Get column by table
 * @param tableName
 * @return list of column names based on given table
 */
  @SuppressWarnings("unchecked")
public List<String> getTableColumns(String tableName) { // strict to PostgreSQL
	return sessionFactory.getCurrentSession().createQuery(
				"select columnName from LookupTableVw " +
					"where tableName = :tableName")
				.setString("tableName", tableName)	
				.list();
  }
  
  /**
   * Get return field name of the lookup table
   * @param tableName
   * @return filed name where value of table should return
   */
  public String getReturnField(String tableName) {
  	return (String) sessionFactory.getCurrentSession().createSQLQuery(
  				"select return_field " +
  					"from master_lookup_mapping " +
  					"where lookup_mapping_table = :tableName")
  			.setString("tableName", tableName)
  			.uniqueResult();
  }
}
