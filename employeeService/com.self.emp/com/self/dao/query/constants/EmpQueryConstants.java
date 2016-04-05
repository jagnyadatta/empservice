package com.self.dao.query.constants;

public class EmpQueryConstants {
	public final static String FETCH_ALL_EMPLOYEE_COUNT="select count(*) from emp";
	public final static String FETCH_ALL_EMPLOYEE="select * from emp";
	public final static String FETCH_ALL_EMPLOYEE_BY_ENAME="select * from emp where ename like ?";

	public final static String FETCH_ALL_EMPLOYEE_DEPTNO="select * from emp where deptno like ?";
	public final static String FETCH_ALL_EMPLOYEE_JOB="select * from emp where  JOB like ?";
	public static final String FETCH_ALL_EMPLOYEE_EMPNO = "select * from emp where empno=?";


}
