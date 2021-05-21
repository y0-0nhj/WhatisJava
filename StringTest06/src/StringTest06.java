
public class StringTest06 {
	public static void main(String[] args) {
		String s1 = "Hello Java World.hwp";
		//String s1 = "Hello Java World.pdf";
		
		// endsWith() : ������ ���ڿ��� ���������� ����, boolean������ ���
		System.out.println(s1.endsWith("txt"));
		
		// ������ pdf���ϸ� ���ε� �� �� �ֵ��� ���� ����
		if(s1.endsWith("pdf")) {
			System.out.println("���������� ���ε�Ǿ����ϴ�.");
		} else {
			System.out.println("���ε尡 �Ϸ���� �ʾҽ��ϴ�.\n���������� pdf�� �����Ͽ� ���ε� ���ּ���.");
		}
		System.out.println("----------");
		
		// startsWith() : ������ ���ڿ��� �����ϴ����� ����, boolean������ ���
		System.out.println(s1.startsWith("Hello"));
		System.out.println(s1.startsWith("hello"));
		System.out.println("----------");
		
		// indexOf() : ���� �Ǵ� ���ڿ��� �ش��ϴ� �ε����� ����
		System.out.println(s1.indexOf("J"));
		System.out.println(s1.indexOf("Java"));
		System.out.println(s1.indexOf("java")); // -1, �ش� ���ڿ��� ã�� ������ ��, -1�� ���ڿ��� �ε����� ������ �� ����.
		System.out.println("----------");
		
		// lastIndexOf() : ���� �Ǵ� ���ڿ��� �ش��ϴ� ������ �ε����� ����
		String s2 = "java.Object.java.pdf";
		System.out.println(s2.indexOf(".")); // 4, ù��°�� ã�� .�� �ε���
		System.out.println(s2.lastIndexOf(".")); // 16, �������� ã�� .�� �ε���
		System.out.println(s2.indexOf(".", 15)); // 15�� ��ġ�������� .�� ã�� �ε���
		System.out.println(s2.indexOf(".", 5)); // �ι�° .�� �ε���, 5�� ��ġ�������� .�� ã�� �ε���
		
	}

}
