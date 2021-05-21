
// �����带 �����ϴ� ���
// 1. Thread Ŭ������ ����ϴ� ���
// 2. Runnable �������̽��� �����ϴ� ���

class MyThread1 extends Thread {
	// �������� ���� �ڵ�
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(getName());
		}
	}
	
}

class MyThread2 implements Runnable {
	// �������� ���� �ڵ�
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}

public class ThreadTest01 {
	public static void main(String[] args) {
		// �����带 ����ϴ� ���
		MyThread1 t1 = new MyThread1();
		t1.start();
		
		MyThread2 mt = new MyThread2();
		Thread t2 = new Thread(mt);
		t2.start();
	}

}
