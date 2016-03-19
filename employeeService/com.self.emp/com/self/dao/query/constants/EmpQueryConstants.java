package com.self.dao.query.constants;

public class EmpQueryConstants {
	public final static String FETCH_ALL_EMPLOYEE_COUNT="select count(*) from persons";
	public final static String FETCH_ALL_EMPLOYEE="select * from persons";
	public final static String FETCH_ALL_EMPLOYEE_BY_FNAME="select * from persons where firstname=?";
	public final static String FETCH_ALL_EMPLOYEE_BY_LFNAME="select * from persons where lastname=?";
	public final static String FETCH_ALL_EMPLOYEE_ID="select * from persons where PERSONID=?";
	public final static String FETCH_ALL_EMPLOYEE_ADDRESS="select * from persons where ADDRESS=?";
	public final static String FETCH_ALL_EMPLOYEE_CITY="select * from persons where  CITY=?";


}
