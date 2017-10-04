package ukr.net.jaroshov;

public class Phone {
	private String phoneNumber;
	private int uid;
	private String name;
	private Network network;

	public Network getNetwork() {
		return network;
	}

	public void setNetwork(Network network) {
		this.network = network;
	}

	public Phone() {
		super();
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Phone(String phoneNumber, int uid, String name) {
		super();
		this.phoneNumber = phoneNumber;
		this.uid = uid;
		this.name = name;
	}

	public void registerPhone(Network network) {
		System.out.println(getName() + " - " + network.addPhone(this));
	}

	public void callPhone(String phoneNumber) {
		System.out.println(getName() + " dialing a number...");
		network.findAndCall(phoneNumber);
	}
	
	public void takeCall() {
		System.out.println("Call accepted " + getName());
	}
}