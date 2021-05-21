import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest03 {
	public static void main(String[] args) { 
		TreeSet<Integer> set = new TreeSet<Integer>();
		
		set.add(87); set.add(98); set.add(75); set.add(95); set.add(80);
		System.out.println(set);
		
		// TreeSet�� �߰��� �޼ҵ�
		System.out.println("�������� : " + set.first());
		System.out.println("�ְ����� : " + set.last());
		
		// �ش� ������ �������� ����.
		System.out.println("95�� �ٷ� �Ʒ� ���� : " + set.lower(95));
		System.out.println("95�� �ٷ� ���� ���� : " + set.higher(95));
		
		// �ش� ������ ������.
		System.out.println("95���̰ų� �ٷ� �Ʒ� ���� : " + set.floor(95));
		System.out.println("95���̰ų� �ٷ� ���� ���� : " + set.ceiling(95));
		
		// ���1 - for-in��
		for(int i : set) {
			System.out.print(i + " ");
		}
		System.out.println("\nũ�� : " + set.size());
		
		// ���2 - Iterator ���
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println("\nũ�� : " + set.size());
		System.out.println("----------");
		
		// ���3 - isEmpty() �޼ҵ� ���
		// pollFirst() : �����͸� �տ������� ������, �����͸� ���� 
		// pollLast()  : �����͸� �ڿ������� ������, �����͸� ����
		while(!set.isEmpty()) {
			//System.out.print(set.pollFirst() + " ");
			System.out.print(set.pollLast() + " ");
		}
		System.out.println("\nũ�� : " + set.size());
		
	}

}
