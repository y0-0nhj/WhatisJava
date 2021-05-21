import java.util.TreeSet;

// Set �迭
// 1. ������ ����
// 2. �ߺ� �����͸� ������� ����.

// HashSet
// 1. Hashing ������ ���� ����� Ȱ��
// 2. Hashing : �迭�� ��ũ�帮��Ʈ�� ����� Ȱ���Ͽ� �˻��ӵ� ���� ����.

// TreeSet
// 1. Tree ������ ���� ����� Ȱ��
// 2. Tree : �����͸� ������ �� �����ϸ鼭 ����, �˻��� �Ҷ� ȿ���� ����, ����� ���� �ð��� ���� ���� �ɸ�.

public class TreeSetTest01 {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		//HashSet<Integer> set = new HashSet<Integer>();
		
		// ������ �߰� - ������������ ���ĵǾ� ���
		set.add(82); set.add(63); set.add(58); set.add(97); set.add(76);
		System.out.println(set);
		System.out.println("ũ�� : " + set.size());
		
		// �ߺ����� ���� ������ �߰� : ���
		set.add(88);
		System.out.println(set);
		System.out.println("ũ�� : " + set.size());
		
		// �ߺ��� ������ �߰� : �ߺ� �����ʹ� ��� �Ұ�
		set.add(63);
		System.out.println(set);
		System.out.println("ũ�� : " + set.size());
		
		// ������ ����
		set.remove(97);
		System.out.println(set);
		System.out.println("ũ�� : " + set.size());
		
		// ��� ������ ����
		set.clear();
		System.out.println(set);
		System.out.println("ũ�� : " + set.size());
		
		
	}

}
