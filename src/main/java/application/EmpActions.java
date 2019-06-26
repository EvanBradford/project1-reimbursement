package application;

public interface EmpActions {
	//SERVLETS & HTML
	void login();
	//View their Homepage
	void logout();

	//NORMAL FUNCTIONS

	void submitRequest();
	void viewRequests();

	void viewInformation();
	void updateInformation();

	//Optional:
	void uploadImage();
	void sendEmail();
	void resetPassword(); //(via email?)
}