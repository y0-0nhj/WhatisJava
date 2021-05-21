
// 추상 클래스
abstract class A {
	public abstract void a(); // 추상 메소드
	public abstract void b();
}

// 클래스 A로부터 상속받았을 때 에러가 나는 이유
// 해결 방법  1 - 클래스 B를 추상 클래스로 선언하는 방법, 인스턴스를 생성하지 못함
//abstract class B extends A {	
//}

// 해결 방법 2 - 클래스 A의 추상 메소드를 오버라이딩(구현)하는 방법
// - 오버라이딩을 할 때는 더 강한 접근 제한을 사용할 수 없다.
// - 오버라이딩을 할 때는 동등하거나, 약한 접근 제한을 사용해야 한다.
//class B extends A {
//	public void a() { }
//	public void b() { }
//}

// 해결 방법 - 클래스 A의 추상 메소드 중에서 a()메소드만 오버라이딩을 한 상황
abstract class B extends A {
	public void a() { }; 
}

class C extends B {
	public void b() { }
}

public class AbstractTest02 {
	public static void main(String[] args) {
		
	}

}
