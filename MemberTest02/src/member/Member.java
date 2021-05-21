package member;

// ����) 
// 1. Member Ŭ���� : ȸ�� Ŭ����, �θ� Ŭ����, 
// - �ν��Ͻ� ���� : name(ȸ���̸�), no(ȸ����ȣ), age(ȸ������)
// - ������, getter/setter �޼ҵ�, ��� �޼ҵ�(showInfo, toString)

// 2. SpecialMember : Ư��ȸ�� Ŭ����, Member Ŭ�����κ��� ��ӹ��� �ڽ� Ŭ����
// - �ν��Ͻ� ���� : privilege(Ư������) ex) 10% ����, ����, 20% ���� ����, ���� ����, 1�� ���� ...
// - ������, getter/setter �޼ҵ�, ��¸޼ҵ� - �������̵�

// 3. main() �޼ҵ� 
// - Member 3��, SpecialMember 3�� -> �迭�� ����
// - �������� �����Ͽ� ���(2���� ���)


public class Member {
	private String name;
	private String no;
	private int age;
	
	public Member(String name, String no, int age) {
		this.name = name;
		this.no = no;
		this.age = age;
	}
	
	// getter 
	public String getName() {
		return name;
	}
	
	public String getNo() {
		return no;
	}
	
	public int getAge() {
		return age;
	}
	
	// setter 
	public void setName(String name) {
		this.name = name;
	}
	
	public void setNo(String no) {
		this.no = no;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	// ���1
	public void showInfo() {
		System.out.println("ȸ���̸� : " + name);
		System.out.println("ȸ����ȣ : " + no);
		System.out.println("ȸ������ : " + age);
	}
	
	// ���2
	@Override
	public String toString() {
		return "ȸ���̸�: " + name + ", ��ȣ: " + no + ", ���� : " + age; 
	}

}
