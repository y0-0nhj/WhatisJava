
public class StringBufferTest01 {
	public static void main(String[] args) {
		// String Ŭ���� Ư¡ - immutable�� ����
		// 1. ���ڿ��� �߰�, ����, ������ �� �ν��Ͻ��� ���� ����
		// 2. ���ڿ��� �߰��ϱ� ���� �ν��Ͻ��� �߰��� ���� �ν��Ͻ��� �ٸ�.
		
		String s1 = "ABC";
		System.out.println(s1);
		System.out.println(System.identityHashCode(s1));
		
		s1 = s1.concat("DEF");
		//s1 += "DEF"; //s1 = s1 + "DEF";
		System.out.println(s1);
		System.out.println(System.identityHashCode(s1));
		System.out.println("----------");
		
		// StringBuffer Ŭ������ Ư¡ - mutable�� ����
		// 1. ���ڿ��� �߰�, ����, ������ �� �ڽ��� �ν��Ͻ��� �״�� �߰�,����,�����Ͽ� �����.
		// 2. ���ڿ��� �߰��ϱ� ���� �ν��Ͻ��� �߰��� ���� �ν��Ͻ��� ����.
		StringBuffer sb1 = new StringBuffer("ABC");
		System.out.println(sb1);
		System.out.println(System.identityHashCode(sb1));
		
		//sb1 += "DEF";" // ����
		sb1.append("DEF");
		System.out.println(sb1);
		System.out.println(System.identityHashCode(sb1));
	}

}
