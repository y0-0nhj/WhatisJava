
public class StringTest07 {
	public static void main(String[] args) {
		String s1 = "Hello Java World!";
		
		// length() : 문자열의 길이를 알려주는 메소드
		System.out.println(s1.length());
		
		// replace() : 올드 문자열을 새로운 문자열로 변경하는 메소드
		s1 = s1.replace("!", "*");
		System.out.println(s1);
		
		s1 = s1.replace("Java", "Android");
		System.out.println(s1);
		
		s1 = s1.replace("l", "L");
		System.out.println(s1); // 전체 문자가 변경됨
		
		// replaceFirst() : 첫번째로 나오는 올드 문자열을 새로운 문자열로 변경하는 메소드
		s1 = s1.replaceFirst("d", "D");
		System.out.println(s1);
		
		// split() : 문자열을 특정문자(구분자)로 분리하여 문자열 배열로 생성하는 메소드
		String s2 = "lion,tiger,bear,eagle,monkey,elephant";
		String[] animals = s2.split(",");
		
		// 기본 for문
		for(int i=0; i<animals.length; i++) {
			System.out.println(animals[i]);
		}
		System.out.println("----------");
		
		// for-in문
		for(String s : animals) {
			System.out.println(s);
		}
		
	}

}
