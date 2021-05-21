// ������� Ŭ���� - ���¸���, ���¹�ȣ, �����ܰ�

// ���� ������(������) - modifer
// private - �ڽ��� Ŭ���������� ��� ����, �ٸ� Ŭ���������� ��� �Ұ�
// public - ��𼭳� ��� ����
class Account {
	// ��� ����
	// �ν��Ͻ� ����
	private String name; 
	private String no;
	private int balance;
	
	// �⺻ ������
	Account() { }
	
	// ������ �����ε�
	Account(String name, String no, int balance) {
		this.name = name;
		this.no = no;
		this.balance = balance;
	}
	
	// setter �޼ҵ�
	// ���� �����ϴ� �޼ҵ�
	public void setName(String name) {
		this.name = name;
	}
	
	// getter �޼ҵ�
	// ���� �д� �޼ҵ�
	public String getName() {
		return name;
	}
	
	public void setNo(String no) {
		this.no = no;
	}
	
	public String getNo() {
		return no;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public int getBalance() {
		return balance;
	}
	
	// �Ա�
	public void deposit(int money) {
		balance += money;
	}
	
	// ���
	public void withdraw(int money) {
		balance -= money;
	}
	
}

public class AccountTest04 {
	public static void main(String[] args) {
		// �ν��Ͻ� ����
		// 1. john�̶�� �������� ����
		// 2. john�� �ν��Ͻ� ����
		// 3. ������ ȣ��
		Account john = new Account("john", "123456", 1000);
		Account mary = new Account("mary", "654321", 200);
		//Account tom = new Account();
		
		//john.balance -= 200;
		john.withdraw(200); // ���
		mary.deposit(100);  // �Ա�
		
		
		// ���
		System.out.println("�� John�� ����");
		System.out.println("���¸��� : " + john.getName());
		System.out.println("���¹�ȣ : " + john.getNo());
		System.out.println("�����ܰ� : " + john.getBalance());
		System.out.println();
		
		System.out.println("�� Mary�� ����");
		System.out.println("���¸��� : " + mary.getName());
		System.out.println("���¹�ȣ : " + mary.getNo());
		System.out.println("�����ܰ� : " + mary.getBalance());
	}

}
