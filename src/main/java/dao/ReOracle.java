package dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import application.admin;
import application.employees;
import application.users;
import util.ConnectionUtil;

public class ReOracle implements ReDao {
	private static final Logger log = LogManager.getLogger(ReOracle.class);
	private static final DecimalFormat df = new DecimalFormat();

	public List<users> getAll() throws Exception {
		Connection con = ConnectionUtil.getConnection();

		if (con == null) {
			log.error("Connection was null");
			throw new Exception("Unable to connect to database");
		}

		List<users> list;
		
		try {			
			String sql = "select * from ALLEMPLOYEES";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			list = new LinkedList<users>();
			
			while(rs.next()){
				if(rs.getString("EMPLOYEETYPE").equals("ADMIN"))
				{
					list.add(new admin(rs.getInt("EMPLOYEEID"), rs.getString("EMPLOYEETYPE"), rs.getString("FIRSTNAME"), rs.getString("LASTNAME"), rs.getString("EMAIL"), rs.getString("PASSWORD"),  rs.getString("ADDRESS"), rs.getString("STARTDATE"), rs.getString("STATUS")));
				}
				else if(rs.getString("acntType").equals("EMPLOYEE"))
				{
					list.add(new employees(rs.getInt("EMPLOYEEID"), rs.getString("EMPLOYEETYPE"), rs.getString("FIRSTNAME"), rs.getString("LASTNAME"), rs.getString("EMAIL"), rs.getString("PASSWORD"),  rs.getString("ADDRESS"), rs.getString("STARTDATE"), rs.getString("STATUS")));
				}
			}
		}catch (SQLException e) {
			log.error("Unable to execute sql query", e);
			throw new Exception("Unable to connect to database");
		}
		return list;
	}
	public List<String> getAllRe() throws Exception
	{
		Connection con = ConnectionUtil.getConnection();

		if (con == null) {
			log.error("Connection was null");
			throw new Exception("Unable to connect to database");
		}

		List<String> list;
		
		try {			
			String sql = "select TRANS from TRANSACTIONS";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			list = new LinkedList<String>();
			
			while(rs.next()){
				list.add(rs.getString("TRANS"));
			}
		}catch (SQLException e) {
			log.error("Unable to execute sql query", e);
			throw new Exception("Unable to connect to database");
		}
		return list;
	}
	public employees loginE(String userName, String password) throws Exception{
		employees tmp = new employees();
		// TODO login function
		Connection con = ConnectionUtil.getConnection();

		if (con == null) {
			log.error("Connection was null");
			throw new Exception("Unable to connect to database");
		}
		try {
			String sql = "select * from BANKACCOUNTS";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				if(rs.getString("Username").equals(userName) && rs.getString("password").equals(password))
				{
					if(rs.getString("acntType").equals("EMPLOYEE"))
					{
						tmp = new employees(rs.getInt("EMPLOYEEID"), rs.getString("EMPLOYEETYPE"), rs.getString("FIRSTNAME"), rs.getString("LASTNAME"), rs.getString("EMAIL"), rs.getString("PASSWORD"),  rs.getString("ADDRESS"), rs.getString("STARTDATE"), rs.getString("STATUS"));
					}
				}
			}
		} catch (SQLException e) {
			log.error("Unable to execute sql query", e);
			throw new Exception("Unable to connect to database");
		}
		return tmp;
	}
	
	public admin loginA(String userName, String password) throws Exception{
		admin tmp = new admin();
		// TODO login function
		Connection con = ConnectionUtil.getConnection();

		if (con == null) {
			log.error("Connection was null");
			throw new Exception("Unable to connect to database");
		}
		try {
			String sql = "select * from BANKACCOUNTS";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				if(rs.getString("EMAIL").equals(userName) && rs.getString("PASSWORD").equals(password))
				{
					if(rs.getString("acntType").equals("ADMIN"))
					{
						tmp = new admin(rs.getInt("EMPLOYEEID"), rs.getString("EMPLOYEETYPE"), rs.getString("FIRSTNAME"), rs.getString("LASTNAME"), rs.getString("EMAIL"), rs.getString("PASSWORD"),  rs.getString("ADDRESS"), rs.getString("STARTDATE"), rs.getString("STATUS"));
					}
				}
			}
		} catch (SQLException e) {
			log.error("Unable to execute sql query", e);
			throw new Exception("Unable to connect to database");
		}
		return tmp;
	}
	public void insert(String acntType, String firstName, String lastName, String userName, String password, double balance) throws Exception {
		// TODO Insert
		Connection con = ConnectionUtil.getConnection();

		if (con == null) {
			log.error("Connection was null");
			throw new Exception("Unable to connect to database");
		}
		try {
			String sql = "call create_account(?, ?, ?, ?, ?, ?, ?)";
			CallableStatement ps = con.prepareCall(sql);
			ps.registerOutParameter(1, Types.INTEGER);
			ps.setString(2, acntType);
			ps.setString(3, firstName);
			ps.setString(4, lastName);
			ps.setString(5, userName);
			ps.setString(6, password);
			ps.setDouble(7, balance);
			ps.executeUpdate();
			int id = ps.getInt(1);
			System.out.println("Successfully Added to database: ");
			System.out.print("Your account number is: ");
			System.out.println(id);
		} catch (SQLException e) {
			log.error("Unable to execute sql query", e);
			throw new Exception("Unable to connect to database");
		}
	}
}