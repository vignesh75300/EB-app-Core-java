package in.vignesh.model;

public class User {
	private String name;
	private String mobileNo;
	private String consumerNumber;
	private String customerId;
	private String password;

	public String getName() {
		return name;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public String getConsumerNumber() {
		return consumerNumber;
	}

	public String getCustomerId() {
		return customerId;
	}

	public String getPassword() {
		return password;
	}
/**
 * Used for initializing values
 * @param name
 * @param mobileNo
 * @param consumerNumber
 * @param customerId
 * @param password
 */
	public User(String name, String mobileNo, String consumerNumber, String customerId, String password) {
		this.name = name;
		this.mobileNo = mobileNo;
		this.consumerNumber = consumerNumber;
		this.customerId = customerId;
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", mobileNo=" + mobileNo + ", consumerNumber=" + consumerNumber + ", customerId="
				+ customerId + ", password=" + password + "]";
	}

}