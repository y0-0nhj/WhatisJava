package account;

public class Account {
	// 1. ��ӹ��� �ڽĿ��� ����� �� �ֵ��� ���� ������ ��ȭ, private -> protected
	// - ���� ������ ��ȭ�ϴ� ����� ������� ����.
//	protected String name; 
//	protected String no;
//	protected int balance;
	
	private String name; 
	private String no;
	private int balance;
	
	public Account() { }
	
	// ������
	public Account(String name, String no, int balance) {
		this.name = name;
		this.no = no;
		this.balance = balance;
	}
	
	// getter �޼ҵ� - ���� �д� �޼ҵ�
	public String getName() {
		return name;
	}
	
	public String getNo() {
		return no;
	}
	
	public int getBalance() {
		return balance;
	}
	
	// setter �޼ҵ� - ���� �����ϴ� �޼ҵ�
	public void setName(String name) {
		this.name = name;
	}
		
	public void setNo(String no) {
		this.no = no;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	// �Ա�
	public void deposit(int money) {
		balance += money;
	}
	
	// ���
	public void withdraw(int money) {
		balance -= money;
	}
	
	// ���
	public void showInfo() {
		System.out.println("���¸��� : " + name);
		System.out.println("���¹�ȣ : " + no);
		System.out.println("�����ܰ� : " + balance);
		System.out.println();
	}
}
