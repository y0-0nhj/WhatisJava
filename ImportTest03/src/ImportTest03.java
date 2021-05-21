// Math 클래스 
// 1. 수학에 관련된 메소드, 상수 들이 정의되어 있는 클래스
// 2. 클래스 변수와 클래스 메소드만 존재, 인스턴스 변수와 인스턴스 메소드는 없음.
// 3. 클래스명.메소드명

// static import 방법
import static java.lang.Math.*;

public class ImportTest03 {
	public static void main(String[] args) {
		double radius = 11.7;
		int x = 10, y = 20, z = -30;
		
		double perimeter = 2 * PI * radius; // 원의 둘레
		double area = PI * radius * radius; // 원의 면적
		double distance = sqrt(x*x + y*y);   // 거리를 구하는 공식, 유클리드
		z = abs(z); // 절대값
		
		System.out.println("원의 둘레 : " + perimeter);
		System.out.println("원의 면적 : " + area);
		System.out.println("거리 : " + distance);
		System.out.println("절대값 : " + z);
		
	}

}
