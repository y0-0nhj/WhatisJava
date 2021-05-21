import java.util.HashMap;
import java.util.Scanner;

public class HashMapTest05 {
	public static void main(String[] args) {
		// HashMap ���� - ���̵�� ��й�ȣ�� �����ϴ� �� -> �α��� ���α׷�
		// Ű: ���̵�, ��: ��й�ȣ
		HashMap<String, String> map = new HashMap<String, String>();
		Scanner sc = new Scanner(System.in);
		
		// ������ �߰�
		map.put("aaa1111", "1111");
		map.put("bbb2222", "2222");
		map.put("ccc3333", "3333");
		map.put("ddd4444", "4444");
		map.put("eee5555", "5555");
		System.out.println(map);
		
		// �α����ϴ� ��Ȳ
		System.out.println("�ż��� ���θ��� ���Ű� ȯ���մϴ�.\n���̵�� ��й�ȣ�� �Է����ּ���.");
		while(true) {
			System.out.print("���̵� �Է�: ");
			String id = sc.next();
			System.out.print("��й�ȣ �Է�: ");
			String pwd = sc.next();
			
			// ���̵��� ���� ���� -> true, false
			if(map.containsKey(id)) { // ���̵� ���� ��
				if(map.get(id).equals(pwd)) { // ���̵� ���� ��й�ȣ�� ���� ��
					System.out.println(id + "���� �α����Ͽ����ϴ�.");
					break;
				} else {                      // ���̵� ���� ��й�ȣ�� �ٸ� ��
					System.out.println("��й�ȣ�� �ٸ��ϴ�.\n��й�ȣ�� �ٽ� �Է����ּ���");
				}
			} else {                  // ���̵� ���� ��
				System.out.println("���̵� �������� �ʽ��ϴ�.\n���̵� �ٽ� �Է����ּ���.");
			}
		}
		
		sc.close();
	}
}
