import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Map 계열
// 1. 키(key)와 값(value)의 쌍으로 구성됨.
// 2. 맵은 순서가 없음.(인덱스 없음)
// 3. 키는 중복이 없음, 값은 중복이 있음.
// 4. Hashtable : HashMap의 구버전, 쓰레드의 동기화 기능이 있어서 성능의 저하.
// -> HashMap은 쓰레드의 동기화 기능을 제거하여 성능의 향상.

public class HashMapTest01 {
	public static void main(String[] args) {
		// HashMap 생성
		// key: Integer, value: String
		// 학생의 정보를 저장하는 맵으로 설정, key는 학번, value는 학생이름
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		// 데이터 추가
		map.put(123456, "이익준");
		map.put(123457, "김준완");
		map.put(123458, "채송화");
		map.put(123459, "양석형");
		map.put(123460, "안정원");
		
		// 데이터 확인 - 맵은 순서가 없음. (삽입한 순서대로 나오는 것은 아님)
		System.out.println(map);
		
		// 데이터 추가 - 중복된 키를 삽입, 중복된 키를 허용하지 않음 -> 중복된 키에 대해서 이전 데이터 새로운 데이터로 대체
		// 데이터 변경
		map.put(123460, "도재학");
		System.out.println(map);
		
		// 데이터 추가 - 중복된 값을 삽입, 중복된 값은 허용함.
		map.put(222222, "채송화");
		System.out.println(map);
		
		// 1. 데이터 삭제 - 키만 삭제하면 데이터는 삭제됨.
		map.remove(123459);
		System.out.println(map);
		
		// 2. 데이터 삭제 - 키와 값을 모두 확인하여 삭제. -> 키와 값이 모두 같아야 삭제됨.
		map.remove(123456, "이익준");
		System.out.println(map);
		System.out.println("----------");
		
		// 데이터 출력
		// 1. 출력 - keySet()을 사용
		Set<Integer> keys = map.keySet();
		Iterator<Integer> it = keys.iterator();
		while(it.hasNext()) {
			int sno = it.next();        // 키 : 학번
			String name = map.get(sno); // 값 : 이름
			System.out.println(sno + "(" + name + ")");
		}
		System.out.println("크기 : " + map.size());
		System.out.println("----------");
		
		// 2. 출력 - entrySet()
		// entry : 키와 값을 쌍으로 가지는 데이터 구조, map을 처리할 때 구조.
		Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
		Iterator<Map.Entry<Integer, String>> entryIt = entrySet.iterator();
		while(entryIt.hasNext()) {
			Map.Entry<Integer, String> entry = entryIt.next();
			int sno = entry.getKey();
			String name = entry.getValue();
			System.out.println(sno + "(" + name + ")");
		}
		System.out.println("크기 : " + map.size());
		System.out.println("----------");
		
		// 모든 데이터를 삭제
		map.clear();
		System.out.println(map);
		System.out.println("크기 : " + map.size());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
