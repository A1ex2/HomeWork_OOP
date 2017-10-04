package ukr.net.jaroshov;

public class Main {

	public static void main(String[] args) {
		Triangle triangleOne = new Triangle(3,4,5);
		double areaOne = triangleOne.calcArea();
		System.out.println("Площадь первого треугольника " + areaOne);
		
		Triangle triangleTwo = new Triangle(3.5,5.5,6);
		double areaTwo = triangleTwo.calcArea();
		System.out.println("Площадь второго треугольника " + areaTwo);
	}
}
