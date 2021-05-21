
public class ExceptionTest03 {
	public static void main(String[] args) {
		int[] a = {95, 88, 75, 66, 82};
		int sum = 0;
		
		// 예외가 발생하는 발생 - 배열의 인덱스가 범위를 벗어남.
		/*
		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
		at ExceptionTest03.main(ExceptionTest03.java:9)
		 */
		for(int i=0; i<=a.length; i++) {
			System.out.println(a[i]);
			sum += a[i];
		}
		
		System.out.println("총점: " + sum);
	}

}
