import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapTest03 {
	public static void main(String[] args) {
		// TreeMap 생성, 키: 점수, 값: 학생이름
		// Map의 구조로는 좋지 못함 -> TreeMap의 테스트를 위해 사용
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		
		// 데이터 추가 - 키를 기준으로 오름차순 정렬
		map.put(87, "이익준");
		map.put(98, "김준완");
		map.put(75, "채송화");
		map.put(95, "양석형");
		map.put(80, "안정원");
		System.out.println(map);
		
		// TreeMap의 다양한 메소드 활용
		
		Entry<Integer, String> entry = map.firstEntry();
		System.out.println("최저점수 : " + entry.getKey() + "(" + entry.getValue() + ")");
		
		entry = map.lastEntry();
		System.out.println("최고점수 : " + entry.getKey() + "(" + entry.getValue() + ")");
		
		entry = map.lowerEntry(95);  // 95점은 포함하지 않음
		System.out.println("95점 바로 아래 점수 : " + entry.getKey() + "(" + entry.getValue() + ")");
		
		entry = map.higherEntry(95); // 95점은 포함하지 않음
		System.out.println("95점 바로 위의 점수 : " + entry.getKey() + "(" + entry.getValue() + ")");
		
		entry = map.floorEntry(95); // 95점은 포함함.
		System.out.println("95점이거나 바로 아래 점수 : " + entry.getKey() + "(" + entry.getValue() + ")");
		
		entry = map.ceilingEntry(95); // 95점은 포함함.
		System.out.println("95점이거나 바로 위의 점수 : " + entry.getKey() + "(" + entry.getValue() + ")");
		System.out.println("----------");
		
		// 출력 - isEmpty() 메소드 활용
		// pollFirstEntry() : 첫번째 데이터부터 꺼내고, 삭제함.
		// pollLastEntry() : 마지막 데이터부터 꺼내고, 삭제함.
		while(!map.isEmpty()) {
			//entry = map.pollFirstEntry();
			entry = map.pollLastEntry();
			System.out.println(entry.getKey() + "(" + entry.getValue() + ")");
		}
		System.out.println("----------");
		System.out.println(map);
		System.out.println("크기: " + map.size());
		
	}

}
