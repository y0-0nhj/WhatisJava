import java.util.Random;

// 0, 100, 200, 300, 400, 500, 600, 700, 800, 900 중에서 임의로 하나의 값을 생성해서 클래스 변수에 초기화하는 프로그램

// 500이 난수로 설정되면, 인스턴스의 id값은 501, 502, 503, 504 ......
class RandomId {
	private static int count = 0; 	// 클래스 변수, static field
	private int id = 0;				// 인스턴스 변수, non-static field
	
	// 클래스 초기자(initializeer), static 초기자, 정적 초기자
	// - 최초로 생성자가 호출되기 직전에 딱 한번만 호출함.
	static {
		Random r = new Random();
		count = r.nextInt(10) * 100;
	}
	
	public RandomId() {
		id = ++count;
	}
	
	// getter
	public int getId() {
		return id;
	}
}

public class RandomIdTest01 {
	public static void main(String[] args) {
//		Random r = new Random();
//		int n = r.nextInt(10) * 100; // 10 : seed 값, 0 ~ 9 사이의 값을 난수롤 생성
//		System.out.println("오늘의 행운의 숫자는 " + n + "입니다.");
		
		RandomId a = new RandomId();
		RandomId b = new RandomId();
		RandomId c = new RandomId();
		
		System.out.println("a' id = " + a.getId());
		System.out.println("b' id = " + b.getId());
		System.out.println("c' id = " + c.getId());
	}

}
