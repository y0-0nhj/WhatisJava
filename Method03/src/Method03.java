import java.util.Scanner;

// ����) x�� y���� ���ϴ� ���α׷�

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
		
		System.out.println("x�� y���� ���ϴ� ���α׷��Դϴ�.");
		System.out.print("x�� �Է�(�Ǽ�) : ");
		double x = sc.nextDouble();
		System.out.print("y�� �Է�(����) : ");
		int y = sc.nextInt();
		
//		for(int i=1; i<=y; i++) {
//			power *= x;
//		}
		power = calcPower(x, y);
		
		System.out.println(x + "�� " + y + "�� : " + power);
		
		sc.close();
	}

}
