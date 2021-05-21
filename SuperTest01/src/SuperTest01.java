
// 접근 제한자(한정자), access modifier
// 1. public : 누구에게나, 어디에서나 접근 가능
// 2. protected : 같은 패키지에서 접근 가능, 패키지가 달라도 상속을 받은 자식에서는 접근 가능
// 3. default : 같은 패키지에서만 접근 가능, 접근 제한자를 사용하지 않은 상태
// 4. private : 같은 클래스의 멤버에서만 접근 가능, 다른 클래스에서는 접근 불가

// 접근 제한자 : public > protected > default > private
// 접근 범위 :    넓다(wide)  <-                      -> 좁다(narrow)
// 접근 강도 :   약하다(weak) <-                      -> 강하다(strong)
// 접근 강도 : 느슨하다(loose) <-                      -> 엄격하다 (tight)

class Base {
	protected int x; // 상속을 받은 자식에서는 접근 가능
	
	public Base() {
		this.x = 1;
	}
	
	public Base(int x) {
		this.x = x;
	}
	
	public void print() {
		System.out.println("Base's x = " + x);
	}
}

class Derived extends Base {
	private int x;
	
	public Derived(int x1, int x2) {
		super.x = x1;
		this.x = x2;
	}
	
	// 오버라이딩
	@Override
	public void print() {
		super.print();
		System.out.println("Derived's x = " + x);
	}
}

public class SuperTest01 {
	public static void main(String[] args) {
		Base a = new Base(10);
		a.print();
		System.out.println();
		
		Derived b = new Derived(20, 30);
		b.print();
		System.out.println();
		
	}

}
