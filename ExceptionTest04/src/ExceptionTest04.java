
public class ExceptionTest04 {
	public static void main(String[] args) {
		int[] a = {95, 88, 75, 66, 82};
		int sum = 0;
		
		// ���ܰ� �߻��ϴ� �߻� - �迭�� �ε����� ������ ���.
		/*
		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
		at ExceptionTest03.main(ExceptionTest03.java:9)
		 */
		
		// try ~ catch ���� ����Ͽ� ���ܸ� �ذ�
		try {
			for(int i=0; i<=a.length; i++) {
				System.out.println(a[i]);
				sum += a[i];
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		System.out.println("����: " + sum);
		
		System.out.println("- Part 2 - ");
		System.out.println("�л����� ������ ���� ó���� �ϰ� �ֽ��ϴ�.");
	}

}
