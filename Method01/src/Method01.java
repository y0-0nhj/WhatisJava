
// method(�޼ҵ�) : Ư�� ����� �����ϴ� �Լ�

// �޼ҵ带 ����� ��Ģ
// 1. �Ű������� ������ Ÿ���� �ݵ�� ��ġ�ؾ� �Ѵ�.
// 2. ���ϰ��� ����Ÿ���� �ݵ�� ��ġ�ؾ� �Ѵ�.
// 3. ���ϰ��� �ݵ�� 1�� �Ǵ� 0�� ���� �Ѵ�.

public class Method01 {
	public static void main(String[] args) {
		int a = 10, b = 20, c;
		
		c = add(a, b); // �޼ҵ� ȣ�� (���)
		
		System.out.println("�հ� : " + c);
		
		System.out.println(Math.PI);
	}

	// �޼ҵ� ���� (����)
	static int add(int x, int y) {
		int z;
		z = x + y;
		
		return z;
	}
}
