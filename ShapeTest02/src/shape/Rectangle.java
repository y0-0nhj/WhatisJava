package shape;

// 직사각형 클래스 - Shape로부터 상속받은 자식 클래스, Plane2D를 구현한 클래스
public class Rectangle extends Shape implements Plane2D {
	private int width;  // 열수, 가로
	private int height; // 행수, 세로
	
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
