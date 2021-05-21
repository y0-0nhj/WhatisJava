import java.util.StringJoiner;

public class StringJoinerTest01 {
	public static void main(String[] args) {
		String s1 = "사자/코끼리/기린/하마/치타/표범/얼룩말";
		
		System.out.println("1. ----------"); 
		String[] animals = s1.split("/");
		for(String s : animals) {
			System.out.println(s);
		}
		
		System.out.println("2. ----------");
		// 문자열의 배열을 특정 구분자로 연결하여 문자열로 생성하는 메소드
		String s2 = String.join("-", animals);
		System.out.println(s2);
		
		System.out.println("3. ----------");
		// 문자열의 배열을 특정 구분자로 연결하여 문자열로  생성하는 메소드
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
