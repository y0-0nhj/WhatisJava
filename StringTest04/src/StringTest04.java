
public class StringTest04 {
	public static void main(String[] args) {
		String s1 = null;
		String s2 = "";
		
		System.out.println("s1 = " + s1); // null 상태 - 아무곳도 참조하고 있지 않은 상태
		System.out.println("s2 = " + s2); // 빈문자열을 참조하고 있는 상태
		//System.out.println(s1.hashCode()); // 에러 - 인스턴스가 없으므로 해쉬코드도 없음.
		System.out.println(s2.hashCode());
		System.out.println(System.identityHashCode(s2));
		System.out.println("----------");
		
		char[] c = new char[] {'H', 'e', 'l', 'l', 'o'}; // 문자의 배열
		String s3 = new String(c);
		System.out.println(s3);
	}

}
