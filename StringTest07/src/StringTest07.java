
public class StringTest07 {
	public static void main(String[] args) {
		String s1 = "Hello Java World!";
		
		// length() : ���ڿ��� ���̸� �˷��ִ� �޼ҵ�
		System.out.println(s1.length());
		
		// replace() : �õ� ���ڿ��� ���ο� ���ڿ��� �����ϴ� �޼ҵ�
		s1 = s1.replace("!", "*");
		System.out.println(s1);
		
		s1 = s1.replace("Java", "Android");
		System.out.println(s1);
		
		s1 = s1.replace("l", "L");
		System.out.println(s1); // ��ü ���ڰ� �����
		
		// replaceFirst() : ù��°�� ������ �õ� ���ڿ��� ���ο� ���ڿ��� �����ϴ� �޼ҵ�
		s1 = s1.replaceFirst("d", "D");
		System.out.println(s1);
		
		// split() : ���ڿ��� Ư������(������)�� �и��Ͽ� ���ڿ� �迭�� �����ϴ� �޼ҵ�
		String s2 = "lion,tiger,bear,eagle,monkey,elephant";
		String[] animals = s2.split(",");
		
		// �⺻ for��
		for(int i=0; i<animals.length; i++) {
			System.out.println(animals[i]);
		}
		System.out.println("----------");
		
		// for-in��
		for(String s : animals) {
			System.out.println(s);
		}
		
	}

}
