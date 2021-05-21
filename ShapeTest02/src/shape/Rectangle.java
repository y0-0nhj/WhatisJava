package shape;

// ���簢�� Ŭ���� - Shape�κ��� ��ӹ��� �ڽ� Ŭ����, Plane2D�� ������ Ŭ����
public class Rectangle extends Shape implements Plane2D {
	private int width;  // ����, ����
	private int height; // ���, ����
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public void draw() {
		for(int i=1; i<=height; i++) {
			for(int j=1; j<=width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	@Override
	public String toString() {
		return "Rectangle (width: " + width + ", height: " + height + ")";
	}
	
	@Override
	public int getArea() {
		return width * height;
	}
	
}
