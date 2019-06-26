package application;

public interface AdminActions {
	//SERVLETS AND HTML

	void login();
	//View their Homepage
	void logout();

	//NORMAL FUNCTIONS

	void approve();
	void deny();
	void viewAllRequests();
	void viewRequests(employees employee);
	void viewAllEmployees();

	//Optional:
	void viewImages();
	void registerEmployees();
	// this will send them an email with login info
}