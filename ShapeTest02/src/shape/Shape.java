package shape;

// 도형 클래스

// 추상 클래스 (abstract class)
// 1. 추상 메소드가 1개라도 존재하면, 반드시 추상 클래스가 되어야 한다.
// 2. 추상 메소드가 없어도 추상 클래스는 될 수 있다.
// 3. 추상 클래스는 인스턴스를 만들수 없다.
// 4. 추상 클래스는 부모 클래스로 사용되어 다형성을 구현할 목적으로 사용된다.
// 5. 추상 클래스로부터 상속받는 자식 클래스는 부모 클래스의 추상 메소드를 반드시 구현(오버라이딩)해야 한다.
// 6. 추상 클래스로부터 상속받은 자식 클래스에서 추상 메소드를 오버라이딩하지 않으면 , 해당 클래스는 추상 클래스가 되어야 한다.

public abstract class Shape {
	
	// 추상 메소드 (abstract method)
	// 특징: abstract가 있음, 구현부가 없음.
	// 목적: 구체적인 기능을 알 수 없음.
	public abstract void draw();
	public abstract String toString();
	
	// 비추상 메소드
	public void print() {
		System.out.println(toString());
		draw();
	}

}
