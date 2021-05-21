
// method(메소드) : 특정 기능을 수행하는 함수

// 메소드를 만드는 규칙
// 1. 매개변수의 개수와 타입은 반드시 일치해야 한다.
// 2. 리턴값과 리턴타입은 반드시 일치해야 한다.
// 3. 리턴값은 반드시 1개 또는 0개 여야 한다.

public class Method01 {
	public static void main(String[] args) {
		int a = 10, b = 20, c;
		
		c = add(a, b); // 메소드 호출 (사용)
		
		System.out.println("합계 : " + c);
		
		System.out.println(Math.PI);
	}

	// 메소드 정의 (생성)
	static int add(int x, int y) {
		int z;
		z = x + y;
		
		return z;
	}
}
