import java.util.Scanner;

// ����) �л����� �Է¹ް�, �л��� ������ �Է¹޾Ƽ� ������ ���, �ְ�����, ���������� ����ϴ� ���α׷�
// 1���� �迭 Ȱ��
// 1. �л��� ������ �Է¹޴� �޼ҵ� -> inputScore()
// 2. �л��� ������ ����� ����ϴ� �޼ҵ� -> calcTot(), calcAve()
// 3. �л��� �ְ�����, ���������� ����ϴ� �޼ҵ� -> calcMax(), calcMin()


public class Method07 {
	static Scanner sc = new Scanner(System.in);
	
	// inputScore()
	static int[] inputScore(int[] a) {
		for(int i=0; i<a.length; i++) {
			System.out.print((i+1) + "��° �л� ���� �Է� : ");
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
		
		System.out.print("�л��� �Է� : ");
		int n = sc.nextInt();
		
		int[] score = new int[n];
		
		// �Է�
		inputScore(score);
		
		// ���
		int tot = calcTot(score);
		double ave = calcAve(score);
		int max = calcMax(score);
		int min = calcMin(score);
		
		// ���
		System.out.println("���� : " + tot);
		System.out.println("��� : " + ave);
		System.out.println("�ְ����� : " + max);
		System.out.println("�������� : " + min);
		
		// �����ε�(Overloading)
		
		sc.close();
	}

}
