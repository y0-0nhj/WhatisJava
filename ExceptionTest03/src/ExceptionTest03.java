
public class ExceptionTest03 {
	public static void main(String[] args) {
		int[] a = {95, 88, 75, 66, 82};
		int sum = 0;
		
		// ���ܰ� �߻��ϴ� �߻� - �迭�� �ε����� ������ ���.
		/*
		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
		at ExceptionTest03.main(ExceptionTest03.java:9)
		 */
		for(int i=0; i<=a.length; i++) {
			System.out.println(a[i]);
			sum += a[i];
		}
		
		System.out.println("����: " + sum);
	}

}
