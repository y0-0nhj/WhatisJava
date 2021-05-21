import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

// TreeMap�� Ư¡
// 1. Ű�� ������ �������� �ʴ´�.
// 2. Ű�� ���� �������� ������������ �����Ͽ� �����Ѵ�.
// 3. Ű�� �ߺ��� ������� �ʴ´�.
// 4. ���� �ߺ��� ����Ѵ�.

public class TreeMapTest01 {
	public static void main(String[] args) {
		// Ű:���(Integer), ��:�����̸�(String)�� �����ϴ� TreeMap�� ����
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		
		// ������ �߰� - �������� �����Ͽ� ����
		map.put(444444, "�缮��");
		map.put(222222, "���ؿ�");
		map.put(333333, "ä��ȭ");
		map.put(555555, "������");
		map.put(111111, "������");
		System.out.println(map);
		
		// Ű�� �ߺ� Ȯ�� - ������� ����, ���� �����͸� ���ο� �����ͷ� ���� ��.
		map.put(444444, "��ܿ�");
		System.out.println(map);
		
		// ���� �ߺ� Ȯ�� - �����.
		map.put(666666, "ä��ȭ");
		System.out.println(map);
		System.out.println("----------");
		
		// ��� 1 - keySet(), Iterator
		Set<Integer> keySet = map.keySet();
		Iterator<Integer> it = keySet.iterator();
		while(it.hasNext()) {
			int no = it.next();  	   // ���
			String name = map.get(no); // �����
			System.out.println("���: " + no + ", �����: " + name);
		}
		System.out.println("----------");
		
		// ��� 2 - entrySet(), Iterator
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		Iterator<Entry<Integer, String>> it2 = entrySet.iterator();
		while(it2.hasNext()) {
			Entry<Integer, String> entry = it2.next();
			int no = entry.getKey();
			String name = entry.getValue();
			System.out.println("���: " + no + ", �����: " + name);
		}
		System.out.println("----------");
		
		// ��� 3 - entrySet(), for-in
		entrySet = map.entrySet(); // ������
		for(Entry<Integer, String> entry : entrySet) {
			int no = entry.getKey();
			String name = entry.getValue();
			System.out.println("���: " + no + ", �����: " + name);
		}
		System.out.println("----------");
		
	}
}
