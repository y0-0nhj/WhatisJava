import java.util.Scanner;

// 문제) 정수 1개를 입력받아서 좌하변이 직각이 직각삼가형 -> 메소드를 활용

public class Method04 {
	
	// putStar()
	static void putStar(int n) {
		for(int i=1; i<=n; i++) {
			System.out.print("*");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
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
