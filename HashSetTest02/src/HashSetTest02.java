import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest02 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		
		// ������ �߰� - ������ ����
		set.add("������"); set.add("���ؿ�"); set.add("ä��ȭ"); set.add("�缮��"); set.add("������");
		System.out.println(set);
		System.out.println("ũ�� : " + set.size());
	
		// �ߺ� �����ʹ� ��� �Ұ�(���ڿ�)
		set.add("ä��ȭ");
		System.out.println(set);
		System.out.println("ũ�� : " + set.size());
		
		// �ߺ����� ���� ������ �߰� ����
		set.add("��ܿ�");
		System.out.println(set);
		System.out.println("ũ�� : " + set.size());
		
		// �����ϴ� ������ ���� 
		set.remove("���ؿ�");
		System.out.println(set);
		System.out.println("ũ�� : " + set.size());
		
		// �������� �ʴ� ������ ���� - ������ ���� ����
		set.remove("�߹���");
		System.out.println(set);
		System.out.println("ũ�� : " + set.size());
		
		// ��� 1 - for-in��
		for(String s : set) {
			System.out.println(s);
		}
		System.out.println("-----");
		
		// ��� 2 - Iterator ���
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("----");
		System.out.println(set);
		
		// �������� ���� ���� (1��)
		System.out.println(set.contains("��ܿ�"));
		System.out.println(set.contains("���ؿ�"));
		
		// �ٸ� set�� ���� ����
		HashSet<String> set2 = new HashSet<String>();
		set2.add("������"); set2.add("��ܿ�"); set2.add("ä��ȭ"); 
		
		HashSet<String> set3 = new HashSet<String>();
		set3.add("������"); set3.add("��ܿ�"); set3.add("�߹���"); 
		
		System.out.println(set.containsAll(set2));
		System.out.println(set.containsAll(set3));
		
		// �ٸ� set�� ���� �Ѳ����� �߰�
		set.addAll(set3);
		System.out.println(set);
		System.out.println("ũ�� : " + set.size());
		
		// �ٸ� set�� ���Ե� �����͸� ����(������)
		set.removeAll(set3);
		System.out.println(set);
		System.out.println("ũ�� : " + set.size());
		
		// �ٸ� set�� ����κ��� �����͸� ����(������)
		set.retainAll(set2);
		System.out.println(set);
		System.out.println("ũ�� : " + set.size());
		
		// ��� ������ ����
		set.clear();
		System.out.println(set);
		System.out.println("ũ�� : " + set.size());
		
	}

}
