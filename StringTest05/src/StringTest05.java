
public class StringTest05 {
	public static void main(String[] args) {
		String s1 = "Hello Java World!";
		
		// charAt() : 인덱스에 해당하는 한 문자를 생성 (0부터 시작)
		char c1 = s1.charAt(6);
		System.out.println(c1);
		
		char c2 = s1.charAt(11);
		System.out.println(c2);
		
		// concat() : 문자열을 연결하는 메소드
		String s2 = "Korea";
		//s1.concat(s2);
		System.out.println(s1.concat(s2));
		
		// String 클래스 : immutable한 성질을 가짐
		s1 = s1.concat(s2); 
		System.out.println(s1); // Hello Java World!Korea
		
		// contains() : 문자 또는 문자열의 포함 여부, 결과는 boolean값이 됨.
		System.out.println(s1.contains("J"));
		System.out.println(s1.contains("Java"));
		System.out.println(s1.contains("java"));
		System.out.println(s1.contains("Korea"));
		System.out.println(s1.contains("korea"));
	}

}
