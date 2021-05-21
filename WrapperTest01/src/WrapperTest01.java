
// Wrapper 클래스
// 1. Boolean, Character, Byte, Short, Integer, Long, Float, Double 
// 8가지 기본형에 대해서 클래스로 생성한 8개의 클래스를 통칭해서 Wrapper 클래스라고 부름.
// 2. 목적1 : 기본형을 객체형으로 만들어서 자바의 세상(참조, 클래스의 세상)에서 사용하기 위함.
// 3. 목적2 : 문자열을 기본형으로 변경하기 위함.

// 박싱(Boxing) : 기본형을 객체형으로 만들어 주는 것.
// 언박싱(Unboxing) : 객체형을 기본형으로 만들어 주는 것.
// 자동박싱(Auto-Boxing) : 자동으로 기본형의 객체형으로 만들어 주는 것.
// 자동언박싱(Auto-Unboxing) : 자동으로 객체형을 기본형으로 만들어 주는 것.
public class WrapperTest01 {
	public static void main(String[] args) {
		System.out.println("1. -----");
		int i = 10; 				 // 기본형
		Integer ii = new Integer(i); // 객체형, 박싱(Boxing)
		
		int i2 = ii.intValue();      // 기본형, 언박싱(Unboxing)
		i2 += 20;
		System.out.println(i2);
		
		System.out.println("2. -----");
		int j = 10;		// 기본형
		Integer jj = j; // 객체형, 자동박싱(Auto-Boxing)
		
		int j2 = jj + 20; // 기본형, 자동언박싱(Auto-Unboxing)
		System.out.println(j2);
		
		System.out.println("3. ----------");
		String s1 = "10";
		int a = Integer.parseInt(s1) + 20;
		System.out.println("a = " + a);
		
		String s2 = "3.14";
		double area = 5.5 * 5.5 * Double.parseDouble(s2);
		System.out.println("area = " + area);
		// end
	}

}
