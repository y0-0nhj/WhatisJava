
public class StringTest01 {
	public static void main(String[] args) {
		// 문자열을 생성하는 1번 방법
		String s1 = "ABC";
		String s2 = "XYZ";
		String s3 = "ABC"; // 기존에 있던 문자열 참조, 새로운 문자열을 생성하는 것은 아님, 메모리를 효율적으로 사용하기 위해
		String s4 = "DEF";
		
		// JVM(Java Virtual Machine, 자바 가상 기계) - 메모리를 관리
		// GC(Garbage Collector) 
		// Garbage Collection - 메모리에서 낭비되는 자원을 회수해서 재활용할 수 있게 해주는 것
		s4 = s1;
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println("----------");
		
		// 해시코드(hashcode) - 각 인스턴스가 가지는 고유한 아이디
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		System.out.println("----------");
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));
	}

}
