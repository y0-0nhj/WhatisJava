
public class StringTest02 {
	public static void main(String[] args) {
		// 문자열을 생성하는 2번 방법
		String s1 = new String("ABC");
		String s2 = new String("XYZ");
		String s3 = new String("ABC");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println("----------");
		
		// 문자열은 해시코드를 통해서 확인할 때 인스턴스가 달라도 내용이 같으면 같은 해시코드를 출력하도록 오버라이딩함.
		// 해시코드 확인 1번 방법
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println("----------");
		
		// 해시코드 확인 2번 방법
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
	}

}
