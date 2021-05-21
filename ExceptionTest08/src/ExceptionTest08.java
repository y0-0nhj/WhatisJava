
public class ExceptionTest08 {
	public static void main(String[] args) /*throws Exception*/ {
		//method1();
		try {
			method1();
		} catch(Exception e) {
			System.err.println("main에서 예외가 처리되었습니다.");
		}
	}
	
	public static void method1() throws Exception {
		method2();
//		try {
//			method2();
//		} catch(Exception e) {
//			System.err.println("method1에서 예외가 처리되었습니다.");
//		}
	}
	
	public static void method2() throws Exception { // 2. 예외를 이 메소드를 호출한 곳으로 던짐.
		// 예외가 발행되었음.
		throw new Exception("method2에서 예외발생...");
		
		// 1. 예외가 발생한 메소드에서 예외를 처리하는 경우
//		try {
//			throw new Exception("method2에서 예외발생...");
//		} catch(Exception e) {
//			System.err.println("method2에서 예외가 처리되었습니다.");
//		}
	}

}
