package application;

public class employees extends users implements EmpActions{

	/**
	 * 
	 */
	private static final long serialVersionUID = -850410748123462791L;

	public employees() {
		super();
		// TODO Auto-generated constructor stub
	}

	public employees(int employeeId, String employeeType, String firstname, String lastname, String email,
			String password, String address, String startDate, String status) {
		super(employeeId, employeeType, firstname, lastname, email, password, address, startDate, status);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getEmployeeId() {
		// TODO Auto-generated method stub
		return super.getEmployeeId();
	}

	@Override
	public void setEmployeeId(int employeeId) {
		// TODO Auto-generated method stub
		super.setEmployeeId(employeeId);
	}

	@Override
	public String getEmployeeType() {
		// TODO Auto-generated method stub
		return super.getEmployeeType();
	}

	@Override
	public void setEmployeeType(String employeeType) {
		// TODO Auto-generated method stub
		super.setEmployeeType(employeeType);
	}

	@Override
	public String getFirstname() {
		// TODO Auto-generated method stub
		return super.getFirstname();
	}

	@Override
	public void setFirstname(String firstname) {
		// TODO Auto-generated method stub
		super.setFirstname(firstname);
	}

	@Override
	public String getLastname() {
		// TODO Auto-generated method stub
		return super.getLastname();
	}

	@Override
	public void setLastname(String lastname) {
		// TODO Auto-generated method stub
		super.setLastname(lastname);
	}

	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return super.getEmail();
	}

	@Override
	public void setEmail(String email) {
		// TODO Auto-generated method stub
		super.setEmail(email);
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return super.getPassword();
	}

	@Override
	public void setPassword(String password) {
		// TODO Auto-generated method stub
		super.setPassword(password);
	}

	@Override
	public String getAddress() {
		// TODO Auto-generated method stub
		return super.getAddress();
	}

	@Override
	public void setAddress(String address) {
		// TODO Auto-generated method stub
		super.setAddress(address);
	}

	@Override
	public String getStartDate() {
		// TODO Auto-generated method stub
		return super.getStartDate();
	}

	@Override
	public void setStartDate(String startDate) {
		// TODO Auto-generated method stub
		super.setStartDate(startDate);
	}

	@Override
	public String getStatus() {
		// TODO Auto-generated method stub
		return super.getStatus();
	}

	@Override
	public void setStatus(String status) {
		// TODO Auto-generated method stub
		super.setStatus(status);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public void login(String email, String password) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void logout() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void submitRequest(int REQUESTID, double AMOUNT, String PURPOSE, String SUBMITTEDDATE, String STATUS, int EMPLOYEE_ID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewRequests() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewInformation() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateInformation() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void uploadImage() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendEmail() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resetPassword() {
		// TODO Auto-generated method stub
		
	}
}