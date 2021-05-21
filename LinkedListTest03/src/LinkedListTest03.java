import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// ArrayList��  LinkedList�� �ӵ� ��
// 1. ArrayList  : ���ټӵ�(�б�) ����, �������� �߰�, ������ ����, ���������(�߰�) �߰�, ������ ����.
// 2. LinkedList : ���ټӵ�(�б�) ����, �������� �߰�, ������ ����, ���������(�߰�) �߰�, ������ ����.

public class LinkedListTest03 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		System.out.println("- 1. �������� ������ �߰�  -");
		System.out.println("ArrayList �� �ð� : " + add1(al) + "ms");
		System.out.println("LinkedList�� �ð� : " + add1(ll) + "ms");
		
		System.out.println("- 2. �߰����� ������ �߰�  -");
		System.out.println("ArrayList �� �ð� : " + add2(al) + "ms");
		System.out.println("LinkedList�� �ð� : " + add2(ll) + "ms");
		
		System.out.println("- 3. �߰����� ������ ����  -");
		System.out.println("ArrayList �� �ð� : " + remove1(al) + "ms");
		System.out.println("LinkedList�� �ð� : " + remove1(ll) + "ms");
		
		System.out.println("- 4. �������� ������ ����  -");
		System.out.println("ArrayList �� �ð� : " + remove2(al) + "ms");
		System.out.println("LinkedList�� �ð� : " + remove2(ll) + "ms");
	}
	
	// 1. �������� �߰� �޼ҵ�
	public static long add1(List<Integer> list) {
		long start = System.currentTimeMillis(); // 1000���� 1��
		for(int i=0; i<10000000; i++) {
			list.add(i);
		}
		long end = System.currentTimeMillis();
		return end - start;
	}

	// 2. �߰����� �߰� �޼ҵ�
	public static long add2(List<Integer> list) {
		long start = System.currentTimeMillis(); // 1000���� 1��
		for(int i=0; i<1000; i++) {
			list.add(500, i);
		}
		long end = System.currentTimeMillis();
		return end - start;
	}
	
	// 3. �߰����� ���� �޼ҵ�
	public static long remove1(List<Integer> list) {
		long start = System.currentTimeMillis(); // 1000���� 1��
		for(int i=0; i<1000; i++) {
			list.remove(i);
		}
		long end = System.currentTimeMillis();
		return end - start;
	}
	
	// 4. �������� ���� �޼ҵ�
	public static long remove2(List<Integer> list) {
		//long start = System.nanoTime(); // 10 ���̳ʽ� 9��
		long start = System.currentTimeMillis(); // 1000���� 1��, 10�� ���̳ʽ� 3��
		for(int i=list.size()-1; i>=0; i--) {
			list.remove(i);
		}
		long end = System.currentTimeMillis();
		//long end = System.nanoTime();
		return end - start;
	}
	
	// 
}
