
// ���ܸ� ó���ϴ� ���
// 1. try ~ catch
// 2. try ~ catch ~ finally
// 3. try, catch�� �ʼ������� ����ؾ��� 
// 4. catch�� �������� ����� �� �ִ�.
// 5. finally�� ���������� ��� ����
// 6. finally�� ������ �߻������� ������� �ݵ�� �����ؾ߸��ƴ� �ڵ带 �־�д�.

public class ExceptionTest05 {
	public static void main(String[] args) {
		int[] a = {95, 88, 75, 66, 82};
		int sum = 0;
		
		// ���ܰ� �߻��ϴ� �߻� - �迭�� �ε����� ������ ���.
		/*
		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
		at ExceptionTest03.main(ExceptionTest03.java:9)
		 */
		
		// try ~ catch ���� ����Ͽ� ���ܸ� �ذ�
		// finally�� ������ �߻��� ������� �ݵ�� ����ȴ�.
		
		// try ~ catch ~ finally
		// ���ܰ� �߻��Ǿ� catch ������ ���ٸ� �ٽ� try ������ �ǵ��ư����� �ʴ´�.
		// ���ܰ� �߻����� �ʴ´ٸ� : try -> finally
		// ���ܰ� �߻��Ǿ��ٸ�        : try -> catch -> finally
		try {
			for(int i=0; i<=a.length; i++) {
				System.out.println(a[i]);
				sum += a[i];
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} finally {
			System.out.println("����: " + sum);
		}
		
		System.out.println("- Part 2 - ");
		System.out.println("�л����� ������ ���� ó���� �ϰ� �ֽ��ϴ�.");
	}

}
