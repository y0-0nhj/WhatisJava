
// Math 클래스
// - 수학에 관한 다양한 상수, 메소드를 갖고 있는 클래스
// - Math 클래스 안에 있는 것은 클래스 상수, 클래스 메소드만 존재
// - Math 클래스는 final로 선언되어  있음.
public class MathTest01 {
	public static void main(String[] args) {
		System.out.println("1. ----------");
		System.out.println(Math.abs(-11));
		System.out.println(Math.sqrt(16)); // 4.0
		System.out.println(Math.pow(2, 3)); // 8.0, 2의 3승
		System.out.println(Math.PI); // 3.141592653589793
		System.out.println(Math.ceil(10.1)); // 11.0, 올림
		System.out.println(Math.floor(10.9)); // 10.0, 버림
		System.out.println(Math.round(10.5)); // 11, 정수로 반올림
		System.out.println(Math.round(10.4)); // 10, 정수로 반올림
		System.out.println(Math.max(10, 20)); // 20, 최댓값
		System.out.println(Math.max(3.5, 7.7)); // 7.7, 최댓값
		System.out.println(Math.max(10, Math.max(20, 30))); // 30, 여러개를 비교할 때는 중첩해서 사용
		System.out.println(Math.min(10,  20)); // 10, 최솟값
		System.out.println(Math.min(5.5,  4.4)); // 4.4, 최솟값
		System.out.println(Math.min(75, Math.min(27, 35))); // 27, 여러개를 비교할 때는 중첩해서 사용
		System.out.println("2. ----------");
		// rint() : 가까운 정수값을 선택, 이 때 중간(.5)일 때는 짝수쪽을 선택
		System.out.println(Math.rint(1.4)); // 1.0
		System.out.println(Math.rint(1.6)); // 2.0
		System.out.println("-----");
		System.out.println(Math.rint(0.5)); // 0.0
		System.out.println(Math.rint(1.5)); // 2.0
		System.out.println(Math.rint(2.5)); // 2.0
		System.out.println(Math.rint(3.5)); // 4.0
		System.out.println(Math.rint(4.5)); // 4.0
		System.out.println(Math.rint(5.5)); // 6.0
		System.out.println(Math.rint(6.5)); // 6.0
		System.out.println(Math.rint(7.5)); // 8.0
		System.out.println(Math.rint(8.5)); // 8.0
		System.out.println(Math.rint(9.5)); // 10.0 
		System.out.println(Math.rint(10.5)); // 10.0
		// round() : 소숫점 첫번째 자리에서 반올림하여 1의 자리로 표현
		System.out.println("3. ----------");
		System.out.println(Math.round(0.5));
		System.out.println(Math.round(1.5));
		System.out.println(Math.round(2.5));
		System.out.println(Math.round(3.5));
		System.out.println(Math.round(4.5));
		System.out.println(Math.round(5.5));
		System.out.println(Math.round(6.5));
		System.out.println(Math.round(7.5));
		System.out.println(Math.round(8.5));
		System.out.println(Math.round(9.5));
		System.out.println(Math.round(10.5));
		System.out.println("4. ----------");
		// round() 함수를 사용하여 반올림의 자릿수를 지정하는 방법
		double n = 90.7552;
		// 소숫점 둘째자리까지로 저장
		// 9075.52
		//double n2 = Math.round(n*10) / 10.0; // 소숫점 첫째자리까지 저장
		double n2 = Math.round(n*100) / 100.0; // 소숫점 둘째자리까지 저장
		//double n2 = Math.round(n*1000) / 1000.0; // 소숫점 셋째자리까지 저장
		System.out.println("n = " + n);
		System.out.println("n2 = " + n2);
	
		// end
	}

}
