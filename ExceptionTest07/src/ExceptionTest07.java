
// 예외처리
// 1. try ~ catch문
// 2. 예외 던짐. throw


public class ExceptionTest07 {
	public static void main(String[] args) {
		try {
			// 예외 발생
			Exception e = new Exception("고의로 예외발생시킴...");
			// 예외 던짐
			throw e;
		} catch(Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
