package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.CfinMstPotensiProyeksi;

public interface CfinMstPotensiProyeksiService {

	List<CfinMstPotensiProyeksi> getByPage(int pageNo, int numOfBulkRecord);
	int count();
}
