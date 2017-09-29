package com.safasoft.mobsur.rest.client.util;

public enum ModulType {

	//Tipe modul dan nilainya
	POST_TASK(1),
	GET_RESULT(2),
	GET_MASTER(3);
	
	private final int type;
	
	private ModulType(int type) {
		this.type = type;
	}
	
	public int getType() {
		return type;
	}
}
