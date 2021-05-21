package shape;

// 직선 클래스 - 추상 클래스
// 1. Shape 클래스의 자식 클래스
// 2. HorizontalLine과 VerticalLine의 부모 클래스로 동작
// 3. 인스턴스를 생성할 목적은 없다.
// 4. 단지 두 직선 클래스의 부모로써만 동적할 목적이다.

public abstract class AbstractLine extends Shape {
	private int length;
	
	public AbstractLine(int length) {
		this.length = length;
	}
	
	// getter
	public int getLength() {
		return length;
	}
	
	// setter
	public void setLength(int length) {
		this.length = length;
	}
	
}
