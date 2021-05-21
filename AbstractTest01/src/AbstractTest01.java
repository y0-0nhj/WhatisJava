
// 추상 클래스 특징
// 1. 추상 메소드가 있는 클래스
// 2. 추상 메소드가 없어도 추상 클래스는 가능

// 문제점 - 추상 메소드가 있으면 반드시 추상 클래스가 되어야 한다.
class P {
	//public abstract void a(); // 추상 메소드 - 구현부가 없다.
	public void b() { } // 비추상 메소드
}

// 문제점 해결 - 추상 메소드가 있으면 추상 클래스로 선언.
abstract class Q {
	public abstract void a(); // 추상 메소드 - 구현부가 없다.
	public void b() { } // 비추상 메소드
}

// 문제 없음 - 추상 메소드가 없어도 추상 클래스는 될 수 있다. 
abstract class R {
	public void a() { } // 비추상 메소드
	public void b() { } // 비추상 메소드
}

public class AbstractTest01 {
	public static void main(String[] args) {
		
	}

}
