import java.util.Scanner;

public class StringTest03 {
	public static void main(String[] args) {
		// ���ڿ��� �����ϴ� 2�� ���  - Ű����κ��� ���ڿ��� �Է¹޴� ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ� �Է�1 : ");
		String s1 = sc.next();
		System.out.print("���ڿ� �Է�2 : ");
		String s2 = sc.next();
		String s3 = "30";
		String s4 = "30";
		
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("----------");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println();
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		
		System.out.println("----------");
		if(s1 == s3) {
			System.out.println("same");
		} else {
			System.out.println("different");
		}
		
		if(s3 == s4) {
			System.out.println("same");
		} else {
			System.out.println("different");
		}
		
		if(s1 == s2) {
			System.out.println("same");
		} else {
			System.out.println("different");
		}
		
		
		sc.close();
	}

}
