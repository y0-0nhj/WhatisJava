// �����ε�(Overloading)

public class Overloading01 {
	// �ڹٿ����� �Ȱ��� �̸��� �޼ҵ带 ������ ����� ����� �� ������?
	// �ִ�
	
	// ���� 2���� �հ�
	static int add(int x, int y) {
		return x + y;
	}
	
	// ���� 3���� �հ�
	static int add(int x, int y, int z) {
		return x + y + z;
	}
	
	// �Ǽ� 2���� �հ�
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
