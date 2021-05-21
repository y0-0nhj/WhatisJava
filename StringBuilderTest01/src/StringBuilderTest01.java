
// StringBuilder Ŭ������ ����� StringBuffer Ŭ������ ��ɰ� ���� �Ȱ���.
// StringBuilder Ŭ������ ���� ���� -> ������: ������(Thread)�� ����� �־ ������ ���ϰ� �߻�
// -> �̷��� �������� ����, ������ ����� �����Ͽ� ������ ����Ų StringBuffer Ŭ������ �����ϰԵ�.

public class StringBuilderTest01 {
	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder();
		
		System.out.println(sb1);
		System.out.println("�뷮: " + sb1.capacity());
		System.out.println("ũ��: " + sb1.length());
		
		sb1.append("Hello Java World!");
		System.out.println(sb1);
		System.out.println("�뷮: " + sb1.capacity());
		System.out.println("ũ��: " + sb1.length());
		
	}

}
