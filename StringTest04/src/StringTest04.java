
public class StringTest04 {
	public static void main(String[] args) {
		String s1 = null;
		String s2 = "";
		
		System.out.println("s1 = " + s1); // null ���� - �ƹ����� �����ϰ� ���� ���� ����
		System.out.println("s2 = " + s2); // ���ڿ��� �����ϰ� �ִ� ����
		//System.out.println(s1.hashCode()); // ���� - �ν��Ͻ��� �����Ƿ� �ؽ��ڵ嵵 ����.
		System.out.println(s2.hashCode());
		System.out.println(System.identityHashCode(s2));
		System.out.println("----------");
		
		char[] c = new char[] {'H', 'e', 'l', 'l', 'o'}; // ������ �迭
		String s3 = new String(c);
		System.out.println(s3);
	}

}
