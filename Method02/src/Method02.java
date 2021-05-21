import java.util.Scanner;

// 문제) 원의 반지름을 입력받아서 원의 면적, 원의 둘레를 구하는 프로그램 -> 메소드로 작성

public class Method02 {
	// Math.PI
	
	// 메소드 정의
	// calcArea() : 원의 면적을 계산하는 메소드
	static double calcArea(double radius) {
		double area = Math.PI * radius * radius;
		return area;
	}
	
	// calcPerimeter() : 원의 둘레를 계산하는 메소드
	static double calcPerimeter(double radius) {
		double perimeter = 2 * Math.PI * radius;
		return perimeter;
	}
	
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		double area = 0.0, perimeter = 0.0;
		
		System.out.print("원의 반지름 입력 : ");
		double radius = sc.nextDouble();
		
		// 메소드 호출
		area = calcArea(radius);
		perimeter = calcPerimeter(radius);
		
		System.out.printf("원의 면적 : %.2f\n원의 둘레 : %.2f\n", area, perimeter);
		
		sc.close();
	}

}
