
// 문제)
// 1. scores 배열을 활용하여 총점을 구하시오.
// 2. 발생하는 예외를 확인하고, 이를 해결하여 총점을 출력하시오.

/*
Exception in thread "main" java.lang.NumberFormatException: For input string: "3.141592"
	at java.lang.NumberFormatException.forInputString(Unknown Source)
	at java.lang.Integer.parseInt(Unknown Source)
	at java.lang.Integer.parseInt(Unknown Source)
	at ExceptionTest06.main(ExceptionTest06.java:12)
*/

public class ExceptionTest06 {
	public static void main(String[] args) {
		String[] scores = {"95", "87", "66", "77", "83", "3.141592"};
		int tot = 0;
		
		try {
			for(int i=0; i<scores.length; i++) {
				tot += Integer.parseInt(scores[i]);
			}
		} catch(NumberFormatException e) {
			System.err.println("문자열을 정수로 변환하는 과정에서 예외가 발생하였습니다.");
		} finally {
		    System.out.println("총점: " + tot);
		}
		
		System.out.println("- Part 2 -");
		System.out.println("이 후로도 시스템은 정상적으로 동작하여야 합니다.");
		
	}

}
