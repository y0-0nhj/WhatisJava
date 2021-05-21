import java.util.ArrayList;
import java.util.Iterator;

// ȸ�� Ŭ����
class Member {
	private String no;   // ȸ����ȣ
	private String name; // ȸ���̸�
	private int age;     // ȸ������
	
	// ������
	public Member(String no, String name, int age) {
		this.no = no;
		this.name = name;
		this.age = age;
	}
	
	// getter
	public String getNo() {
		return no;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	// setter
	public void setNo(String no) {
		this.no = no;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	// ��� - toString()
	public String toString() {
		return no + "(" + name + ") : " + age;
	}
	
}

public class ArrayListTest02 {
	public static void main(String[] args) {
		// 1. Member���� �ν��Ͻ��� �����ϴ� ArrayList ����
		System.out.println("- 1. ����Ʈ ����");
		ArrayList<Member> list = new ArrayList<Member>();
		
		// 2. ����Ʈ�� Member 5���� �߰�
		System.out.println("- 2. ����Ʈ�� ������ �߰�");
		list.add(new Member("123456", "������", 40));
		list.add(new Member("123457", "�缮��", 41));
		list.add(new Member("123458", "�߹���", 32));
		list.add(new Member("123459", "ä��ȭ", 38));
		list.add(new Member("123460", "������", 39));
		//System.out.println(list);
		
		// 3. ���
		System.out.println("- 3. ����Ʈ�� ������ ���");
		for(Member m : list) {
			System.out.println(m);
		}
		System.out.println("ũ��: " + list.size());
	
		// 4. �������� ������ �߰� (1��) - �� �ڿ� �߰�
		System.out.println("- 4. �� �ڿ� ������ �߰�");
		list.add(new Member("223344", "��ܿ�", 30));
		
		for(Member m : list) {
			System.out.println(m);
		}
		System.out.println("ũ��: " + list.size());
		
		// 5. ��������� ������ �߰�(1��) - �߰����� �߰�, ������ �ڿ� ���ؿ� �߰�
		System.out.println("- 5. �߰��� ������ �߰�");
		//list.add(1, new Member("778899", "���ؿ�", 40));
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getName().equals("������")) {
				list.add(i+1, new Member("778899", "���ؿ�", 40));
			}
		}
		
		for(Member m : list) {
			System.out.println(m);
		}
		System.out.println("ũ��: " + list.size());
		
		// 6. �����͸� ���� - �缮���� ���̸� 43���� ����
		System.out.println("- 6. ������ ����");
//		Member member = list.get(2);
//		member.setAge(43);
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getName().equals("�缮��")) {
				list.get(i).setAge(43);
			}
		}
		
		for(Member m : list) {
			System.out.println(m);
		}
		System.out.println("ũ��: " + list.size());
		
		// 7. �����͸� ���� - �߹����� �����͸� ����
		System.out.println("- 7. ������ ����");
		//list.remove(3);
		
		for(int i=list.size()-1; i>=0; i--) {
			if(list.get(i).getName().equals("�߹���")) {
				list.remove(i);
			}
		}
		
		for(Member m : list) {
			System.out.println(m);
		}
		System.out.println("ũ��: " + list.size());
		
		// 8. ���
		System.out.println("- 8. ��ü ������ ���");
		// 8-1. �⺻ for��
//		for(int i=0; i<list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		
		// 8-2. for-in��
//		for(Member m : list) {
//			System.out.println(m);
//		}
		
		// 8-3. Iterator(�ݺ���) Ŭ���� Ȱ��
		Iterator<Member> it = list.iterator();
		while(it.hasNext()) {
//			Member member = it.next();
//			System.out.println(member);
			System.out.println(it.next());
		}
		System.out.println("ũ��: " + list.size());
		
		// end
	}

}
