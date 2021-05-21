import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HashMapTest02 {
	public static void main(String[] args) {
		// HashMap ����
		// �ѿ�����
		// key: �ѱ۴ܾ�, value: ����ܾ�
		HashMap<String, String> map = new HashMap<String, String>();
		
		// ������ �߰�
		map.put("����", "lion");
		map.put("�ڳ���", "elephant");
		map.put("ǥ��", "leopard");
		map.put("��踻", "zebra");
		map.put("�ϸ�", "hippo");
		map.put("�⸰", "giraffe");
		map.put("��", "wildebeest");
		map.put("���̿���", "hyena");
		map.put("ġŸ", "cheetah");
		map.put("����", "gazelle");
		map.put("ȣ����", "tiger");
		map.put("���ȶ�", "deer");
		
		// ������ Ȯ��
		System.out.println(map);
		System.out.println("ũ��: " + map.size());
		
		// ������ ����
		System.out.println("�������� ������ī�� ���� �ʴ� ������ �����Ͻÿ�.");
		map.remove("ȣ����");
		System.out.println(map);
		System.out.println("ũ��: " + map.size());
		
		// ������ ����
		System.out.println("�������� �߸��� ������ �̸��� �����Ͻÿ�.");
		map.put("���ȶ�", "impala");
		System.out.println(map);
		System.out.println("ũ��: " + map.size());
		System.out.println("----------");
		
		// ������ ���
		// 1. ��� - keySet() ���
		Set<String> keySet = map.keySet();
		Iterator<String> it = keySet.iterator();
		while(it.hasNext()) {
			String kor = it.next();    // �ѱ��̸�
			String eng = map.get(kor); // �����̸�
			System.out.println(kor + "(" + eng + ")");
		}
		System.out.println("----------");
		
		// 2. ��� - entrySet(), Iterator() ���
		Set<Map.Entry<String, String>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, String>> entryIt = entrySet.iterator();
		while(entryIt.hasNext()) {
			Map.Entry<String, String> entry = entryIt.next();
			String kor = entry.getKey();
			String eng = entry.getValue();
			System.out.println(kor + "(" + eng + ")");
		}
		System.out.println("----------");
		
		// 3. ���  - entrySet(), for-in��
		entrySet = map.entrySet(); // entrySet()���� ������
		for(Map.Entry<String, String> entry : entrySet) {
			String kor = entry.getKey();
			String eng = entry.getValue();
			System.out.println(kor + "(" + eng + ")");
		}
		System.out.println("----------");
		
		// �ѱ۴ܾ��� �Է��ϸ� ����ܾ �˷��ִ� ���α׷�
		// ex) �ϸ��� ����� hippo�Դϴ�.
		Scanner sc = new Scanner(System.in);
		System.out.println("--- ������ī ���� ���� ���߱� ���� ---");
		System.out.println("--- �ѱ۴ܾ �Է��ϸ� ����ܾ �˷��帳�ϴ�. ---");
		System.out.print("�ѱ۴ܾ� �Է�: ");
		String kor = sc.next();
		String eng = map.get(kor); // get() �޼ҵ�� Ű�� �ش��ϴ� ������ ������ null�� ����
		if(eng == null) {
			System.out.println(kor + "�� �ش��ϴ� ����ܾ�� �����ϴ�.");
		} else {
			System.out.println(kor + "�� ����� " + eng + "�Դϴ�.");
		}
		
		sc.close();
	}

}
