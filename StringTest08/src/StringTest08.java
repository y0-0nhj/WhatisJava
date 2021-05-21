
public class StringTest08 {
	public static void main(String[] args) {
		String s1 = "Hello Java World!";
		
		// substring() : ���ڿ��� �����ϴ� �޼ҵ�
		String s2 = s1.substring(6); // 6������ ������ ����
		System.out.println(s2);
		
		String s3 = s1.substring(6, 10); // 6������ 10�� �ձ��� ����(6������ 9������)
		System.out.println(s3);
		
		String s4 = s1.substring(11); // 11������ ������ ����
		System.out.println(s4);
		
		String s5 = s1.substring(11, 17); // 11������ 17�� �ձ��� ����(11������ 16������)
		System.out.println(s5);
		
		// toLowerCase() : ��� ���ڿ��� �ҹ��ڷ� �����ϴ� �޼ҵ�
		String s6 = s1.toLowerCase();
		System.out.println(s6);
		
		// toUpperCase() : ��� ���ڿ��� �빮�ڷ� �����ϴ� �޼ҵ�
		String s7 = s1.toUpperCase();
		System.out.println(s7);
		
		// trim() : ���ڿ��� �� �հ� �� ���� ������ �����ϴ� �޼ҵ�
		String s8 = "    Hello     Java     ";
		System.out.println(s8 + "#");
		
		String s9 = s8.trim();
		System.out.println(s9 + "@");
		
	}

}
