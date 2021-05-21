import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest02 {
	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<String>();
		
		// 데이터 추가 - 데이터가 오름차순으로 정렬되어 출력
		set.add("이익준"); set.add("김준완"); set.add("채송화"); set.add("양석형"); set.add("안정원");
		System.out.println(set);
		System.out.println("크기 : "+ set.size());
		
		// 중복되지 않는 데이터 추가 : 허용
		set.add("도재학");
		System.out.println(set);
		System.out.println("크기 : "+ set.size());
		
		// 중복된 데이터 추가 : 중복 데이터 허용 불가
		set.add("안정원");
		System.out.println(set);
		System.out.println("크기 : "+ set.size());
		
		// 데이터 삭제
		set.remove("채송화");
		System.out.println(set);
		System.out.println("크기 : "+ set.size());
		System.out.println("----------");
		
		// 출력1 - for-in문
		for(String s : set) {
			System.out.println(s);
		}
		System.out.println("----------");
		
		// 출력2 - Iterator 사용
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("----------");
		
		
	}

}
