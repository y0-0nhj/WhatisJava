
class Member {
	private int no;      // ȸ����ȣ
	private String name; // ȸ���̸�
	
	public Member(int no, String name) {
		this.no = no;
		this.name = name;
	}
	
	public int getNo() {
		return no;
	}
	
	public String getName() {
		return name;
	}
	
	public void setNo(int no) {
		this.no = no;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return no + "(" + name + ")";
	}
	
}

public class ExceptionTest09 {
	public static void main(String[] args) {
		/*
		// 1. ���� �߻� ��Ȳ
		Member[] members = new Member[] {
			new Member(123456, "������"),
			new Member(123457, "���ؿ�"),
			new Member(123458, "ä��ȭ"),
			new Member(123459, "�缮��"),
			new Member(123460, "������"),
		};
		
		try {
			// ���� �߻� - �迭�� �ε����� �Ѵ� ����
			for(int i=0; i<=members.length; i++) {
				System.out.println(members[i].toString());
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("�迭�� �ε����� ������ ������ϴ�.");
		}
		*/
		
		Member[] members = new Member[5];
		int[] no = {123456, 123457, 123458, 123459};
		String[] names = {"������", "���ؿ�", "ä��ȭ", "�缮��"};
		
		for(int i=0; i<names.length; i++) {
			members[i] = new Member(no[i], names[i]);
		}
		
		// ���� �߻� - member[4]�� �����ϴ� �����ʹ� �������� ����. 
		try {
			for(int i=0; i<members.length; i++) { 
				System.out.println(members[i].toString());
			}
		} catch(NullPointerException e) {
			System.err.println("������ ��ü�� �������� �ʽ��ϴ�.");
		}
		
		
		System.out.println("--- Part 2 ---");
		System.out.println("ȸ���� ���� ó���� �ϰ� �ֽ��ϴ�.");
		
	
	}

}
