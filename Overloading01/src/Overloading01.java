// 오버로딩(Overloading)

public class Overloading01 {
	// 자바에서는 똑같은 이름의 메소드를 여러개 만들어 사용할 수 있을까?
	// 있다
	
	// 정수 2개의 합계
	static int add(int x, int y) {
		return x + y;
	}
	
	// 정수 3개의 합계
	static int add(int x, int y, int z) {
		return x + y + z;
	}
	
	// 실수 2개의 합계
	static double add(double x, double y) {
		return x + y;
	}
	
	public static void main(String[] args) {
		int a = 10, b = 20, c = 30;
		double d = 3.5, e = 4.3;
		
		System.out.println("a + b = "+ add(a, b));
		System.out.println("a + b + c = " + add(a, b, c));
		System.out.println("d + e = " + add(d, e));
	}

}
