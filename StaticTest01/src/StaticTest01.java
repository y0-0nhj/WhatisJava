
// �ν��Ͻ� �޼ҵ�� Ŭ���� �޼ҵ��� ���� ���� ����
// �ν��Ͻ� �޼ҵ忡���� �ν��Ͻ� ����, �ν��Ͻ� �޼ҵ�, Ŭ���� ����, Ŭ���� �޼ҵ忡 ��� ��� ����
// Ŭ���� �޼ҵ忡���� Ŭ���� ����, Ŭ���� �޼ҵ�� ��� �����ϱ⸸, �ν��Ͻ� ����, �ν��Ͻ� �޼ҵ�� ��� �Ұ�

class Static {
	private static int s;	// Ŭ���� ����
	private int i;			// �ν��Ͻ� ����
	
	public static void sm1() { }	// Ŭ���� �޼ҵ�
	public void im1() { }			// �ν��Ͻ� �޼ҵ�
	
	// Ŭ���� �޼ҵ� ��� ����
	public static void sm2(int x) { // Ŭ���� �޼ҵ�
		s = x;
		//i = x; // Ŭ���� �޼ҵ忡���� �ν��Ͻ� ������ ���� �Ұ�
		sm1();
		//im1(); // Ŭ���� �޼ҵ忡���� �ν��Ͻ� �޼ҵ忡 ���� �Ұ�
	}
	
	// �ν��Ͻ� �޼ҵ� ��� ����
	public void im2(int x) {		// �ν��Ͻ� �޼ҵ�
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
