import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest04 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		System.out.println("- 1. ������ �߰� -");
		System.out.println("ArrayList  �߰� �ð� : " + add(al) + "ms");
		System.out.println("LinkedList �߰� �ð� : " + add(ll) + "ms");
		
		System.out.println("- 2. ������ ���� �ð� -");
		System.out.println("ArrayList  ���� �ð� : " + access(al) + "ms");
		System.out.println("LinkedList ���� �ð� : " + access(ll) + "ms");
		
	}

	// ������ �߰� �޼ҵ�
	public static long add(List<Integer> list) {
		long start = System.currentTimeMillis();
		for(int i=0; i<100000; i++) {
			list.add(i);
		}
		long end = System.currentTimeMillis();
		return end - start;
	}
	
	// ������ ���� �ð�
	public static long access(List<Integer> list) {
		long start = System.currentTimeMillis();
		for(int i=0; i<list.size(); i++) {
			list.get(i); // �б�
		}
		long end = System.currentTimeMillis();
		return end - start;
	}
	
}
