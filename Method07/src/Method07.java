import java.util.Scanner;

// 문제) 학생수를 입력받고, 학생의 점수를 입력받아서 총점과 평균, 최고점수, 최저점수를 계산하는 프로그램
// 1차원 배열 활용
// 1. 학생의 점수를 입력받는 메소드 -> inputScore()
// 2. 학생의 총점과 평균을 계산하는 메소드 -> calcTot(), calcAve()
// 3. 학생의 최고점수, 최저점수를 계산하는 메소드 -> calcMax(), calcMin()


public class Method07 {
	static Scanner sc = new Scanner(System.in);
	
	// inputScore()
	static int[] inputScore(int[] a) {
		for(int i=0; i<a.length; i++) {
			System.out.print((i+1) + "번째 학생 점수 입력 : ");
			a[i] = sc.nextInt();
		}
		return a;
	}
	
	// calcTot()
	static int calcTot(int[] a) {
		int tot = 0;
		for(int i=0; i<a.length; i++) {
			tot += a[i];
		}
		return tot;
	}
	
	// calcAve()
	static double calcAve(int[] a) {
		int tot = 0;
		for(int i=0; i<a.length; i++) {
			tot += a[i];
		}
		double ave = (double)tot / a.length;
		return ave;
	}
	
	// calcMax()
	static int calcMax(int[] a) {
		int max = a[0];
		for(int i=1; i<a.length; i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}
	
	// calcMin() 
	static int calcMin(int[] a) {
		int min = a[0];
		for(int i=1; i<a.length; i++) {
			if(a[i] < min) { 
				min = a[i];
			}
		}
		return min;
	}
	
	public static void main(String[] args) {
		
		System.out.print("학생수 입력 : ");
		int n = sc.nextInt();
		
		int[] score = new int[n];
		
		// 입력
		inputScore(score);
		
		// 계산
		int tot = calcTot(score);
		double ave = calcAve(score);
		int max = calcMax(score);
		int min = calcMin(score);
		
		// 출력
		System.out.println("총점 : " + tot);
		System.out.println("평균 : " + ave);
		System.out.println("최고점수 : " + max);
		System.out.println("최저점수 : " + min);
		
		// 오버로딩(Overloading)
		
		sc.close();
	}

}
