import java.util.Scanner;

// ���ܸ� ó���ϴ� ���
// try ~ catch ���� ���
// 1. try �� : ���ܰ� �߻��Ҽ� �ִ� �ڵ带 �־�д�.
// 2. catch �� : ���ܰ� �߻����� ���� ó�� ����� �־�д�.
// 3. try ���� ������ ���������� ����Ǹ� catch ���� ������ ������� �ʴ´�.
// 4. ���ܰ� �߻���� catch������ ���� �ٽ� try ������ ���ư����� ����.
// 5. try ������ �߻��Ǵ� ���ܰ� ��������� catch ���� ������ ������� �ִ�.

public class ExceptionTest02 {
	public static void main(String[] args) {
		// ���ܰ� �߻��� �� �ִ� ��Ȳ
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� a �Է� : ");
		int a = sc.nextInt();
		System.out.print("���� b �Է� : ");
		int b = sc.nextInt();
		
		// a: ������, b: ����
		int quotient = 0;  // ��
		int remainder = 0; // ������
		
		// �������� �ϴ� ��Ȳ - 0���� �������� ����.
		// ���ܸ� ó���ϴ� ��� - try ~ catch
		try {
			quotient = a / b;	
			remainder = a % b;
			
			System.out.println("�� : " + quotient);
			System.out.println("������ : " + remainder);
		} catch(ArithmeticException e) {
			//System.out.println("0���� �������� �����ϴ�.");
			//System.err.println("0���� �������� �����ϴ�.");  // 1��
			//System.err.println(e.getMessage());		// 2��
			e.printStackTrace(); // 3�� - ���� ���� ����ϴ� ���
		} 
		
		System.out.println("- Part 2 -");
		System.out.println("���ܴ� �߻��ص� ���� ����ؾ��Ѵ�.");
		
		sc.close();
	}

}
