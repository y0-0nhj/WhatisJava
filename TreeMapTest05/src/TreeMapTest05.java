import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapTest05 {
	public static void main(String[] args) {
		// Ű: �����̸�, ��: ���ϰ���
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		
		// ������ �߰� - Ű�� �������� �������� �����Ͽ� ����
		map.put("grape", 3000);
		map.put("pineapple", 6000);
		map.put("cherry", 4500);
		map.put("apple", 2000);
		map.put("blueberry", 3500);
		map.put("melon", 3300);
		map.put("mango", 4200);
		map.put("watermelon", 9000);
		map.put("strawberry", 7500);
		map.put("orange", 3500);
		map.put("lemon", 2500);
		map.put("fig", 3700);
		map.put("g", 9900);
		System.out.println(map);
		
		// b���� g�ձ��� ���� (����:����, ��:������)
		SortedMap<String, Integer> map2 = map.subMap("b", "g");
		System.out.println(map2);
		
		// b���� g���� ����
		SortedMap<String, Integer> map3 = map.subMap("b", true, "gzzzzzzzzzzz", true);
		System.out.println(map3);
		
	}

}
