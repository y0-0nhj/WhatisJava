import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Map �迭
// 1. Ű(key)�� ��(value)�� ������ ������.
// 2. ���� ������ ����.(�ε��� ����)
// 3. Ű�� �ߺ��� ����, ���� �ߺ��� ����.
// 4. Hashtable : HashMap�� ������, �������� ����ȭ ����� �־ ������ ����.
// -> HashMap�� �������� ����ȭ ����� �����Ͽ� ������ ���.

public class HashMapTest01 {
	public static void main(String[] args) {
		// HashMap ����
		// key: Integer, value: String
		// �л��� ������ �����ϴ� ������ ����, key�� �й�, value�� �л��̸�
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		// ������ �߰�
		map.put(123456, "������");
		map.put(123457, "���ؿ�");
		map.put(123458, "ä��ȭ");
		map.put(123459, "�缮��");
		map.put(123460, "������");
		
		// ������ Ȯ�� - ���� ������ ����. (������ ������� ������ ���� �ƴ�)
		System.out.println(map);
		
		// ������ �߰� - �ߺ��� Ű�� ����, �ߺ��� Ű�� ������� ���� -> �ߺ��� Ű�� ���ؼ� ���� ������ ���ο� �����ͷ� ��ü
		// ������ ����
		map.put(123460, "������");
		System.out.println(map);
		
		// ������ �߰� - �ߺ��� ���� ����, �ߺ��� ���� �����.
		map.put(222222, "ä��ȭ");
		System.out.println(map);
		
		// 1. ������ ���� - Ű�� �����ϸ� �����ʹ� ������.
		map.remove(123459);
		System.out.println(map);
		
		// 2. ������ ���� - Ű�� ���� ��� Ȯ���Ͽ� ����. -> Ű�� ���� ��� ���ƾ� ������.
		map.remove(123456, "������");
		System.out.println(map);
		System.out.println("----------");
		
		// ������ ���
		// 1. ��� - keySet()�� ���
		Set<Integer> keys = map.keySet();
		Iterator<Integer> it = keys.iterator();
		while(it.hasNext()) {
			int sno = it.next();        // Ű : �й�
			String name = map.get(sno); // �� : �̸�
			System.out.println(sno + "(" + name + ")");
		}
		System.out.println("ũ�� : " + map.size());
		System.out.println("----------");
		
		// 2. ��� - entrySet()
		// entry : Ű�� ���� ������ ������ ������ ����, map�� ó���� �� ����.
		Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
		Iterator<Map.Entry<Integer, String>> entryIt = entrySet.iterator();
		while(entryIt.hasNext()) {
			Map.Entry<Integer, String> entry = entryIt.next();
			int sno = entry.getKey();
			String name = entry.getValue();
			System.out.println(sno + "(" + name + ")");
		}
		System.out.println("ũ�� : " + map.size());
		System.out.println("----------");
		
		// ��� �����͸� ����
		map.clear();
		System.out.println(map);
		System.out.println("ũ�� : " + map.size());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
