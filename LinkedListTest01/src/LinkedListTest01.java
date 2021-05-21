import java.util.LinkedList;

public class LinkedListTest01 {
	public static void main(String[] args) {
		// LinkedList ����
		LinkedList<String> list = new LinkedList<String>();
		
		// 1. ����Ʈ �� �ڿ� ������ �߰� 
		list.add("������"); list.add("���ؿ�"); list.add("�缮��"); list.add("������"); list.add("ä��ȭ");
		System.out.println(list);
		
		// 2. ����Ʈ �߰��� ������ �߰� - ������ �ڿ� ��ܿ� ������ �߰�
		list.add(4, "��ܿ�");
		System.out.println(list);
		
		// 3. ����Ʈ���� ������ ���� - ���ؿ� �����͸� ����
		//list.remove(1);
		list.remove("���ؿ�");
		System.out.println(list);
		
		// 4. ����Ʈ�� ������ ���� - �缮���� �߹��Ϸ� ����
		list.set(1, "�߹���");
		System.out.println(list);
		
		// LinkedList Ŭ������ �߰��� ���
		System.out.println("----------");
		// 5. ����Ʈ�� ù��°�� ������ �߰� - ��ġȫ �߰�
		//list.add(0, "��ġȫ");
		list.addFirst("��ġȫ");
		System.out.println(list);
		
		// 6. ����Ʈ�� �������� ������ �߰� - ������ �߰�
		//list.add("������");
		list.addLast("������");
		System.out.println(list);
		
		// 7. ����Ʈ�� ù��° �����͸� ���� - ��ġȫ ����
		//list.remove(0);
		//list.remove("��ġȫ");
		list.removeFirst();
		System.out.println(list);
		
		// 8. ����Ʈ�� ������ �����͸� ���� - ������ ����
		//list.remove(list.size()-1);
		//list.remove("������");
		list.removeLast();
		System.out.println(list);
		
		// 9. ����Ʈ�� ù��° �����͸� Ȯ��
		//System.out.println(list.get(0));
		System.out.println(list.getFirst());
		
		// 10. ����Ʈ�� ������ �����͸� Ȯ��
		//System.out.println(list.get(list.size()-1));
		System.out.println(list.getLast());
		
		
		// end
	}

}
