
public class StringBufferTest02 {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("ABC");
		StringBuffer sb2 = new StringBuffer("ABC");
		
		System.out.println(sb1);
		System.out.println(sb2);
		System.out.println("----------");
		System.out.println(System.identityHashCode(sb1));
		System.out.println(System.identityHashCode(sb2));
		System.out.println("----------");
		
		if(sb1 == sb2) { // ������ ��
			System.out.println("�� ���ڿ��� ������ �����ϴ�.");
		} else {
			System.out.println("�� ���ڿ��� ������ �ٸ��ϴ�.");
		}
		
		// equals() : Object Ŭ������ ����, ������ ���ϴ� �޼ҵ�
		// String Ŭ������ equals() : ������ ���ϵ��� �������̵��� �޼ҵ�
		// StringBuffer Ŭ���� equals() : Object Ŭ�����κ��� ��ӹ��� �޼ҵ�
		// ������ : Object Ŭ������ equals()�� �״�� ����ϹǷ� ������ ���ϴ� ���� �ƴ϶� ������ ���ϴ� ��.
		if(sb1.equals(sb2)) { // ������ ���ϴ� ���� �ƴ϶� ������ ���ϴ� ��.
			System.out.println("�� ���ڿ��� ������ �����ϴ�.");
		} else {
			System.out.println("�� ���ڿ��� ������ �ٸ��ϴ�.");
		}
		System.out.println("----------");
		
		// �ذ�å : StringBuffer���� String������ ������ �Ŀ� �� 
		String s1 = sb1.toString();
		String s2 = sb2.toString();
		
		if(s1.equals(s2)) {
		//if(sb1.toString().equals(sb2.toString())) {
			System.out.println("�� ���ڿ��� ������ �����ϴ�.");
		} else {
			System.out.println("�� ���ڿ��� ������ �ٸ��ϴ�.");
		}
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		
		
	}

}
