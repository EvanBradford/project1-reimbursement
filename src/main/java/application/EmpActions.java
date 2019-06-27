package application;

public interface EmpActions {
	//SERVLETS & HTML
	employees login(String email, String password);
	//View their Homepage
	void logout();

	//NORMAL FUNCTIONS

	void submitRequest(double AMOUNT, String PURPOSE, String SUBMITTEDDATE, String STATUS, int EMPLOYEE_ID);
	void viewRequests(int empId);

	void viewInformation();
	void updateInformation();

	//Optional:
	void uploadImage();
	void sendEmail();
	void resetPassword(); //(via email?)
}