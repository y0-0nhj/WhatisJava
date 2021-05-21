import java.util.HashSet;
import java.util.Iterator;

class Member {
	private String name;
	private int age;
	
	// ������
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// getter
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	// setter
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	// toString()
	@Override
	public String toString() {
		return name + "(" + age + ")";
	}
	
	// HashSet���� ����Ҽ� �ֵ��� �ϴ�  �� ���� �޼ҵ带 �������̵�
	@Override
	public int hashCode() {
		return (name+age).hashCode();
	}
	
	@Override 
	public boolean equals(Object o) {
		if(o instanceof Member) {
			Member m = (Member)o;
			return this.name.equals(m.name) && this.age == m.age;
		} 
		return false;
	}
}

// ����)
// 1. Member Ŭ������ �ϼ��Ͻÿ�.
// 2. main() �޼ҵ忡 Member Ŭ������ ��ü�� �����ϴ� HashSet�� set�� �����Ͻÿ�.
// 3. set�� 5���� �����͸� �߰��Ͻÿ�.
// 4. ������ ������ Ȯ���Ͻÿ�.
// 5. �ߺ��� �������� ��뿩�θ� Ȯ���Ͻÿ�.
// 6. ���ؿ� �����͸� �����Ͻÿ�.
// 7. �������� ���̸� 45�� �����Ͻÿ�.
// 8. set�� �����͸� 2���� ������� ����Ͻÿ�. (for-in��, Iterator ���)

public class HashSetTest03 {
	public static void main(String[] args) {
		// 2. HashSet ����
		HashSet<Member> set = new HashSet<Member>();
		
		// 3. ������ �߰�  
		// 4. ���� ����
		set.add(new Member("������", 42));
		set.add(new Member("���ؿ�", 41));
		set.add(new Member("������", 39));
		set.add(new Member("ä��ȭ", 38));
		set.add(new Member("�缮��", 40));
		System.out.println(set);
		System.out.println("ũ�� : " + set.size());
		
		// 5-1. �ߺ� ������ �߰� : �̸��� �ߺ� -> ���
		set.add(new Member("ä��ȭ", 25));
		System.out.println(set);
		System.out.println("ũ�� : " + set.size());
		
		// 5-2. �ߺ� ������ �߰� : ���̸� �ߺ� -> ���
		set.add(new Member("������", 38));
		System.out.println(set);
		System.out.println("ũ�� : " + set.size());
		
		// 5-3. �ߺ� ������ �߰� : �̸��� ���� ��� �ߺ�
		// -> ������ : �� ������ �ذ��ؾ߸� set�� ��ü�� ��� ����ϴ� ���� ��������.
		// -> �ذ�å : set���� ����ϴ� Ŭ���� �ȿ�  hashCode(), equals() �� �� ���� �޼ҵ带 �������̵��ؾ߸� ��.
		set.add(new Member("������", 42));
		System.out.println(set);
		System.out.println("ũ�� : " + set.size());
		
		// 6. �������� ����
		int age = 0;
		for(Member m : set) {
			if(m.getName().equals("���ؿ�")) {
				age = m.getAge();
			}
		}
		set.remove(new Member("���ؿ�", age));
		
		System.out.println(set);
		System.out.println("ũ�� : " + set.size());
		
		
		// 7. �������� ����
		age = 0;
		for(Member m : set) {
			if(m.getName().equals("������")) {
				age = m.getAge();
			}
		}
		set.remove(new Member("������", age));
		set.add(new Member("������", 45));
		
		System.out.println(set);
		System.out.println("ũ�� : " + set.size());
		
		// 8-1. ��� : for-in��
		for(Member m : set) {
			System.out.println(m);
		}
		System.out.println("-----");
		
		// 8-2. ��� : Iterator ���
		Iterator<Member> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("-----");
		
		
		
		
		
		
		
	}

}
