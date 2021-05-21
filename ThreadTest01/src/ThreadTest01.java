
// 쓰레드를 생성하는 방법
// 1. Thread 클래스를 상속하는 방법
// 2. Runnable 인터페이스를 구현하는 방법

class MyThread1 extends Thread {
	// 쓰레드의 실행 코드
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(getName());
		}
	}
	
}

class MyThread2 implements Runnable {
	// 쓰레드의 실행 코드
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}

public class ThreadTest01 {
	public static void main(String[] args) {
		// 쓰레드를 사용하는 방법
		MyThread1 t1 = new MyThread1();
		t1.start();
		
		MyThread2 mt = new MyThread2();
		Thread t2 = new Thread(mt);
		t2.start();
	}

}
