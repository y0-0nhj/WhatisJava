import java.util.Scanner;

public class ImportTest01 {
	public static void main(String[] args) {
		// 2�� ��� - �ܼ���(Simple Name, SN)
		Scanner sc = new Scanner(System.in);
		
		// 1�� ��� - �������ĸ�(Full Qualified Name, FQN)
		//java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int x = sc.nextInt();
		
		System.out.println("x = " + x);
		
		sc.close();
	}

}
