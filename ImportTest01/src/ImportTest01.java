import java.util.Scanner;

public class ImportTest01 {
	public static void main(String[] args) {
		// 2번 방법 - 단순명(Simple Name, SN)
		Scanner sc = new Scanner(System.in);
		
		// 1번 방법 - 완전수식명(Full Qualified Name, FQN)
		//java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int x = sc.nextInt();
		
		System.out.println("x = " + x);
		
		sc.close();
	}

}
