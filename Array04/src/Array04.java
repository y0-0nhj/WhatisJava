import java.util.Scanner;

// ����) �л����� �Է¹޾Ƽ�, �迭�� ũ�⸦ ���ϰ�, 
// �� ũ�⸸ŭ �л��� ������ �Է¹޾Ƽ�, ������ ����� ����ϴ� ���α׷�

// �Է� ����, ��� ����, 1���� �迭�� Ȱ��
public class Array04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tot = 0;
		double ave = 0;
		
		// �Է� ����
		System.out.print("�л� �� �Է� : ");
		int n = sc.nextInt();
		
		int[] score = new int[n]; // �Է¹��� �л�����ŭ�� �迭
		
		for(int i=0; i<score.length; i++) { // n, score.length: �л���
			System.out.print((i+1) + "��° �л� ���� �Է� : ");
			score[i] = sc.nextInt();
		}
		
		// ��� ����
		for(int i=0; i<score.length; i++) {
			tot += score[i]; // tot = tot + score[i]
		}
		
		ave = (double)tot / score.length;
		
		System.out.printf("���� : %d\n��� : %.2f\n", tot, ave);
		
		sc.close();
	}

}
