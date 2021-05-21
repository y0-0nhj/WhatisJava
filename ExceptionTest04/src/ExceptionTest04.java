
public class ExceptionTest04 {
	public static void main(String[] args) {
		int[] a = {95, 88, 75, 66, 82};
		int sum = 0;
		
		// 예외가 발생하는 발생 - 배열의 인덱스가 범위를 벗어남.
		/*
		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
		at ExceptionTest03.main(ExceptionTest03.java:9)
		 */
		
		// try ~ catch 문을 사용하여 예외를 해결
		try {
			for(int i=0; i<=a.length; i++) {
				System.out.println(a[i]);
				sum += a[i];
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		System.out.println("총점: " + sum);
		
		System.out.println("- Part 2 - ");
		System.out.println("학생들의 점수에 대한 처리를 하고 있습니다.");
	}

}
