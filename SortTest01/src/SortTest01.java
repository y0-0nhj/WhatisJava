
public class SortTest01 {
	public static void main(String[] args) {
		int[] a = {50, 70, 20, 10, 30};
		
		System.out.print(" 선택정렬 전: ");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		// 정렬 코드
		for(int i=0; i<a.length-1; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i] < a[j]) {
					// 두 개의 변수의 값을 바꿈 -> swap
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			System.out.printf("%3d회전 후: ", i+1);
			for(int j=0; j<a.length; j++) {
				System.out.print(a[j] + " ");
			}
			System.out.println();
		}
		
		System.out.print(" 선택정렬 후: ");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

}
