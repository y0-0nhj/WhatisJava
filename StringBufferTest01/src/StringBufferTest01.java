
public class StringBufferTest01 {
	public static void main(String[] args) {
		// String 클래의 특징 - immutable한 성질
		// 1. 문자열을 추가, 변경, 삭제할 때 인스턴스를 새로 생성
		// 2. 문자열을 추가하기 전의 인스턴스와 추가한 후의 인스턴스가 다름.
		
		String s1 = "ABC";
		System.out.println(s1);
		System.out.println(System.identityHashCode(s1));
		
		s1 = s1.concat("DEF");
		//s1 += "DEF"; //s1 = s1 + "DEF";
		System.out.println(s1);
		System.out.println(System.identityHashCode(s1));
		System.out.println("----------");
		
		// StringBuffer 클래스의 특징 - mutable한 성질
		// 1. 문자열을 추가, 변경, 삭제할 때 자신의 인스턴스에 그대로 추가,변경,삭제하여 사용함.
		// 2. 문자열을 추가하기 전의 인스턴스와 추가한 후의 인스턴스가 같음.
		StringBuffer sb1 = new StringBuffer("ABC");
		System.out.println(sb1);
		System.out.println(System.identityHashCode(sb1));
		
		//sb1 += "DEF";" // 에러
		sb1.append("DEF");
		System.out.println(sb1);
		System.out.println(System.identityHashCode(sb1));
	}

}
