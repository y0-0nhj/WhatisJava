
// StringBuilder 클래스의 기능은 StringBuffer 클래스의 기능과 거의 똑같다.
// StringBuilder 클래스를 먼저 생성 -> 문제점: 쓰레드(Thread)의 기능이 있어서 성능의 저하가 발생
// -> 이러한 문제점을 개선, 쓰레드 기능을 제외하여 성능을 향상시킨 StringBuffer 클래스를 생성하게됨.

public class StringBuilderTest01 {
	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder();
		
		System.out.println(sb1);
		System.out.println("용량: " + sb1.capacity());
		System.out.println("크기: " + sb1.length());
		
		sb1.append("Hello Java World!");
		System.out.println(sb1);
		System.out.println("용량: " + sb1.capacity());
		System.out.println("크기: " + sb1.length());
		
	}

}
