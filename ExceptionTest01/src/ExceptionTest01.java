import java.util.Scanner;

// ����(error)�� ����(exception)�� ������

// 1. ����(error) : �����Ͻÿ� �߻��Ǵ� �ɰ��� ����
// 2. ����(exception) : ����ÿ� �߻��Ǵ� ����
// 3. ����ó�� : ���ܰ� �߻��ϴ� ������ �ذ��Ͽ� ���α׷��� ���������� ����ǵ��� �ϴ� ��.
// 4. Exception Ŭ���� : ��� ������ �ֻ��� Ŭ����

// 0���� �������� ���� ����
/* 
Exception in thread "main" java.lang.ArithmeticException: / by zero
at ExceptionTest01.main(ExceptionTest01.java:25)
*/

public class ExceptionTest01 {
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
		quotient = a / b;	
		remainder = a % b;
		
		System.out.println("�� : " + quotient);
		System.out.println("������ : " + remainder);
		
		System.out.println("- Part 2 -");
		System.out.println("���ܴ� �߻��ص� ���� ����ؾ��Ѵ�.");
		
		sc.close();
	}

}
