
// �� �ν��Ͻ� �ĺ���ȣ �����Ͽ� ���
class Account {
	// ��� ����
	// �ν��Ͻ� ����
	private String name; 
	private String no;
	private int balance;
	private int id; // �ĺ���ȣ(�Ϸù�ȣ) : �ν��Ͻ��� ���� ������� 1, 2, 3 ...
	
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

public class AccountTest05 {
	public static void main(String[] args) {
		Account john = new Account("john", "123456", 1000);
		Account mary = new Account("mary", "654321", 200);
		Account tomy = new Account("tomy", "112233", 3000);
		
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
		System.out.println();
		
		System.out.println("�� Tomy�� ����");
		System.out.println("���¸��� : " + tomy.getName());
		System.out.println("���¹�ȣ : " + tomy.getNo());
		System.out.println("�����ܰ� : " + tomy.getBalance());
		System.out.println();
	}

}
