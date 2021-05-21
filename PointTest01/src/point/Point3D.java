package point;

public class Point3D extends Point2D {
	private int z;
	
	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	// getter
	public int getZ() {
		return z;
	}
	
	// setter
	public void setZ(int z) {
		this.z = z;
	}
	
	// toString()
	// 오버라이딩
	public String toString() {
		return super.toString() + ", z = " + z;
	}
	
}
