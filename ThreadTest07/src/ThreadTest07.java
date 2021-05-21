
// 쓰레드의 장점
// 1. 처리속도가 향상된다.(응답성이 향상된다.)
// 2. 자원을 효율적으로 사용할 수 있다.
// 3. 코드가 간결해진다.

// 쓰레드의 문제점
// 1. 동기화의 문제가 발생한다.
// 2. 교착상태(dead lock)가 발생할 수 있다.
// 3. 우선순위가 낮은 쓰레드는 영원히 실행되지 않을 수도 있다.(좀비 쓰레드)

// 공유 집계판 클래스
class SyncBoard {
	private int sum = 0;
	
	// 임계영역(critical section) -> 동기화가 이루어져야 영역
	// 해결책 -> 동기화가 이루어지도록 해 주면 된다.
	
	// 1번 - 동기화된 함수로 선언. -> 하나의 쓰레드가 들어오면 lock을 걸다. 모니터(moniter)를 한다.
	/*
	public synchronized void add() {
		int n = sum;
		for(int i=0; i<100; i++) {
			Thread.yield();
		}
		n += 10;
		sum = n;
		System.out.println(Thread.currentThread().getName() + " : " + sum);
	}*/
	
	// 2번 - 동기화된 영역 설정.
	public void add() {
		
		// 임계영역 -> 동기화된 영역
		synchronized(this) {
			int n = sum;
			for(int i=0; i<100; i++) {
				Thread.yield();
			}
			n += 10;
			sum = n;
		}
		
		System.out.println(Thread.currentThread().getName() + " : " + sum);
	}
	
	public int getSum() {
		return sum;
	}
}

// 일꾼 쓰레드 클래스
class WorkerThread extends Thread {
	private SyncBoard sb;
	
	public WorkerThread(String name, SyncBoard sb) {
		super(name);
		this.sb = sb;
	}
	
	// 실행코드
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			sb.add();
		}
	}
}

public class ThreadTest07 {
	public static void main(String[] args) {
		// 공유집계판 생성
		SyncBoard sb = new SyncBoard(); 
		
		// 일꾼 쓰레드 생성
		WorkerThread th1 = new WorkerThread("박찬호", sb);
		WorkerThread th2 = new WorkerThread("이영표", sb);
		
		// 동시에 2개의 쓰레드가 기동
		th1.start();
		th2.start();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
