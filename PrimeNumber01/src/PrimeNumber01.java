import java.util.Scanner;

// 문제) 정수를 1개 입력 받아서 2부터 입력받은 수까지 중에서 소수를 출력하고, 소수의 개수를 구하는 프로그램

public class PrimeNumber01 {
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		
		for(int i=2; i<=n; i++) {
			for(int j=2; j<=i; j++) {	
				// ex) i가 7, j가 7, i==j
				if(i == j) { 		   // i가 j와 같다면 소수
					System.out.print(i + " ");
					++count;
				}
				// ex) i가 7, j는 1~6
				if(i%j == 0) { // i를 j로 나누어 떨어진다면
					break;
				}
			}
		}
		
		System.out.println("\n2 ~ " + n + "까지의 소수의 개수 : " + count);
		
		
		sc.close();
	}

}
