package account;

public class TimeAccount extends Account {
	private int timeBalance; // �������ݱݾ�
	
	// ������
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
	
	// �������̵�(Overriding)
	// 1. �޼ҵ��� ������
	// 2. ����� ���迡�� �θ� Ŭ������ �޼ҵ带 �ڽ� Ŭ�������� �������ϴ� ��.
	// 3. ����) �ڽ� Ŭ������ �޼ҵ�� �θ� Ŭ������ �޼ҵ�� �Ϻ��ϰ� ��ġ�ؾ���.
	
	// ��� 1
	// �������̵�
	public void showInfo() {
		super.showInfo();
		System.out.println("���������ܰ� : " + timeBalance);
		System.out.println();
	}
	
	// ��� 2 - toString()
	// �������̵�
	public String toString() {
		return super.toString() + ", ��������: " + timeBalance;
		//return "���¸���: " + getName() + ", ��ȣ: " + getNo() + ", �ܰ�: " + getBalance() + ", ��������: " + timeBalance; 
	}
	
}
