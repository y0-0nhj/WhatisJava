import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest02 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		
		// 데이터 추가 - 순서가 없음
		set.add("이익준"); set.add("김준완"); set.add("채송화"); set.add("양석형"); set.add("안정원");
		System.out.println(set);
		System.out.println("크기 : " + set.size());
	
		// 중복 데이터는 허용 불가(문자열)
		set.add("채송화");
		System.out.println(set);
		System.out.println("크기 : " + set.size());
		
		// 중복되지 않은 데이터 추가 가능
		set.add("장겨울");
		System.out.println(set);
		System.out.println("크기 : " + set.size());
		
		// 존재하는 데이터 삭제 
		set.remove("김준완");
		System.out.println(set);
		System.out.println("크기 : " + set.size());
		
		// 존재하지 않는 데이터 삭제 - 에러가 나지 않음
		set.remove("추민하");
		System.out.println(set);
		System.out.println("크기 : " + set.size());
		
		// 출력 1 - for-in문
		for(String s : set) {
			System.out.println(s);
		}
		System.out.println("-----");
		
		// 출력 2 - Iterator 사용
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("----");
		System.out.println(set);
		
		// 데이터의 포함 여부 (1개)
		System.out.println(set.contains("장겨울"));
		System.out.println(set.contains("김준완"));
		
		// 다른 set의 포함 여부
		HashSet<String> set2 = new HashSet<String>();
		set2.add("안정원"); set2.add("장겨울"); set2.add("채송화"); 
		
		HashSet<String> set3 = new HashSet<String>();
		set3.add("안정원"); set3.add("장겨울"); set3.add("추민하"); 
		
		System.out.println(set.containsAll(set2));
		System.out.println(set.containsAll(set3));
		
		// 다른 set의 내용 한꺼번에 추가
		set.addAll(set3);
		System.out.println(set);
		System.out.println("크기 : " + set.size());
		
		// 다른 set에 포함된 데이터를 삭제(차집합)
		set.removeAll(set3);
		System.out.println(set);
		System.out.println("크기 : " + set.size());
		
		// 다른 set과 공통부분인 데이터를 추출(교집합)
		set.retainAll(set2);
		System.out.println(set);
		System.out.println("크기 : " + set.size());
		
		// 모든 데이터 삭제
		set.clear();
		System.out.println(set);
		System.out.println("크기 : " + set.size());
		
	}

}
