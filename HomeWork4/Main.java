package ukr.net.jaroshov;

public class Main {

	public static void main(String[] args) {
		Network life = new Network("Life");
		Phone LG = new Phone("0544548", 1, "LG");
		LG.registerPhone(life);
		
		Phone Samsung = new Phone("0548519", 2, "Samsung");
		Samsung.registerPhone(life);

		Phone iPhone = new Phone("0548509", 3, "iPhone");
		iPhone.registerPhone(life);
		
		LG.callPhone("0548509");
		iPhone.callPhone("0548519");
		Samsung.callPhone("0548559");
	}
}
