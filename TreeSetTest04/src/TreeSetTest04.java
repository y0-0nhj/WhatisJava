import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetTest04 {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		
		set.add(87); set.add(98); set.add(75); set.add(95); set.add(80);
		System.out.println("오름차순 정렬 : " + set);
		
		// TreeSet을 통해 내림차순으로 정렬된 NavigableSet을 생성
		// descendingSet() : 내림차순 정렬 메소드
		NavigableSet<Integer> set2 = set.descendingSet();
		System.out.println("내림차순 정렬 : " + set2);
		
		NavigableSet<Integer> set3 = set2.descendingSet();
		System.out.println("오름차순 정렬 : " + set3);
		
		// headSet() : 지정한 값보다 작은 값을 가진 부분셋을 생성, 지정한 값은 포함하지 않음.
		SortedSet<Integer> set4 = set.headSet(87);
		System.out.println("87점(미포함)보다 작은 값을 가진 부분셋 : " + set4);
		
		SortedSet<Integer> set5 = set.headSet(87, true);
		System.out.println("87점(포함)보다 작은 값을 가진 부분셋 : " + set5);
		
		// tailSet() : 지정한 값보다 큰 값을 가진 부분셋을 생성, 지정한 값은 포함됨.
		SortedSet<Integer> set6 = set.tailSet(87);
		System.out.println("87점(포함)보다 큰 값을 가진 부분셋 : " + set6);
		
		SortedSet<Integer> set7 = set.tailSet(87, false);
		System.out.println("87점(미포함)보다 큰 값을 가진 부분셋 : " + set7);
		
		
	}

}
