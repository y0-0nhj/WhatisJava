
public class StringBufferTest03 {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer();
		
		// capacity() : �뷮�� �˷��ִ� �޼ҵ�
		// �ʱ� �뷮 : 16, 16 -> 34 -> 70, 18�� ����� ����
		// length() : ũ�⸦ �˷��ִ� �޼ҵ�
		System.out.println("�뷮: " + sb1.capacity()); // 16
		System.out.println("ũ��: " + sb1.length());   // 0
		
		// 
		sb1.append("ABC");
		System.out.println(sb1);
		sb1.append(10);
		System.out.println(sb1);
		sb1.append(3.14);
		System.out.println(sb1);
		sb1.append(true);
		System.out.println(sb1);
		// �޼ҵ� ü�̴� (method chainning)
		sb1.append("Hell0").append("Java").append("World").append("!");
		//sb1.append("Hell0").append("Java").append("World").append("!");
		System.out.println(sb1);
		System.out.println("----------");
		
		System.out.println("ũ��: " + sb1.length());
		System.out.println("�뷮: " + sb1.capacity());
	}

}
