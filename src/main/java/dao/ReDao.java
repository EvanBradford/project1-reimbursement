package dao;

import java.util.List;

import application.admin;
import application.employees;
import application.users;

public interface ReDao {
	List<users> getAll() throws Exception;
	List<String> getAllRe() throws Exception;
	employees loginE(String email, String password) throws Exception;
	admin loginA(String email, String password) throws Exception;
}