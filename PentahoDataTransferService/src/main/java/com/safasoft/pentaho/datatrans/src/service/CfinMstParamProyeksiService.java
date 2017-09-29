package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.CfinMstParamProyeksi;

public interface CfinMstParamProyeksiService {

	List<CfinMstParamProyeksi> getByPage(int pageNo, int numOfBulkRecord);
	int count();
}
