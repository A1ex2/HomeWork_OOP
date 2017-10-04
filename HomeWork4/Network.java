package ukr.net.jaroshov;

public class Network {
	private String name;
	private Phone[] base = new Phone[0];

	public Network() {
		super();
	}

	public Network(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String addPhone(Phone phone) {
		Phone[] temp = copiPhone();
		String status;

		if (thereArePhone(phone)) {
			temp[temp.length - 1] = phone;
			phone.setNetwork(this);
			status = "Welcome " + getName();
			base = temp;
		} else {
			status = "Phone Registration Error";
		}
		return status;
	}
	
	public void findAndCall(String phoneNumber){
		Phone phone = findPhone(phoneNumber);
		if (phone.getUid()==0) {
			System.out.println("there is no such phone number in the network");
		} else {
			phone.takeCall();
		}
	}

	@Override
	public String toString() {
		return "Network [name=" + name + "]";
	}

	private Phone[] copiPhone() {
		if (base.length == 0) {
			Phone[] temp = new Phone[1];
			return temp;
		} else {
			Phone[] temp = new Phone[base.length + 1];
			for (int i = 0; i < base.length; i++) {
				temp[i] = base[i];
			}
			return temp;
		}
	}

	private boolean thereArePhone(Phone phone) {
		boolean notPhone = true;
		for (int i = 0; i < base.length; i++) {
			if (phone == base[i]) {
				notPhone = false;
				break;
			}
		}
		return notPhone;
	}

	private Phone findPhone(String phoneNumber) {
		Phone phone = new Phone();
		for (int i = 0; i < base.length; i++) {
			if (phoneNumber == base[i].getPhoneNumber()) {
				phone = base[i];
			}
		}
		return phone;
	}
}