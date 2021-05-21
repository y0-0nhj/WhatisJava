
// ���� Ŭ���� - ���� ���� Ŭ����
class Account {
	private int balance = 1000;
	
	// ���� �޼ҵ�
	// �Ӱ迵��(critical section) -> ����ȭ�� �������� �����ؾ���.
	public synchronized void withdraw(int money) {
		if(balance >= money) {
			for(int i=0; i<100; i++) {
				Thread.yield();
			}
			balance -= money;
		}
	}
	
	public int getBalance() {
		return balance;
	}
}

// ����� ������
class UserThread implements Runnable {
	Account acc = new Account();
	
	// �����ڵ�
	@Override
	public void run() {
		while(acc.getBalance() > 0) {
			int money = (int)(Math.random() * 3 + 1) * 100; // 100, 200, 300 ���� ����
			acc.withdraw(money);
			System.out.println(Thread.currentThread().getName() + " : " + money + " ����");
			System.out.println(Thread.currentThread().getName() + "'s balance : " + acc.getBalance());
		}
	}
}


public class ThreadTest09 {
	public static void main(String[] args) {
		UserThread user = new UserThread();
		Thread th1 = new Thread(user);
		Thread th2 = new Thread(user);
		
		// �����带 ���ÿ� �⵿
		th1.start();
		th2.start();
	}

}
