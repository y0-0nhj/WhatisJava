
// 공유 클래스 - 은행 계좌 클래스
class Account {
	private int balance = 1000;
	
	// 인출 메소드
	// 임계영역(critical section) -> 동기화된 영역으로 변경해야함.
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

// 사용자 쓰레드
class UserThread implements Runnable {
	Account acc = new Account();
	
	// 실행코드
	@Override
	public void run() {
		while(acc.getBalance() > 0) {
			int money = (int)(Math.random() * 3 + 1) * 100; // 100, 200, 300 중의 난수
			acc.withdraw(money);
			System.out.println(Thread.currentThread().getName() + " : " + money + " 인출");
			System.out.println(Thread.currentThread().getName() + "'s balance : " + acc.getBalance());
		}
	}
}


public class ThreadTest09 {
	public static void main(String[] args) {
		UserThread user = new UserThread();
		Thread th1 = new Thread(user);
		Thread th2 = new Thread(user);
		
		// 쓰레드를 동시에 기동
		th1.start();
		th2.start();
	}

}
