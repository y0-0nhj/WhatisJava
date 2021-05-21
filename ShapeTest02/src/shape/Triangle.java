package shape;

// 좌하변이 직각인 직각삼각형 - Shape를 상속하고, Plan2D를 구현한 클래스
public class Triangle extends Shape implements Plane2D {
	private int width;  // 가로, 열
	private int height; // 세로, 행

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
