package ukr.net.jaroshov;

public class Cat {
	private String name;
	private String color;
	private int age;

	public String getName() {
		return name;
	}

	public Cat(String name, String color, int year) {
		super();
		this.name = name;
		this.color = color;
		this.age = year;
	}

	public Cat() {
		super();
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", color=" + color + ", age=" + age + "]";
	}

	public void getVoice() {
		System.out.println("May-May");
	}
}
