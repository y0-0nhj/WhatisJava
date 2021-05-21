package shape;

// ���Ϻ��� ������ �����ﰢ�� - Shape�� ����ϰ�, Plan2D�� ������ Ŭ����
public class Triangle extends Shape implements Plane2D {
	private int width;  // ����, ��
	private int height; // ����, ��

	public Triangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	// getter
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	
	@Override
	public void draw() {
		for(int i=1; i<=height; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	@Override
	public String toString() {
		return "Triangle (width: " + width + ", height: " + height + ")";
	}
	
	@Override
	public int getArea() {
		return width * height / 2;
	}

}
