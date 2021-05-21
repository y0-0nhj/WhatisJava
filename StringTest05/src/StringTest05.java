
public class StringTest05 {
	public static void main(String[] args) {
		String s1 = "Hello Java World!";
		
		// charAt() : �ε����� �ش��ϴ� �� ���ڸ� ���� (0���� ����)
		char c1 = s1.charAt(6);
		System.out.println(c1);
		
		char c2 = s1.charAt(11);
		System.out.println(c2);
		
		// concat() : ���ڿ��� �����ϴ� �޼ҵ�
		String s2 = "Korea";
		//s1.concat(s2);
		System.out.println(s1.concat(s2));
		
		// String Ŭ���� : immutable�� ������ ����
		s1 = s1.concat(s2); 
		System.out.println(s1); // Hello Java World!Korea
		
		// contains() : ���� �Ǵ� ���ڿ��� ���� ����, ����� boolean���� ��.
		System.out.println(s1.contains("J"));
		System.out.println(s1.contains("Java"));
		System.out.println(s1.contains("java"));
		System.out.println(s1.contains("Korea"));
		System.out.println(s1.contains("korea"));
	}

}
