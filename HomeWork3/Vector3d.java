package ukr.net.jaroshov;

public class Vector3d {
	private double x;
	private double y;
	private double z;

	public Vector3d() {
		super();
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public Vector3d(double x, double y, double z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}

	@Override
	public String toString() {
		return "Vector3d [x=" + x + ", y=" + y + ", z=" + z + "]";
	}

	public Vector3d addVector(Vector3d vector) {
		Vector3d vectorC = new Vector3d();
		vectorC.setX(getX() + vector.getX());
		vectorC.setY(getY() + vector.getY());
		vectorC.setZ(getZ() + vector.getZ());

		return vectorC;
	}

	public double scalarVector(Vector3d vector) {
		return getX() * vector.getX() + getY() * vector.getY() + getZ() * vector.getZ();
	}
	
	public Vector3d multiplicationVector(Vector3d vector) {
		Vector3d vectorC = new Vector3d();
		vectorC.setX(getY() * vector.getZ() - getZ() * vector.getY());		
		vectorC.setY(getZ() * vector.getX() - getX() * vector.getZ());
		vectorC.setZ(getX() * vector.getY() - getY() * vector.getX());

		return vectorC;
	}
}
