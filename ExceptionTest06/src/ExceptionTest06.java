
// ����)
// 1. scores �迭�� Ȱ���Ͽ� ������ ���Ͻÿ�.
// 2. �߻��ϴ� ���ܸ� Ȯ���ϰ�, �̸� �ذ��Ͽ� ������ ����Ͻÿ�.

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
			System.err.println("���ڿ��� ������ ��ȯ�ϴ� �������� ���ܰ� �߻��Ͽ����ϴ�.");
		} finally {
		    System.out.println("����: " + tot);
		}
		
		System.out.println("- Part 2 -");
		System.out.println("�� �ķε� �ý����� ���������� �����Ͽ��� �մϴ�.");
		
	}

}
