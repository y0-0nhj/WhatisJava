
public class StringBufferTest04 {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer();
		System.out.println(sb1);
		
		// ���ڿ� �߰�
		sb1.append("Hello Java World!");
		System.out.println(sb1);
		
		// charAt() : �ε����� �ش��ϴ� ���ڸ� Ȯ��
		char c1 = sb1.charAt(6);
		System.out.println(c1);
		char c2 = sb1.charAt(11);
		System.out.println(c2);
		
		// deleteCharAt() : �ε����� �ش��ϴ� �� ���ڸ� ����
		sb1.deleteCharAt(11);
		System.out.println(sb1);
		
		// delete() : �ε����� �ش��ϴ� ���� �Ǵ� ���ڿ��� ����
		sb1.delete(6, 10); // 6������ 10�� �ձ����� ����
		System.out.println(sb1);
		
		// insert() : Ư�� ��ġ�� ���� �Ǵ� ���ڿ��� ����
		// append() : �� �ڿ� ���ڿ��� �߰�,
		sb1.insert(7, "W");
		System.out.println(sb1);
		
		sb1.insert(6, "Java");
		System.out.println(sb1);
		System.out.println("���ڿ� ����: " + sb1.length());
		
		// replace() : Ư�� ��ġ�� ���ڿ��� �����ϴ� �޼ҵ�
		sb1.replace(6, 10, "Android");
		System.out.println(sb1);
		
		sb1.replace(0, 5, "Hi");
		System.out.println(sb1);
		
		sb1.replace(16, 17, "?");
		System.out.println(sb1);
		
		// reverse() : ���ڿ��� �Ųٷ� ������ �����ϴ� �޼ҵ�
		sb1.reverse();
		System.out.println(sb1);
		
		sb1.reverse();
		System.out.println(sb1);
		
		// setCharAt() : �ε����� �ش��ϴ� �� ���ڸ� �����ϴ� �޼ҵ�
		sb1.setCharAt(16, '*');
		System.out.println(sb1);
		
		// substring() : ���ڿ��� �����Ͽ� String������ �����ϴ� �޼ҵ�
		String s1 = sb1.substring(3, 10); // 3������ 10�� �ձ����� ����
		System.out.println(s1);
		
		String s2 = sb1.substring(3);     // 3������ �������� ����
		System.out.println(s2);
		
		String s3 = sb1.substring(0, 2);  // 0������ 2�� �ձ����� ����
		System.out.println(s3);
	}

}
