
public class StringTest02 {
	public static void main(String[] args) {
		// ���ڿ��� �����ϴ� 2�� ���
		String s1 = new String("ABC");
		String s2 = new String("XYZ");
		String s3 = new String("ABC");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println("----------");
		
		// ���ڿ��� �ؽ��ڵ带 ���ؼ� Ȯ���� �� �ν��Ͻ��� �޶� ������ ������ ���� �ؽ��ڵ带 ����ϵ��� �������̵���.
		// �ؽ��ڵ� Ȯ�� 1�� ���
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println("----------");
		
		// �ؽ��ڵ� Ȯ�� 2�� ���
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
	}

}
