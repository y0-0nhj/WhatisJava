
public class ForIn01 {
	public static void main(String[] args) {
		int[] a = {85, 87, 65, 92, 76};
		
		// 출력하는 방법
		// 1번 - 기본 for문
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		// 2번 - for-in문, for-each문, enhanced for문, 향상된 for문, 확장 for문
		// 1. 무조건 처음부터 끝까지  실행.
		// 2. 인덱스를 사용하는 것이 아님.
		for(int i : a) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

}
