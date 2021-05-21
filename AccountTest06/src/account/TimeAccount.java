package account;

// ����� �ϴ� Ŭ���� - ���� Ŭ����, �θ� Ŭ����, ��� Ŭ����, ���� Ŭ����(super)
// ����� �޴� Ŭ���� - ���� Ŭ����, �ڽ� Ŭ����, �Ļ� Ŭ����, ���� Ŭ����(sub)

// TimeAccount Ŭ������ Account Ŭ������ Ȯ���Ѵ�.
// TimeAccount Ŭ������ Account Ŭ�����κ��� ��� ���� ��� �޴´�. 
public class TimeAccount extends Account {
	private int timeBalance; // �������ݱݾ�
	
	// ��Ӱ��迡���� �����ڿ� �ʱ��ڴ� ��ӹ��� ���Ѵ�.
	// super() : �ڽ� Ŭ�������� �θ� Ŭ������ �����ڸ� ȣ���ϴ� ������ ���
	public TimeAccount(String name, String no, int balance, int timeBalance) {
		super(name, no, balance);
		this.timeBalance = timeBalance;
	}
	
	// getter
	public int getTimeBalance() { 
		return timeBalance;
	}
	
	// setter
	public void setTimeBalance(int timeBalance) { 
		this.timeBalance = timeBalance;
	}
	
	// �ؾ�
	public void cancel() {
		deposit(timeBalance);
		timeBalance = 0;
	}
	
	// ���
	// super. : �θ�Ŭ������ �޼ҵ� Ȥ�� ���� ȣ��
	// super. : �θ�Ŭ������ ����� �����ϴ� ���
	public void showInfo() {
		super.showInfo();
		System.out.println("���������ܰ� : " + timeBalance);
		System.out.println();
	}
	
	
	
	
	
	
	
}
