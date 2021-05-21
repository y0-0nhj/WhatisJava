import java.util.Vector;

public class VectorTest05 {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		System.out.println("용량: " + v.capacity()); // 10, 초기 용량
		System.out.println("크기: " + v.size()); 		// 0, 크기
		
		System.out.println("--- 1. 5개 데이터 추가 후");
		v.add(10); v.add(20); v.add(30); v.add(40); v.add(50); 
		System.out.println("용량: " + v.capacity()); // 10
		System.out.println("크기: " + v.size());		// 5
		
		System.out.println("--- 2. 10개 데이터 추가 후");
		v.add(10); v.add(20); v.add(30); v.add(40); v.add(50); 
		System.out.println("용량: " + v.capacity()); 	// 10	
		System.out.println("크기: " + v.size());		// 10
		
		System.out.println("--- 3. 15개 데이터 추가 후");
		v.add(10); v.add(20); v.add(30); v.add(40); v.add(50); 
		System.out.println("용량: " + v.capacity()); // 20, 용량이 10개를 넘으면 자동으로 10개씩 추가
		System.out.println("크기: " + v.size());		// 15
		
		System.out.println("--- 용량을 크기와 같게 맞춤 ---");
		v.trimToSize();
		System.out.println("용량: " + v.capacity()); 	// 15	
		System.out.println("크기: " + v.size());		// 15
		
		
	}

}
