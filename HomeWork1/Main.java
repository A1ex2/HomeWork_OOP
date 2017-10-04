package ukr.net.jaroshov;

public class Main {

	public static void main(String[] args) {

		Cat catOne = new Cat();
		catOne.setColor("Black");
		catOne.setAge(5);
		catOne.setName("Kuzya");
		
		Cat catTwo = new Cat();
		catTwo.setColor("RedHeaded");
		catTwo.setAge(7);
		catTwo.setName("Vasya");
		
		System.out.println(catOne);
		System.out.println(catOne.getName());
		catOne.getVoice();
		System.out.println();
		System.out.println(catTwo);
		System.out.println(catTwo.getName());
		catOne.getVoice();
	}
}