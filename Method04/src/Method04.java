import java.util.Scanner;

// ����) ���� 1���� �Է¹޾Ƽ� ���Ϻ��� ������ �����ﰡ�� -> �޼ҵ带 Ȱ��

public class Method04 {
	
	// putStar()
	static void putStar(int n) {
		for(int i=1; i<=n; i++) {
			System.out.print("*");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			putStar(i);
//			for(int j=1; j<=i; j++) {
//				System.out.print("*");
//			}
			System.out.println();
		}
		
		sc.close();
	}

}
