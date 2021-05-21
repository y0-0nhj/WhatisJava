import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetTest04 {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		
		set.add(87); set.add(98); set.add(75); set.add(95); set.add(80);
		System.out.println("�������� ���� : " + set);
		
		// TreeSet�� ���� ������������ ���ĵ� NavigableSet�� ����
		// descendingSet() : �������� ���� �޼ҵ�
		NavigableSet<Integer> set2 = set.descendingSet();
		System.out.println("�������� ���� : " + set2);
		
		NavigableSet<Integer> set3 = set2.descendingSet();
		System.out.println("�������� ���� : " + set3);
		
		// headSet() : ������ ������ ���� ���� ���� �κм��� ����, ������ ���� �������� ����.
		SortedSet<Integer> set4 = set.headSet(87);
		System.out.println("87��(������)���� ���� ���� ���� �κм� : " + set4);
		
		SortedSet<Integer> set5 = set.headSet(87, true);
		System.out.println("87��(����)���� ���� ���� ���� �κм� : " + set5);
		
		// tailSet() : ������ ������ ū ���� ���� �κм��� ����, ������ ���� ���Ե�.
		SortedSet<Integer> set6 = set.tailSet(87);
		System.out.println("87��(����)���� ū ���� ���� �κм� : " + set6);
		
		SortedSet<Integer> set7 = set.tailSet(87, false);
		System.out.println("87��(������)���� ū ���� ���� �κм� : " + set7);
		
		
	}

}
