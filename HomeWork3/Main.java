package ukr.net.jaroshov;

public class Main {

	public static void main(String[] args) {
		Vector3d vectorOne = new Vector3d(1, 2, 3);
		Vector3d vectorTwo = new Vector3d(0.5, 10, 4);
		
		System.out.println("vectorOne = " + vectorOne);
		System.out.println("vectorTwo = " + vectorTwo);
		
		System.out.println(vectorOne.addVector(vectorTwo));
		System.out.println(vectorOne.scalarVector(vectorTwo));
		System.out.println(vectorOne.multiplicationVector(vectorTwo));
	}
}
