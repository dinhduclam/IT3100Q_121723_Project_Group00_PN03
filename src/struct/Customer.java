package struct;

public class Customer {
	protected String fullName;
	protected String address;
	protected String phoneNumber;
	
	public Customer(String fullName, String address, String phoneNumber) {
		this.fullName = fullName;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	public String getFullName() {
		return fullName;
	}

}
