import java.util.Scanner;

// 에러(error)와 예외(exception)의 차이점

// 1. 에러(error) : 컴파일시에 발생되는 심각한 오류
// 2. 예외(exception) : 실행시에 발생되는 문제
// 3. 예외처러 : 예외가 발생하는 문제를 해결하여 프로그램이 정상적으로 실행되도록 하는 것.
// 4. Exception 클래스 : 모든 예외의 최상위 클래스

// 0으로 나누었을 때의 예외
/* 
Exception in thread "main" java.lang.ArithmeticException: / by zero
at ExceptionTest01.main(ExceptionTest01.java:25)
*/

public class ExceptionTest01 {
	public static void main(String[] args) {
		// 예외가 발생할 수 있는 상황
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 a 입력 : ");
		int a = sc.nextInt();
		System.out.print("정수 b 입력 : ");
		int b = sc.nextInt();
		
		// a: 피젯수, b: 젯수
		int quotient = 0;  // 몫
		int remainder = 0; // 나머지
		
		// 나눗셈을 하는 상황 - 0으로 나눌수는 없다.
		quotient = a / b;	
		remainder = a % b;
		
		System.out.println("몫 : " + quotient);
		System.out.println("나머지 : " + remainder);
		
		System.out.println("- Part 2 -");
		System.out.println("예외는 발생해도 일은 계속해야한다.");
		
		sc.close();
	}

}
