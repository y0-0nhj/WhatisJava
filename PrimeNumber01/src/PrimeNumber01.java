import java.util.Scanner;

// ����) ������ 1�� �Է� �޾Ƽ� 2���� �Է¹��� ������ �߿��� �Ҽ��� ����ϰ�, �Ҽ��� ������ ���ϴ� ���α׷�

public class PrimeNumber01 {
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		System.out.print("���� �Է� : ");
		int n = sc.nextInt();
		
		for(int i=2; i<=n; i++) {
			for(int j=2; j<=i; j++) {	
				// ex) i�� 7, j�� 7, i==j
				if(i == j) { 		   // i�� j�� ���ٸ� �Ҽ�
					System.out.print(i + " ");
					++count;
				}
				// ex) i�� 7, j�� 1~6
				if(i%j == 0) { // i�� j�� ������ �������ٸ�
					break;
				}
			}
		}
		
		System.out.println("\n2 ~ " + n + "������ �Ҽ��� ���� : " + count);
		
		
		sc.close();
	}

}
