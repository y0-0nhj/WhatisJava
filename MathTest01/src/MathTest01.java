
// Math Ŭ����
// - ���п� ���� �پ��� ���, �޼ҵ带 ���� �ִ� Ŭ����
// - Math Ŭ���� �ȿ� �ִ� ���� Ŭ���� ���, Ŭ���� �޼ҵ常 ����
// - Math Ŭ������ final�� ����Ǿ�  ����.
public class MathTest01 {
	public static void main(String[] args) {
		System.out.println("1. ----------");
		System.out.println(Math.abs(-11));
		System.out.println(Math.sqrt(16)); // 4.0
		System.out.println(Math.pow(2, 3)); // 8.0, 2�� 3��
		System.out.println(Math.PI); // 3.141592653589793
		System.out.println(Math.ceil(10.1)); // 11.0, �ø�
		System.out.println(Math.floor(10.9)); // 10.0, ����
		System.out.println(Math.round(10.5)); // 11, ������ �ݿø�
		System.out.println(Math.round(10.4)); // 10, ������ �ݿø�
		System.out.println(Math.max(10, 20)); // 20, �ִ�
		System.out.println(Math.max(3.5, 7.7)); // 7.7, �ִ�
		System.out.println(Math.max(10, Math.max(20, 30))); // 30, �������� ���� ���� ��ø�ؼ� ���
		System.out.println(Math.min(10,  20)); // 10, �ּڰ�
		System.out.println(Math.min(5.5,  4.4)); // 4.4, �ּڰ�
		System.out.println(Math.min(75, Math.min(27, 35))); // 27, �������� ���� ���� ��ø�ؼ� ���
		System.out.println("2. ----------");
		// rint() : ����� �������� ����, �� �� �߰�(.5)�� ���� ¦������ ����
		System.out.println(Math.rint(1.4)); // 1.0
		System.out.println(Math.rint(1.6)); // 2.0
		System.out.println("-----");
		System.out.println(Math.rint(0.5)); // 0.0
		System.out.println(Math.rint(1.5)); // 2.0
		System.out.println(Math.rint(2.5)); // 2.0
		System.out.println(Math.rint(3.5)); // 4.0
		System.out.println(Math.rint(4.5)); // 4.0
		System.out.println(Math.rint(5.5)); // 6.0
		System.out.println(Math.rint(6.5)); // 6.0
		System.out.println(Math.rint(7.5)); // 8.0
		System.out.println(Math.rint(8.5)); // 8.0
		System.out.println(Math.rint(9.5)); // 10.0 
		System.out.println(Math.rint(10.5)); // 10.0
		// round() : �Ҽ��� ù��° �ڸ����� �ݿø��Ͽ� 1�� �ڸ��� ǥ��
		System.out.println("3. ----------");
		System.out.println(Math.round(0.5));
		System.out.println(Math.round(1.5));
		System.out.println(Math.round(2.5));
		System.out.println(Math.round(3.5));
		System.out.println(Math.round(4.5));
		System.out.println(Math.round(5.5));
		System.out.println(Math.round(6.5));
		System.out.println(Math.round(7.5));
		System.out.println(Math.round(8.5));
		System.out.println(Math.round(9.5));
		System.out.println(Math.round(10.5));
		System.out.println("4. ----------");
		// round() �Լ��� ����Ͽ� �ݿø��� �ڸ����� �����ϴ� ���
		double n = 90.7552;
		// �Ҽ��� ��°�ڸ������� ����
		// 9075.52
		//double n2 = Math.round(n*10) / 10.0; // �Ҽ��� ù°�ڸ����� ����
		double n2 = Math.round(n*100) / 100.0; // �Ҽ��� ��°�ڸ����� ����
		//double n2 = Math.round(n*1000) / 1000.0; // �Ҽ��� ��°�ڸ����� ����
		System.out.println("n = " + n);
		System.out.println("n2 = " + n2);
	
		// end
	}

}
