import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapTest04 {
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
		System.out.println("������������:" + map);
		
		NavigableMap<Integer, String> map2 = map.descendingMap();
		System.out.println("������������: " + map2);
		
		
		// 95�� ������(������ ���� ������)
		SortedMap<Integer, String> map3 = map.headMap(95);
		System.out.println("95������ ���� ��: " + map3);
		
		// 95�� ����(������ �� ����)
		SortedMap<Integer, String> map4 = map.headMap(95, true);
		System.out.println("95������ ���� ��: " + map4);
		
		// 95�� ����(������ ���� ����)
		SortedMap<Integer, String> map5 = map.tailMap(95);
		System.out.println("95������ ū ��: " + map5);
		
		// 95�� ������(������ ���� ������)
		SortedMap<Integer, String> map6 = map.tailMap(95, false);
		System.out.println("95������ ū ��: " + map6);
		
	}

}
