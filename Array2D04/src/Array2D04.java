
public class Array2D04 {
	public static void main(String[] args) {
		// 1. �迭�� �������� ����, �迭�� ũ�� ����
//		int[][] a;
//		a = new int[3][4];
		
		// 2. �迭�� �������� ����� ũ�� �Ѳ����� ����
//		int[][] a = new int[3][4];
		
		// 3. �迭�� �������� ����� �ʱ�ȭ�� �Ѳ����� ����
//		int[][] a = new int[][] {
//				{95, 85, 77, 65},
//				{88, 74, 66, 92},
//				{75, 84, 96, 83},
//		};
		
		// 4. �迭�� �������� ����, �ʱ�ȭ�� �и��ؼ� ����
		int[][] a;
		a = new int[][] {
				{95, 85, 77, 65},
				{88, 74, 66, 92, 78},
				{75, 84, 96, 83},
		};
		
		// 5. 2���� �迭�� ��� ���� �и��ؼ� ����
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
