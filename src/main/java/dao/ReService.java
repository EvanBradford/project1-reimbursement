package dao;

import java.util.List;

import application.users;
import application.admin;
import application.employees;

public class ReService {
	private static final ReDao dao = new ReOracle();
	
	public static List<users> getAllAccounts() throws Exception {
		return dao.getAll();
	}
	public static List<String> getAllRe() throws Exception
	{
		return dao.getAllRe();
	}
	public static employees loginE(String userName, String password) throws Exception{
		return dao.loginE(userName, password);
	}
	public static admin loginu(int acntNum, String userName, String password) throws Exception{
		return dao.loginA(userName, password);
	}
}