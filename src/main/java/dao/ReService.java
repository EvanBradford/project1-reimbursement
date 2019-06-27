package dao;

import java.util.List;

import application.users;
import application.admin;
import application.employees;
import application.reimbursements;

public class ReService {
	private static final ReDao dao = new ReOracle();
	
	public static List<users> getAllAccounts() throws Exception {
		return dao.getAll();
	}
	public static List<reimbursements> getAllRe() throws Exception
	{
		return dao.getAllRe();
	}
	public static employees loginE(String userName, String password) throws Exception{
		return dao.loginE(userName, password);
	}
	public static admin loginu(int acntNum, String userName, String password) throws Exception{
		return dao.loginA(userName, password);
	}
	public static void insertEmp(String EMPLOYEETYPE, String FIRSTNAME, String LASTNAME, String EMAIL, String PASSWORD, String ADDRESS, String STARTDATE, String STATUS) throws Exception
	{
		dao.insertEmp(EMPLOYEETYPE, FIRSTNAME, LASTNAME, EMAIL, PASSWORD, ADDRESS, STARTDATE, STATUS);
		return;
	}
	public static void insertRe(int REQUESTID, double AMOUNT, String PURPOSE, String SUBMITTEDDATE, String STATUS, int EMPLOYEE_ID) throws Exception
	{
		dao.insertRe(REQUESTID, AMOUNT, PURPOSE, SUBMITTEDDATE, STATUS, EMPLOYEE_ID);
		return;
	}
}