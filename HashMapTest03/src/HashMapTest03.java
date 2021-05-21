import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

class Member {
	 private int no;      // ȸ����ȣ  
	 private String name; // ȸ���̸�
	 private int age;     // ȸ������
	 
	 // ������
	 public Member(int no, String name, int age) {
		 this.no = no;
		 this.name = name;
		 this.age = age;
	 }
	 
	 // getter
	 public int getNo() {
		 return no;
	 }
	 
	 public String getName() {
		 return name;
	 }
	 
	 public int getAge() {
		 return age;
	 }
	 
	 // setter
	 public void setNo(int no) {
		 this.no = no;
	 }
	 
	 public void setName(String name) {
		 this.name = name;
	 }
	 
	 public void setAge(int age) {
		 this.age = age;
	 }
	 
	 // toString()
	 public String toString() {
		 return no + "(" + name + "): " + age + "��";
	 }	 
}

// ����)
// 1. Member Ŭ������ �ϼ��Ͻÿ�.
// 2. Ű�� ��ȭ��ȣ(010-1111-1111)�̰�, ���� Member��ü�� �����ϴ� HashMap�� map�� �����Ͻÿ�.
// 3. map�� 5���� ȸ�������� �����Ͻÿ�.
// 4. ��ȭ��ȣ�� 010-2222-2222�� ȸ���� ������ �����Ͻÿ�.
// 5. ��ȭ��ȣ�� 010-3333-3333�� ȸ���� �������� �̸��� ���� ������ ��ܿ�, 32�� �����Ͻÿ�.
// 6. map�� �����͸� 3���� ������� ����Ͻÿ�.

public class HashMapTest03 {
	public static void main(String[] args) {
		// 2. HashMap ����
		HashMap<String, Member> map = new HashMap<String, Member>();
				
		// 3. ������ �߰�
		map.put("010-1111-1111", new Member(123456, "������", 40));
		map.put("010-2222-2222", new Member(123457, "���ؿ�", 41));
		map.put("010-3333-3333", new Member(123458, "ä��ȭ", 39));
		map.put("010-4444-4444", new Member(123459, "�缮��", 38));
		map.put("010-5555-5555", new Member(123460, "������", 42));
		
		// 6-1. ��� - keySet(), Iterator
		Set<String> keySet = map.keySet();
		Iterator<String> it = keySet.iterator();
		while(it.hasNext()) {
			String tel = it.next();
			Member m = map.get(tel);
			System.out.println("��ȭ��ȣ: " + tel +", ȸ������: " + m);
		}
		System.out.println("----------");
		 
		// 6-2. ��� - entrySet(), Iterator
//		Set<Map.Entry<String, Member>> entrySet = map.entrySet();
//		Iterator<Map.Entry<String, Member>> it2 = entrySet.iterator();
//		while(it2.hasNext()) {
//			Map.Entry<String, Member> entry = it2.next();
//			String tel = entry.getKey();
//			Member m = entry.getValue();
//			System.out.println("��ȭ��ȣ: " + tel + ", ȸ������: " + m);
//		}
//		System.out.println("----------");
		
		// 6-3. ��� - entrySet(), for-in
//		entrySet = map.entrySet();
//		for(Map.Entry<String, Member> entry : entrySet) {
//			String tel = entry.getKey();
//			Member m = entry.getValue();
//			System.out.println("��ȭ��ȣ: " + tel + ", ȸ������: " + m);
//		}
//		System.out.println("----------");
		
		// 4. ������ ����
		// Ű���� ã�� ������ �� null�� ����
		Member obj = map.remove("010-2222-2222");
		if(obj == null) {
			System.out.println("��ȭ��ȣ�� �������� �ʽ��ϴ�.");
		} else {
			System.out.println("�����͸� �����Ͽ����ϴ�.");
		}
		
		keySet = map.keySet();
		it = keySet.iterator();
		while(it.hasNext()) {
			String tel = it.next();
			Member m = map.get(tel);
			System.out.println("��ȭ��ȣ: " + tel +", ȸ������: " + m);
		}
		System.out.println("----------");
		
		// 5. ������ ���� -> 010-3333-3333�� �����Ͽ� ��ܿ�, 32�� ����, �й��� ������ �й��� ���
		// map.put("010-3333-3333", new Member(333333, "��ܿ�", 32)); // �й��� �� ���
		Member member = map.get("010-3333-3333"); // �й��� �� ���
		map.put("010-3333-3333", new Member(member.getNo(), "��ܿ�", 32));
		
		keySet = map.keySet();
		it = keySet.iterator();
		while(it.hasNext()) {
			String tel = it.next();
			Member m = map.get(tel);
			System.out.println("��ȭ��ȣ: " + tel +", ȸ������: " + m);
		}
		System.out.println("----------");
		
		
		
	}

}
