import java.util.Vector;

public class VectorTest03 {
	public static void main(String[] args) {
		Vector<Integer> v1 = new Vector<Integer>();
		Vector<Integer> v2 = new Vector<Integer>();
		Vector<Integer> v3 = new Vector<Integer>();
		
		v1.add(10); v1.add(20); v1.add(30); 
		v2.add(40); v2.add(50); v2.add(60); 
		v3.add(30); v3.add(40); v3.add(50); 
		
		System.out.println("v1 : " + v1);
		System.out.println("v2 : " + v2);
		System.out.println("v3 : " + v3);
		
		System.out.println("--- 벡터에 다른 벡터의 내용 추가 ---");
		v1.addAll(v2); // 순차적 추가
		//v1.addAll(1, v2); // 비순차적 추가(중간)
		System.out.println("v1 : " + v1);
		
		System.out.println("--- 벡터에서 데이터의 존재 유무 확인 ---");
		System.out.println(v1.indexOf(50));  // 4, 50 데이터의 인덱스
		System.out.println(v1.contains(50)); // true
		System.out.println(v1.indexOf(80));  // -1, 80 데이터는 없음
		System.out.println(v1.contains(80)); // false
		
		System.out.println("--- 벡터에서 다른 벡터의 데이터의 존재 유무 확인 ---");
		System.out.println(v1.containsAll(v2)); // true
		System.out.println(v3.containsAll(v2)); // false
		
		System.out.println("--- 벡터 복제 ---");
		@SuppressWarnings("unchecked")
		Vector<Integer> v4 = (Vector<Integer>)v1.clone();
		System.out.println("v4 : " + v4);
		
		System.out.println("--- 벡터 복사 ---");
		Vector<Integer> v5 = new Vector<Integer>();
		v5.addAll(v1);
		System.out.println("v5 : " + v4);
	}

}
