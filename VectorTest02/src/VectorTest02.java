import java.util.Vector;

public class VectorTest02 {
	public static void main(String[] args) {
		System.out.println("--- 정수 벡터 생성 ---");
		Vector<Integer> v = new Vector<Integer>();
		int[] a = {10, 20, 30, 40, 50};
		
		System.out.println("--- 순차적 삽입 ---");
		for(int i=0; i<a.length; i++) {
			v.add(a[i]);
		}
		System.out.println(v);
		
		System.out.println("--- 데이터 삭제(1개) ---");
		v.remove(2); // 2번 인덱스 삭제
		System.out.println(v);
		
		System.out.println("--- 비순차적 삽입(중간) ---");
		v.add(2, 60);
		System.out.println(v);
		
		System.out.println("--- 데이터 변경(수정) ---");
		v.set(3, 80);
		System.out.println(v);
		
		System.out.println("--- 첫번째 데이터 출력 ---");
		System.out.println(v.get(0));
		System.out.println(v.firstElement());
		
		System.out.println("--- 마지막 데이터 출력 ---");
		System.out.println(v.get(v.size()-1));
		System.out.println(v.lastElement());
		
		System.out.println("--- 특정 인덱스에 해당하는 데이터 출력 ---");
		System.out.println(v.get(2)); // 2번 인덱스의 데이터 확인
		System.out.println(v.elementAt(2));
		
		System.out.println("벡터의 갯수 : " + v.size());
		System.out.println("벡터의 용량 : " + v.capacity());
		
		System.out.println("--- 데이터가 있는 인덱스 출력 ---");
		System.out.println(v.indexOf(80)); // 80 데이터가 있는 인덱스 확인
		
		System.out.println("--- 순차적 추가 ---");
		v.add(60);
		System.out.println(v);
		
		System.out.println("--- 데이터의 인덱스 출력(앞에서부터 검색) ---");
		System.out.println(v.indexOf(60));
		
		System.out.println("--- 데이터의 인덱스 출력(뒤에서부터 검색) ---");
		System.out.println(v.lastIndexOf(60));
		
		System.out.println("--- 해당하는 값을 찾지 못했을 때 -1 출력 ---");
		System.out.println(v.indexOf(90)); // -1, 배열의 인덱스로는 존재할 수 없는 값
		
		System.out.println("--- 특정 위치부터 해당하는 값을 검색 ---");
		System.out.println(v.indexOf(60, 3)); // 3번 인덱스부터 60 데이터를 검색
		
		System.out.println("--- 비순차적 데이터 추가 ---");
		v.add(4, 70);
		//v.insertElementAt(70, 4);
		System.out.println(v);
		
		System.out.println("벡터의 크기 : " + v.size());
		System.out.println(v);
		
		System.out.println("--- 벡터의 크기 변경 ---");
		v.setSize(5);
		System.out.println("벡터의 크기 : " + v.size());
		System.out.println(v);
		
		System.out.println("--- 한꺼번에 모든 벡터의 데이터 삭제 ---");
		v.clear();
		//v.removeAllElements();
		
		System.out.println("벡터의 크기 : " + v.size());
		System.out.println(v);
		
		// end
	}

}
