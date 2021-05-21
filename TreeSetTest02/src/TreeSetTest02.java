import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest02 {
	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<String>();
		
		// ������ �߰� - �����Ͱ� ������������ ���ĵǾ� ���
		set.add("������"); set.add("���ؿ�"); set.add("ä��ȭ"); set.add("�缮��"); set.add("������");
		System.out.println(set);
		System.out.println("ũ�� : "+ set.size());
		
		// �ߺ����� �ʴ� ������ �߰� : ���
		set.add("������");
		System.out.println(set);
		System.out.println("ũ�� : "+ set.size());
		
		// �ߺ��� ������ �߰� : �ߺ� ������ ��� �Ұ�
		set.add("������");
		System.out.println(set);
		System.out.println("ũ�� : "+ set.size());
		
		// ������ ����
		set.remove("ä��ȭ");
		System.out.println(set);
		System.out.println("ũ�� : "+ set.size());
		System.out.println("----------");
		
		// ���1 - for-in��
		for(String s : set) {
			System.out.println(s);
		}
		System.out.println("----------");
		
		// ���2 - Iterator ���
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("----------");
		
		
	}

}
