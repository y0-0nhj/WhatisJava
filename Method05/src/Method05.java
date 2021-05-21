import java.util.Scanner;

// 문제) 정수 1개와 문자 1개를 입력받아서, 좌하변이 직각인 직각삼각형을 입력된 문자로 출력하는 프로그램
// 정수 입력 : 5
// 문자 입력 : @
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
		
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		System.out.print("문자 입력 : ");
		char c = sc.next().charAt(0);
		
		for(int i=1; i<=n; i++) {
			putChar(i, c);
			System.out.println();
		}
		
		
		sc.close();
	}

}
