
public class StringBufferTest02 {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("ABC");
		StringBuffer sb2 = new StringBuffer("ABC");
		
		System.out.println(sb1);
		System.out.println(sb2);
		System.out.println("----------");
		System.out.println(System.identityHashCode(sb1));
		System.out.println(System.identityHashCode(sb2));
		System.out.println("----------");
		
		if(sb1 == sb2) { // 참조를 비교
			System.out.println("두 문자열의 참조가 같습니다.");
		} else {
			System.out.println("두 문자열의 참조가 다릅니다.");
		}
		
		// equals() : Object 클래스에 존재, 참조를 비교하는 메소드
		// String 클래스의 equals() : 내용을 비교하도록 오버라이딩한 메소드
		// StringBuffer 클래스 equals() : Object 클래스로부터 상속받은 메소드
		// 문제점 : Object 클래스의 equals()를 그대로 사용하므로 내용을 비교하는 것이 아니라 참조를 비교하는 것.
		if(sb1.equals(sb2)) { // 내용을 비교하는 것이 아니라 참조를 비교하는 것.
			System.out.println("두 문자열의 참조가 같습니다.");
		} else {
			System.out.println("두 문자열의 참조를 다릅니다.");
		}
		System.out.println("----------");
		
		// 해결책 : StringBuffer형을 String형으로 변경한 후에 비교 
		String s1 = sb1.toString();
		String s2 = sb2.toString();
		
		if(s1.equals(s2)) {
		//if(sb1.toString().equals(sb2.toString())) {
			System.out.println("두 문자열의 내용이 같습니다.");
		} else {
			System.out.println("두 문자열의 내용이 다릅니다.");
		}
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		
		
	}

}
