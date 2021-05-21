
public class Array2D04 {
	public static void main(String[] args) {
		// 1. 배열의 참조변수 선언, 배열의 크기 설정
//		int[][] a;
//		a = new int[3][4];
		
		// 2. 배열의 참조변수 선언과 크기 한꺼번에 설정
//		int[][] a = new int[3][4];
		
		// 3. 배열의 참조변수 선언과 초기화를 한꺼번에 설정
//		int[][] a = new int[][] {
//				{95, 85, 77, 65},
//				{88, 74, 66, 92},
//				{75, 84, 96, 83},
//		};
		
		// 4. 배열의 참조변수 선언, 초기화를 분리해서 설정
		int[][] a;
		a = new int[][] {
				{95, 85, 77, 65},
				{88, 74, 66, 92, 78},
				{75, 84, 96, 83},
		};
		
		// 5. 2차원 배열의 행과 열을 분리해서 설정
//		int[][] a;
//		a = new int[3][];
//		a[0] = new int[4]; 
//		a[1] = new int[4];
//		a[2] = new int[4];
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.printf("%4d", a[i][j]);
			}
			System.out.println();
		}
		
	}

}
