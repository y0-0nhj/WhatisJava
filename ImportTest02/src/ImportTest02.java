// 1. 단일형 import
//import java.util.Scanner;
//import java.util.Random;

// 2. on-demand import (주문형)
import java.util.*; // 모든 클래스

public class ImportTest02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		System.out.print("정수 입력(0~9) : ");
		int n = sc.nextInt();
		
		int x = r.nextInt(10); // 0~9 사이의 난수
		
		if(n == x) {
			System.out.println("오늘은 행운이 있는 날입니다.\n로또 복권을 사세요.");
		} else {
			System.out.println("오늘은 평범한 날입니다.\n건강하게 보내세요.");
		}
		
		sc.close();
	}

}
