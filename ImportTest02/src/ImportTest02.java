// 1. ������ import
//import java.util.Scanner;
//import java.util.Random;

// 2. on-demand import (�ֹ���)
import java.util.*; // ��� Ŭ����

public class ImportTest02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		System.out.print("���� �Է�(0~9) : ");
		int n = sc.nextInt();
		
		int x = r.nextInt(10); // 0~9 ������ ����
		
		if(n == x) {
			System.out.println("������ ����� �ִ� ���Դϴ�.\n�ζ� ������ �缼��.");
		} else {
			System.out.println("������ ����� ���Դϴ�.\n�ǰ��ϰ� ��������.");
		}
		
		sc.close();
	}

}
