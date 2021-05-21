
public class StringBufferTest03 {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer();
		
		// capacity() : 용량을 알려주는 메소드
		// 초기 용량 : 16, 16 -> 34 -> 70, 18의 배수로 증가
		// length() : 크기를 알려주는 메소드
		System.out.println("용량: " + sb1.capacity()); // 16
		System.out.println("크기: " + sb1.length());   // 0
		
		// 
		sb1.append("ABC");
		System.out.println(sb1);
		sb1.append(10);
		System.out.println(sb1);
		sb1.append(3.14);
		System.out.println(sb1);
		sb1.append(true);
		System.out.println(sb1);
		// 메소드 체이닝 (method chainning)
		sb1.append("Hell0").append("Java").append("World").append("!");
		//sb1.append("Hell0").append("Java").append("World").append("!");
		System.out.println(sb1);
		System.out.println("----------");
		
		System.out.println("크기: " + sb1.length());
		System.out.println("용량: " + sb1.capacity());
	}

}
