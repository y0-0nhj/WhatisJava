import java.util.Random;

public class MathTest02 {
	public static void main(String[] args) {
		// ������ �����ϴ� ��� : Random Ŭ����, Math.random() �޼ҵ�
		System.out.println("--- 1. Random Ŭ���� ---");
		Random r = new Random();
		int rn1 = r.nextInt(10); // 0 ~ 9���� ������ ���� ����
		System.out.println("rn1 = " + rn1);
		
		int rn2 = r.nextInt(10) + 1; // 1 ~ 10���� ������ ���� ����
		System.out.println("rn2 = " + rn2);
		
		// Math.random() : 0 ~ 1 �̸��� �Ǽ����� ����, 0 ~ 0.9999.....���� ������ ����
		System.out.println("--- 2. Math.random() ---");
		
		// 0 ~ 9���� ������ ����
		int rn3 = (int)(Math.random() * 10);
		System.out.println("rn3 = " + rn3);
		
		// 1 ~ 10���� ������ ����
		int rn4 = (int)(Math.random() * 10) + 1;
		
		System.out.println("--- 3. �ζ� ��ȣ ���� ---");
		// �ζ� ��ȣ : 1 ~ 45 ������ ����
		int lotto1 = (int)(Math.random() * 45) + 1;
		System.out.println("lotto1 = " + lotto1);
		
		int lotto2 = r.nextInt(45) + 1;
		System.out.println("lotto2 = " + lotto2);
		
		System.out.println("--- 4. ������ �����ϴ� ������ ���� �����ϴ� ��� ---");
		// -10 ~ 10 ���� ������ ����
		int rn5 = (int)(Math.random()*(10-(-10)+1)) + (-10);
		System.out.println("rn5 = " + rn5);
		
	}

}
