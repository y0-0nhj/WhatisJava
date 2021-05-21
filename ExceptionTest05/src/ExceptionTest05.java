
// 예외를 처리하는 방법
// 1. try ~ catch
// 2. try ~ catch ~ finally
// 3. try, catch는 필수적으로 사용해야함 
// 4. catch는 여러개를 사용할 수 있다.
// 5. finally는 선택적으로 사용 가능
// 6. finally는 예외의 발생유무와 상관없이 반드시 실행해야만아는 코드를 넣어둔다.

public class ExceptionTest05 {
	public static void main(String[] args) {
		int[] a = {95, 88, 75, 66, 82};
		int sum = 0;
		
		// 예외가 발생하는 발생 - 배열의 인덱스가 범위를 벗어남.
		/*
		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
		at ExceptionTest03.main(ExceptionTest03.java:9)
		 */
		
		// try ~ catch 문을 사용하여 예외를 해결
		// finally는 예외의 발생과 상관없이 반드시 실행된다.
		
		// try ~ catch ~ finally
		// 예외가 발생되어 catch 블럭으로 들어갔다면 다시 try 블럭으로 되돌아가지는 않는다.
		// 예외가 발생하지 않는다면 : try -> finally
		// 예외가 발생되었다면        : try -> catch -> finally
		try {
			for(int i=0; i<=a.length; i++) {
				System.out.println(a[i]);
				sum += a[i];
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} finally {
			System.out.println("총점: " + sum);
		}
		
		System.out.println("- Part 2 - ");
		System.out.println("학생들의 점수에 대한 처리를 하고 있습니다.");
	}

}
