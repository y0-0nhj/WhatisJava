
// 다른 클래스로부터 상속받지 않는 모든 자바의 클래스는  Object 클래스로부터 상속받는 관계이다.
// - extends Object도 생략 가능

// lang 패키지: 자바에서 필수적으로 사용하는 클래스를 모아놓은 패키지
// - System, String, Math, Object ...
// - lang 패키지는 import를 쓰지 않아도 자동으로 컴파일러에서 임포트 한다. 생략 가능

// 모든 디폴트 생성자는 super()라는 것을 가지고 있다.

//import java.lang.Object;

class A /*extends Object*/ { 
	private int a;
	
	// 기본 생성자
	public A() {
		super();
		a = 50;
	}
	
	// getter
	public int getA() {
		return a;
	}
}

class B extends A {
	// 기본 생성자
	public B() {
		super();
	}
}

public class DefaultConstructorTest01 {
	public static void main(String[] args) {
		B x = new B();
		
		// 왜 결과가 50이 되었는가?
		System.out.println(x.getA());
	}

}
