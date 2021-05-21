
public class StringTest08 {
	public static void main(String[] args) {
		String s1 = "Hello Java World!";
		
		// substring() : 문자열을 추출하는 메소드
		String s2 = s1.substring(6); // 6번부터 끝까지 추출
		System.out.println(s2);
		
		String s3 = s1.substring(6, 10); // 6번부터 10번 앞까지 추출(6번부터 9번까지)
		System.out.println(s3);
		
		String s4 = s1.substring(11); // 11번부터 끝까지 추출
		System.out.println(s4);
		
		String s5 = s1.substring(11, 17); // 11번부터 17번 앞까지 추출(11번부터 16번까지)
		System.out.println(s5);
		
		// toLowerCase() : 모든 문자열을 소문자로 변경하는 메소드
		String s6 = s1.toLowerCase();
		System.out.println(s6);
		
		// toUpperCase() : 모든 문자열을 대문자로 변경하는 메소드
		String s7 = s1.toUpperCase();
		System.out.println(s7);
		
		// trim() : 문자열의 맨 앞과 맨 뒤의 공백을 제거하는 메소드
		String s8 = "    Hello     Java     ";
		System.out.println(s8 + "#");
		
		String s9 = s8.trim();
		System.out.println(s9 + "@");
		
	}

}
