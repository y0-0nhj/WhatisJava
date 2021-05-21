import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest03 {
	public static void main(String[] args) { 
		TreeSet<Integer> set = new TreeSet<Integer>();
		
		set.add(87); set.add(98); set.add(75); set.add(95); set.add(80);
		System.out.println(set);
		
		// TreeSet에 추가된 메소드
		System.out.println("최저점수 : " + set.first());
		System.out.println("최고점수 : " + set.last());
		
		// 해당 점수를 포함하지 않음.
		System.out.println("95점 바로 아래 점수 : " + set.lower(95));
		System.out.println("95점 바로 위의 점수 : " + set.higher(95));
		
		// 해당 점수를 포함함.
		System.out.println("95점이거나 바로 아래 점수 : " + set.floor(95));
		System.out.println("95점이거나 바로 위의 점수 : " + set.ceiling(95));
		
		// 출력1 - for-in문
		for(int i : set) {
			System.out.print(i + " ");
		}
		System.out.println("\n크기 : " + set.size());
		
		// 출력2 - Iterator 사용
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println("\n크기 : " + set.size());
		System.out.println("----------");
		
		// 출력3 - isEmpty() 메소드 사용
		// pollFirst() : 데이터를 앞에서부터 꺼내고, 데이터를 삭제 
		// pollLast()  : 데이터를 뒤에서부터 꺼내고, 데이터를 삭제
		while(!set.isEmpty()) {
			//System.out.print(set.pollFirst() + " ");
			System.out.print(set.pollLast() + " ");
		}
		System.out.println("\n크기 : " + set.size());
		
	}

}
