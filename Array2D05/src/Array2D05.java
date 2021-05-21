// 문제) 5개의 각 반에 대한 학생의 점수, 총점, 평균을 출력하시오.

// 과제)
// 1. 전체 총점, 전체 평균을 출력하시오.
// 2. 반의 개수를 입력받고, 각 반의 학생수를 입력받고,
// 각 반에 학생의 점수도 입력받아서 총점, 평균을 출력하시오.

public class Array2D05 {
	public static void main(String[] args) {
		// 5행 3열의 2차원 배열, 초기화
		int[][] score = {
				{93, 93, 92}, // 1반 : 3명
				{85, 85, 86}, // 2반 : 3명
				{71, 71, 72}, // 3반 : 3명
				{68, 68, 67}, // 4반 : 3명
				{83, 83, 82}, // 5반 : 3명
		};
		
		// 출력 설계
		int[] tot = new int[score.length];       // 각 반의 총점
		double[] ave = new double[score.length]; // 각 반의 평균
		
		// 각 반의 총점, 평균 계산
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				tot[i] += score[i][j];
				ave[i] = (double)tot[i] / 3;
			}
		}
		
		// 출력
		System.out.println("반   |  1번   2번   3번  |  총점  | 평균");
		System.out.println("--------------------------------");
		for(int i=0; i<score.length; i++) {
			System.out.print((i+1) + "반 |");
			for(int j=0; j<score[i].length; j++) {
				System.out.printf("%4d", score[i][j]);
			}
			System.out.printf(" |%5d |%7.2f\n", tot[i], ave[i]);
		}
		
		
		// 끝
	}

}
