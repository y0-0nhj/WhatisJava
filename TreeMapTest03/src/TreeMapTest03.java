import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapTest03 {
	public static void main(String[] args) {
		// TreeMap ����, Ű: ����, ��: �л��̸�
		// Map�� �����δ� ���� ���� -> TreeMap�� �׽�Ʈ�� ���� ���
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		
		// ������ �߰� - Ű�� �������� �������� ����
		map.put(87, "������");
		map.put(98, "���ؿ�");
		map.put(75, "ä��ȭ");
		map.put(95, "�缮��");
		map.put(80, "������");
		System.out.println(map);
		
		// TreeMap�� �پ��� �޼ҵ� Ȱ��
		
		Entry<Integer, String> entry = map.firstEntry();
		System.out.println("�������� : " + entry.getKey() + "(" + entry.getValue() + ")");
		
		entry = map.lastEntry();
		System.out.println("�ְ����� : " + entry.getKey() + "(" + entry.getValue() + ")");
		
		entry = map.lowerEntry(95);  // 95���� �������� ����
		System.out.println("95�� �ٷ� �Ʒ� ���� : " + entry.getKey() + "(" + entry.getValue() + ")");
		
		entry = map.higherEntry(95); // 95���� �������� ����
		System.out.println("95�� �ٷ� ���� ���� : " + entry.getKey() + "(" + entry.getValue() + ")");
		
		entry = map.floorEntry(95); // 95���� ������.
		System.out.println("95���̰ų� �ٷ� �Ʒ� ���� : " + entry.getKey() + "(" + entry.getValue() + ")");
		
		entry = map.ceilingEntry(95); // 95���� ������.
		System.out.println("95���̰ų� �ٷ� ���� ���� : " + entry.getKey() + "(" + entry.getValue() + ")");
		System.out.println("----------");
		
		// ��� - isEmpty() �޼ҵ� Ȱ��
		// pollFirstEntry() : ù��° �����ͺ��� ������, ������.
		// pollLastEntry() : ������ �����ͺ��� ������, ������.
		while(!map.isEmpty()) {
			//entry = map.pollFirstEntry();
			entry = map.pollLastEntry();
			System.out.println(entry.getKey() + "(" + entry.getValue() + ")");
		}
		System.out.println("----------");
		System.out.println(map);
		System.out.println("ũ��: " + map.size());
		
	}

}
