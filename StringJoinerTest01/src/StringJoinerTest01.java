import java.util.StringJoiner;

public class StringJoinerTest01 {
	public static void main(String[] args) {
		String s1 = "����/�ڳ���/�⸰/�ϸ�/ġŸ/ǥ��/��踻";
		
		System.out.println("1. ----------"); 
		String[] animals = s1.split("/");
		for(String s : animals) {
			System.out.println(s);
		}
		
		System.out.println("2. ----------");
		// ���ڿ��� �迭�� Ư�� �����ڷ� �����Ͽ� ���ڿ��� �����ϴ� �޼ҵ�
		String s2 = String.join("-", animals);
		System.out.println(s2);
		
		System.out.println("3. ----------");
		// ���ڿ��� �迭�� Ư�� �����ڷ� �����Ͽ� ���ڿ���  �����ϴ� �޼ҵ�
		StringJoiner sj1 = new StringJoiner(",");
		for(String s : animals) {
			sj1.add(s);
		}
		System.out.println(sj1);
		
		System.out.println("4. ----------");
		StringJoiner sj2 = new StringJoiner(",", "[", "]");
		for(String s : animals) { 
			sj2.add(s);
		}
		System.out.println(sj2);
		
	}

}
