import java.util.Vector;

// List 계열
// 1. 순서가 있고, 중복 데이터를 허용
// 2. 가변적인 배열 구조
// 3. Vector, ArrayList, LinkedList, Stack, Queue ...

public class VectorTest01 {
	public static void main(String[] args) {
		// 벡터 생성
		// raw 타입 - 권장되지 않는 방법 -> generic type으로 사용할 것을 권장(일반화된 타입, 구체화된 타입)
		// 문제점) 데이터 타입이 정해지지 않아서 나중에 처리할때 큰 문제가 발생할 수 있음.
		Vector v1 = new Vector();
		
		// 데이터 삽입
		v1.add("30"); // 문자열
		v1.add(10);   // 정수
		v1.add("오백");// 문자열
		v1.add(true); // boolean
		v1.add(3.14); // 실수
		
		double sum = 0.0;
		// 출력 방법 1번
		for(int i=0; i<v1.size(); i++) {
			System.out.println(v1.get(i));
			// sum += v1.get(i); // 에러
		}
		System.out.println("----------");
		// 출력 방법 2법
		for(Object o : v1) {
			System.out.println(o);
		}
		
		System.out.println("**********");
		// generic type (일반화된 타입, 구체화된 타입)
		System.out.println("--- 1. 벡터의 생성 ---");
		Vector<Integer> v2 = new Vector<Integer>();	
		
		System.out.println("--- 2. 데이터 삽입 ---");
		v2.add(98);
		v2.add(75);
		v2.add(82);
		v2.add(64);
		v2.add(77);
		//v2.add("육십");
		//v2.add(75.5);
		
		System.out.println("--- 3. 데이터 출력 ---");
		for(int i=0; i<v2.size(); i++) {
			System.out.println(v2.get(i));
		}
		
		int tot = 0;
		System.out.println("-----");
		for(int score : v2) {
			System.out.println(score);
			tot += score;
		}
		System.out.println("총점 : " + tot);
		
		System.out.println("--- 4. 데이터 확인 ---");
		System.out.println(v2.toString());
		
	}

}
