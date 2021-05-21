import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

// TreeMap의 특징
// 1. 키의 순서는 유지하지 않는다.
// 2. 키의 값을 기준으로 오름차순으로 정렬하여 저장한다.
// 3. 키의 중복을 허용하지 않는다.
// 4. 값의 중복을 허용한다.

public class TreeMapTest01 {
	public static void main(String[] args) {
		// 키:사번(Integer), 값:직원이름(String)을 저장하는 TreeMap을 생성
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		
		// 데이터 추가 - 오름차순 정렬하여 저장
		map.put(444444, "양석형");
		map.put(222222, "김준완");
		map.put(333333, "채송화");
		map.put(555555, "안정원");
		map.put(111111, "이익준");
		System.out.println(map);
		
		// 키의 중복 확인 - 허용하지 않음, 이전 데이터를 새로운 데이터로 덮어 씀.
		map.put(444444, "장겨울");
		System.out.println(map);
		
		// 값의 중복 확인 - 허용함.
		map.put(666666, "채송화");
		System.out.println(map);
		System.out.println("----------");
		
		// 출력 1 - keySet(), Iterator
		Set<Integer> keySet = map.keySet();
		Iterator<Integer> it = keySet.iterator();
		while(it.hasNext()) {
			int no = it.next();  	   // 사번
			String name = map.get(no); // 사원명
			System.out.println("사번: " + no + ", 사원명: " + name);
		}
		System.out.println("----------");
		
		// 출력 2 - entrySet(), Iterator
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		Iterator<Entry<Integer, String>> it2 = entrySet.iterator();
		while(it2.hasNext()) {
			Entry<Integer, String> entry = it2.next();
			int no = entry.getKey();
			String name = entry.getValue();
			System.out.println("사번: " + no + ", 사원명: " + name);
		}
		System.out.println("----------");
		
		// 출력 3 - entrySet(), for-in
		entrySet = map.entrySet(); // 재지정
		for(Entry<Integer, String> entry : entrySet) {
			int no = entry.getKey();
			String name = entry.getValue();
			System.out.println("사번: " + no + ", 사원명: " + name);
		}
		System.out.println("----------");
		
	}
}
