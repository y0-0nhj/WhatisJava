
// ����ó��
// 1. try ~ catch��
// 2. ���� ����. throw


public class ExceptionTest07 {
	public static void main(String[] args) {
		try {
			// ���� �߻�
			Exception e = new Exception("���Ƿ� ���ܹ߻���Ŵ...");
			// ���� ����
			throw e;
		} catch(Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
