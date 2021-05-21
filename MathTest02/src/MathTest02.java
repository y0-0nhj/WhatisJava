import java.util.Random;

public class MathTest02 {
	public static void main(String[] args) {
		// 난수를 생성하는 방법 : Random 클래스, Math.random() 메소드
		System.out.println("--- 1. Random 클래스 ---");
		Random r = new Random();
		int rn1 = r.nextInt(10); // 0 ~ 9까지 사이의 난수 생성
		System.out.println("rn1 = " + rn1);
		
		int rn2 = r.nextInt(10) + 1; // 1 ~ 10까지 사이의 난수 생성
		System.out.println("rn2 = " + rn2);
		
		// Math.random() : 0 ~ 1 미만의 실수형의 난수, 0 ~ 0.9999.....까지 사이의 난수
		System.out.println("--- 2. Math.random() ---");
		
		// 0 ~ 9까지 사이의 난수
		int rn3 = (int)(Math.random() * 10);
		System.out.println("rn3 = " + rn3);
		
		// 1 ~ 10까지 사이의 난수
		int rn4 = (int)(Math.random() * 10) + 1;
		
		System.out.println("--- 3. 로또 번호 생성 ---");
		// 로또 번호 : 1 ~ 45 사이의 난수
		int lotto1 = (int)(Math.random() * 45) + 1;
		System.out.println("lotto1 = " + lotto1);
		
		int lotto2 = r.nextInt(45) + 1;
		System.out.println("lotto2 = " + lotto2);
		
		System.out.println("--- 4. 음수를 포함하는 범위의 난수 생성하는 방법 ---");
		// -10 ~ 10 까지 사이으 난수
		int rn5 = (int)(Math.random()*(10-(-10)+1)) + (-10);
		System.out.println("rn5 = " + rn5);
		
	}

}
