import java.util.Scanner;

// ����) ���� 3���� �Է¹޾Ƽ� �� �߿��� �ִ񰪰� �ּڰ��� ���ϴ� ���α׷� -> �޼ҵ�� �ۼ�

public class Method06 {
	
	// calcMax()
	static int calcMax(int x, int y, int z) {
		int max = x;
		
		if(y > max) {
			max = y;
		}
		
		if(z > max) {
			max = z;
		}
		
		return max;
	}
	
	// calcMin()
	static int calcMin(int x, int y, int z) {
		int min = x;
		
		if(y < min) {
			min = y;
		}
		
		if(z < min) { 
			min = z;
		}
		
		return min;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� a �Է� : ");
		int a = sc.nextInt();
		System.out.print("���� b �Է� : ");
		int b = sc.nextInt();
		System.out.print("���� c �Է� : ");
		int c = sc.nextInt();
		
		// �޼ҵ� ȣ��
		int max = calcMax(a, b, c);
		int min = calcMin(a, b, c);
		
		System.out.println("�� ������ �ִ� : " + max);
		System.out.println("�� ������ �ּڰ� : " + min);
		
		sc.close();
	}

}
