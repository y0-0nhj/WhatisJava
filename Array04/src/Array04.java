import java.util.Scanner;

// 문제) 학생수를 입력받아서, 배열의 크기를 정하고, 
// 그 크기만큼 학생의 점수를 입력받아서, 총점과 평균을 계산하는 프로그램

// 입력 설계, 출력 설계, 1차원 배열의 활용
public class Array04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tot = 0;
		double ave = 0;
		
		// 입력 설계
		System.out.print("학생 수 입력 : ");
		int n = sc.nextInt();
		
		int[] score = new int[n]; // 입력받은 학생수만큼의 배열
		
		for(int i=0; i<score.length; i++) { // n, score.length: 학생수
			System.out.print((i+1) + "번째 학생 점수 입력 : ");
			score[i] = sc.nextInt();
		}
		
		// 출력 설계
		for(int i=0; i<score.length; i++) {
			tot += score[i]; // tot = tot + score[i]
		}
		
		ave = (double)tot / score.length;
		
		System.out.printf("총점 : %d\n평균 : %.2f\n", tot, ave);
		
		sc.close();
	}

}
