import java.util.Scanner;

// 문제) 정수 3개를 입력받아서 그 중에서 최댓값과 최솟값을 구하는 프로그램 -> 메소드로 작성

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
		
		System.out.print("정수 a 입력 : ");
		int a = sc.nextInt();
		System.out.print("정수 b 입력 : ");
		int b = sc.nextInt();
		System.out.print("정수 c 입력 : ");
		int c = sc.nextInt();
		
		// 메소드 호출
		int max = calcMax(a, b, c);
		int min = calcMin(a, b, c);
		
		System.out.println("세 정수의 최댓값 : " + max);
		System.out.println("세 정수의 최솟값 : " + min);
		
		sc.close();
	}

}
