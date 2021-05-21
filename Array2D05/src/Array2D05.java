// ����) 5���� �� �ݿ� ���� �л��� ����, ����, ����� ����Ͻÿ�.

// ����)
// 1. ��ü ����, ��ü ����� ����Ͻÿ�.
// 2. ���� ������ �Է¹ް�, �� ���� �л����� �Է¹ް�,
// �� �ݿ� �л��� ������ �Է¹޾Ƽ� ����, ����� ����Ͻÿ�.

public class Array2D05 {
	public static void main(String[] args) {
		// 5�� 3���� 2���� �迭, �ʱ�ȭ
		int[][] score = {
				{93, 93, 92}, // 1�� : 3��
				{85, 85, 86}, // 2�� : 3��
				{71, 71, 72}, // 3�� : 3��
				{68, 68, 67}, // 4�� : 3��
				{83, 83, 82}, // 5�� : 3��
		};
		
		// ��� ����
		int[] tot = new int[score.length];       // �� ���� ����
		double[] ave = new double[score.length]; // �� ���� ���
		
		// �� ���� ����, ��� ���
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				tot[i] += score[i][j];
				ave[i] = (double)tot[i] / 3;
			}
		}
		
		// ���
		System.out.println("��   |  1��   2��   3��  |  ����  | ���");
		System.out.println("--------------------------------");
		for(int i=0; i<score.length; i++) {
			System.out.print((i+1) + "�� |");
			for(int j=0; j<score[i].length; j++) {
				System.out.printf("%4d", score[i][j]);
			}
			System.out.printf(" |%5d |%7.2f\n", tot[i], ave[i]);
		}
		
		
		// ��
	}

}
