import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapTest04 {
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
		System.out.println("오름차순정렬:" + map);
		
		NavigableMap<Integer, String> map2 = map.descendingMap();
		System.out.println("내림차순정렬: " + map2);
		
		
		// 95점 미포함(지정된 값은 미포함)
		SortedMap<Integer, String> map3 = map.headMap(95);
		System.out.println("95점보다 작은 값: " + map3);
		
		// 95점 포함(지정된 값 포함)
		SortedMap<Integer, String> map4 = map.headMap(95, true);
		System.out.println("95점보다 작은 값: " + map4);
		
		// 95점 포함(지정된 값은 포함)
		SortedMap<Integer, String> map5 = map.tailMap(95);
		System.out.println("95점보다 큰 값: " + map5);
		
		// 95점 미포함(지정된 값은 미포함)
		SortedMap<Integer, String> map6 = map.tailMap(95, false);
		System.out.println("95점보다 큰 값: " + map6);
		
	}

}
