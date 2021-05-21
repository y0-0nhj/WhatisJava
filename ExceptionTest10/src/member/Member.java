package member;

public class Member {
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