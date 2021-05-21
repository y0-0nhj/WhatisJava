import java.util.HashSet;
import java.util.Iterator;

// Set �迭�� Ư¡
// 1. ������ ����.(�ε����� ����)
// 2. �ߺ� �����͸� ������� ����.
// 3. HashSet, TreeSet ...

public class HashSetTest01 {
	public static void main(String[] args) {
		// HashSet ����
		HashSet<Integer> set = new HashSet<Integer>();
		
		// ������ �߰�
		set.add(66);
		set.add(75);
		set.add(57);
		set.add(96);
		set.add(45);
		
		// �����͸� ���� ������� ������ ���� �ƴ�. -> ������ ����.
		// hashing ����� �̿��� ������ ���� ����� ���.
		System.out.println(set);
		System.out.println("ũ�� : " + set.size());
		
		// �ߺ��� �����ʹ� ��� �Ұ�
		set.add(57);
		System.out.println(set);
		System.out.println("ũ�� : " + set.size());
		
		// �ߺ����� ���� �����ʹ� ���
		set.add(83);
		System.out.println(set);
		System.out.println("ũ�� : " + set.size());
		
		// ������ ���� - �����ϴ� ������ ����
		set.remove(96);
		System.out.println(set);
		System.out.println("ũ�� : " + set.size());
		
		// ������ ���� - �������� �ʴ� �����͸� ���� : ������ �߻����� �ʰ� ���������� �۵� (����ó���� �Ǿ�����)
		set.remove(88);
		System.out.println(set);
		System.out.println("ũ�� : " + set.size());
		
		// ��� 1 - for-in���� ��밡��, �⺻ for���� ���Ұ�(�ε����� �����Ƿ�)
		int sum = 0;
		for(int i : set) {
			sum += i;
			System.out.println(i);
		}
		System.out.println("���� : " + sum);
		
		// ��� 2 - Iterator ���
		sum = 0;
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			int i = it.next();
			sum += i;
			System.out.println(i);
		}
		System.out.println("���� : " + sum);
		
	}

}
