
public class ExceptionTest08 {
	public static void main(String[] args) /*throws Exception*/ {
		//method1();
		try {
			method1();
		} catch(Exception e) {
			System.err.println("main���� ���ܰ� ó���Ǿ����ϴ�.");
		}
	}
	
	public static void method1() throws Exception {
		method2();
//		try {
//			method2();
//		} catch(Exception e) {
//			System.err.println("method1���� ���ܰ� ó���Ǿ����ϴ�.");
//		}
	}
	
	public static void method2() throws Exception { // 2. ���ܸ� �� �޼ҵ带 ȣ���� ������ ����.
		// ���ܰ� ����Ǿ���.
		throw new Exception("method2���� ���ܹ߻�...");
		
		// 1. ���ܰ� �߻��� �޼ҵ忡�� ���ܸ� ó���ϴ� ���
//		try {
//			throw new Exception("method2���� ���ܹ߻�...");
//		} catch(Exception e) {
//			System.err.println("method2���� ���ܰ� ó���Ǿ����ϴ�.");
//		}
	}

}
