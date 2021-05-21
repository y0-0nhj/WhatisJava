import java.util.Scanner;

// 문제) x의 y승을 구하는 프로그램

public class Method03 {
	
	// calcPower() 
	static double calcPower(double x, int y) {
		double power = 1;
		for(int i=1; i<=y; i++) {
			power *= x;
		}
		return power;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double power = 0.0;
		
		System.out.println("x의 y승을 구하는 프로그램입니다.");
		System.out.print("x값 입력(실수) : ");
		double x = sc.nextDouble();
		System.out.print("y값 입력(정수) : ");
		int y = sc.nextInt();
		
//		for(int i=1; i<=y; i++) {
//			power *= x;
//		}
		power = calcPower(x, y);
		
		System.out.println(x + "의 " + y + "승 : " + power);
		
		sc.close();
	}

}
