
// �������� ����
// 1. ó���ӵ��� ���ȴ�.(���伺�� ���ȴ�.)
// 2. �ڿ��� ȿ�������� ����� �� �ִ�.
// 3. �ڵ尡 ����������.

// �������� ������
// 1. ����ȭ�� ������ �߻��Ѵ�.
// 2. ��������(dead lock)�� �߻��� �� �ִ�.
// 3. �켱������ ���� ������� ������ ������� ���� ���� �ִ�.(���� ������)

// ���� ������ Ŭ����
class SyncBoard {
	private int sum = 0;
	
	// �Ӱ迵��(critical section) -> ����ȭ�� �̷������ ����
	// �ذ�å -> ����ȭ�� �̷�������� �� �ָ� �ȴ�.
	
	// 1�� - ����ȭ�� �Լ��� ����. -> �ϳ��� �����尡 ������ lock�� �ɴ�. �����(moniter)�� �Ѵ�.
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
	
	// 2�� - ����ȭ�� ���� ����.
	public void add() {
		
		// �Ӱ迵�� -> ����ȭ�� ����
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

// �ϲ� ������ Ŭ����
class WorkerThread extends Thread {
	private SyncBoard sb;
	
	public WorkerThread(String name, SyncBoard sb) {
		super(name);
		this.sb = sb;
	}
	
	// �����ڵ�
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			sb.add();
		}
	}
}

public class ThreadTest07 {
	public static void main(String[] args) {
		// ���������� ����
		SyncBoard sb = new SyncBoard(); 
		
		// �ϲ� ������ ����
		WorkerThread th1 = new WorkerThread("����ȣ", sb);
		WorkerThread th2 = new WorkerThread("�̿�ǥ", sb);
		
		// ���ÿ� 2���� �����尡 �⵿
		th1.start();
		th2.start();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
