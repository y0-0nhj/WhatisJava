
class Account {
	private String name;
	private String no;
	private long balance;
	
	public Account(String name, String no, long balance) {
		this.name = name;
		this.no = no;
		this.balance = balance;
	}
	
	// �Ա� - ������ : ���̳ʽ� �ݾ��� �Ա��Ҽ��� ����.
	// 1. ����ó���� Ȱ������ ���� ���
//	public void deposit(long money) {
//		if(money < 0) {
//			System.out.println("���̳ʽ� �ݾ��� �Ա��� ���� �����ϴ�.");
//			return;
//		}
//		this.balance += money;
//		System.out.println(name + "�� ���¿� " + money +"���� �ԱݵǾ����ϴ�.");
//	}
	
	// 2. ����ó�� Ŭ���� Ȱ��
	public void deposit(long money) throws MinusDepositException {
		if(money < 0) {
			throw new MinusDepositException("���̳ʽ� �Ա� ���� : " + money + "���� �Ա��� �� �����ϴ�.");
		}
		this.balance += money;
		System.out.println(name + "�� ���¿� " + money +"���� �ԱݵǾ����ϴ�.");
	}
	
	// ��� - ������ : �����ܰ��� �� ū �ݾ��� ����� ���� ����.
	// 1. ����ó���� Ȱ������ ���� ���
//	public void withdraw(long money) {
//		if(this.balance < money) {
//			System.out.println("�����ܰ��� ū �ݾ��� ����� ���� �����ϴ�.");
//			return;
//		}
//		this.balance -= money;
//		System.out.println(name + "�� ���¿��� " + money + "���� ��ݵǾ����ϴ�.");
//	}
	
	// 2.����ó�� Ŭ���� Ȱ��
	public void withdraw(long money) throws BalanceInsufficientException {
		if(this.balance < money) {
			throw new BalanceInsufficientException("�����ܰ� ���� : " + (money-balance) + "���� �����մϴ�.");
		}
		this.balance -= money;
		System.out.println(name + "�� ���¿��� " + money + "���� ��ݵǾ����ϴ�.");
	}
	
	// ���
	public String toString() {
		return "[" + no + "] " + name + " : " + balance + "��";
	}
}

// �Աݿ���ó�� Ŭ���� : ���̳ʽ� �ݾ׿� ���ؼ��� �Ա� �Ұ�
class MinusDepositException extends Exception {
	private static final long serialVersionUID = 1L;

	public MinusDepositException(String msg) {
		super(msg);
	}
	
}

// ��ݿ���ó�� Ŭ���� : �����ܰ��� ū �ݾ׿� ���ؼ��� ��� �Ұ�
class BalanceInsufficientException extends Exception {
	private static final long serialVersionUID = 1L;

	public BalanceInsufficientException(String msg) {
		super(msg);
	}
	
}


public class ExceptionTest11 {
	public static void main(String[] args) {
		Account acc1 = new Account("������", "123456", 1000);
		System.out.println(acc1);
		
		// ���
		try {
			acc1.withdraw(1500);
		} catch(BalanceInsufficientException e) {
			System.err.println(e.getMessage());
		}
		System.out.println(acc1);
		
		// �Ա�
		try {
			acc1.deposit(-500);
		} catch(MinusDepositException e) {
			System.err.println(e.getMessage());
		}
		System.out.println(acc1);
	}

}
