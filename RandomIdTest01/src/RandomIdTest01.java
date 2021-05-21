import java.util.Random;

// 0, 100, 200, 300, 400, 500, 600, 700, 800, 900 �߿��� ���Ƿ� �ϳ��� ���� �����ؼ� Ŭ���� ������ �ʱ�ȭ�ϴ� ���α׷�

// 500�� ������ �����Ǹ�, �ν��Ͻ��� id���� 501, 502, 503, 504 ......
class RandomId {
	private static int count = 0; 	// Ŭ���� ����, static field
	private int id = 0;				// �ν��Ͻ� ����, non-static field
	
	// Ŭ���� �ʱ���(initializeer), static �ʱ���, ���� �ʱ���
	// - ���ʷ� �����ڰ� ȣ��Ǳ� ������ �� �ѹ��� ȣ����.
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
//		int n = r.nextInt(10) * 100; // 10 : seed ��, 0 ~ 9 ������ ���� ������ ����
//		System.out.println("������ ����� ���ڴ� " + n + "�Դϴ�.");
		
		RandomId a = new RandomId();
		RandomId b = new RandomId();
		RandomId c = new RandomId();
		
		System.out.println("a' id = " + a.getId());
		System.out.println("b' id = " + b.getId());
		System.out.println("c' id = " + c.getId());
	}

}
