import java.util.Scanner;

// ����) ���� 1���� ���� 1���� �Է¹޾Ƽ�, ���Ϻ��� ������ �����ﰢ���� �Էµ� ���ڷ� ����ϴ� ���α׷�
// ���� �Է� : 5
// ���� �Է� : @
// @
// @@
// @@@
// @@@@
// @@@@@

public class Method05 {
	// putChar()
	static void putChar(int n, char c) {
		for(int i=1; i<=n; i++) {
			System.out.print(c);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int n = sc.nextInt();
		System.out.print("���� �Է� : ");
		char c = sc.next().charAt(0);
		
		for(int i=1; i<=n; i++) {
			putChar(i, c);
			System.out.println();
		}
		
		
		sc.close();
	}

}
