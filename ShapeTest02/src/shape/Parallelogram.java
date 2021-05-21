package shape;

// 평행사변형 클래스 - Shape를 상속하고, Plane2D를 구현한 클래스
public class Parallelogram extends Shape implements Plane2D {
	private int width;  // 열수, 가로
	private int height; // 행수, 세로
	
	public Parallelogram(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public void draw() {
		for(int i=1; i<=height; i++) {
			for(int j=1; j<=height-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	@Override
	public String toString() {
		return "Parallelogram (width: " + width + ", height: " + height + ")";
	}
	
	@Override
	public int getArea() {
		return width * height;
	}
}
