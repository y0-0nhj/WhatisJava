import java.util.Scanner;

// 예외를 처리하는 방법
// try ~ catch 문을 사용
// 1. try 블럭 : 예외가 발생할수 있는 코드를 넣어둔다.
// 2. catch 블럭 : 예외가 발생했을 때의 처리 방법을 넣어둔다.
// 3. try 블럭의 내용이 정상적으로 실행되면 catch 블럭의 내용은 실행되지 않는다.
// 4. 예외가 발생됭어 catch블럭으로 들어가면 다시 try 블럭으로 돌아갈수는 없다.
// 5. try 블럭에서 발생되는 예외가 여러개라면 catch 블럭을 여러개 만들수도 있다.

public class ExceptionTest02 {
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
		// 예외를 처리하는 방법 - try ~ catch
		try {
			quotient = a / b;	
			remainder = a % b;
			
			System.out.println("몫 : " + quotient);
			System.out.println("나머지 : " + remainder);
		} catch(ArithmeticException e) {
			//System.out.println("0으로 나눌수는 없습니다.");
			//System.err.println("0으로 나눌수는 없습니다.");  // 1번
			//System.err.println(e.getMessage());		// 2번
			e.printStackTrace(); // 3번 - 가장 많이 사용하는 방법
		} 
		
		System.out.println("- Part 2 -");
		System.out.println("예외는 발생해도 일은 계속해야한다.");
		
		sc.close();
	}

}
