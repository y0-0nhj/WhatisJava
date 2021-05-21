
// 인스턴스 메소드와 클래스 메소드의 접근 가능 범위
// 인스턴스 메소드에서는 인스턴스 변수, 인스턴스 메소드, 클래스 변수, 클래스 메소드에 모두 사용 가능
// 클래스 메소드에서는 클래스 변수, 클래스 메소드는 사용 가능하기만, 인스턴스 변수, 인스턴스 메소드는 사용 불가

class Static {
	private static int s;	// 클래스 변수
	private int i;			// 인스턴스 변수
	
	public static void sm1() { }	// 클래스 메소드
	public void im1() { }			// 인스턴스 메소드
	
	// 클래스 메소드 사용 범위
	public static void sm2(int x) { // 클래스 메소드
		s = x;
		//i = x; // 클래스 메소드에서는 인스턴스 변수에 접근 불가
		sm1();
		//im1(); // 클래스 메소드에서는 인스턴스 메소드에 접근 불가
	}
	
	// 인스턴스 메소드 사용 범위
	public void im2(int x) {		// 인스턴스 메소드
		s = x;
		i = x;
		sm1();
		im1();
	}
	
	// getter
	public static int getS() {
		return s;
	}
	
	public int getI() {
		return i;
	}
	
}

public class StaticTest01 {
	public static void main(String[] args) {
		Static s1 = new Static();
		Static s2 = new Static();
		Static s3 = new Static();
		
		s1.im2(10);
		Static.sm2(20);
		
	}

}
