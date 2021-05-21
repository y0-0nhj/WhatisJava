
public class StringTest01 {
	public static void main(String[] args) {
		// ���ڿ��� �����ϴ� 1�� ���
		String s1 = "ABC";
		String s2 = "XYZ";
		String s3 = "ABC"; // ������ �ִ� ���ڿ� ����, ���ο� ���ڿ��� �����ϴ� ���� �ƴ�, �޸𸮸� ȿ�������� ����ϱ� ����
		String s4 = "DEF";
		
		// JVM(Java Virtual Machine, �ڹ� ���� ���) - �޸𸮸� ����
		// GC(Garbage Collector) 
		// Garbage Collection - �޸𸮿��� ����Ǵ� �ڿ��� ȸ���ؼ� ��Ȱ���� �� �ְ� ���ִ� ��
		s4 = s1;
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println("----------");
		
		// �ؽ��ڵ�(hashcode) - �� �ν��Ͻ��� ������ ������ ���̵�
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		System.out.println("----------");
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));
	}

}
