
class MyThread1 extends Thread {
	@Override
	public void run() {
		for(int i=0; i<500; i++) {
			System.out.printf("%s", new String("-"));
			if(i%50 == 0) System.out.println();
			for(int j=0; j<10000000; j++) { } // �۾��� ����
		}
	}
}

class MyThread2 extends Thread {
	@Override
	public void run() {
		for(int i=0; i<500; i++) {
			System.out.printf("%s", new String("|"));
			if(i%50 == 0) System.out.println();
			for(int j=0; j<10000000; j++) { } // �۾��� ����
		}
	}
}

// �������� �켱���� : 1 ~ 10 ���� ����, �⺻������ 5�� �켱������ ���´�.
// ���� ������(daemon thread) : �Ϲ� �����带 �۾��� �����ϴ� ���, �Ϲ����� �����尡 ����� �� �ڵ� ����. ex) ������ �÷���, �ڵ�����, ȭ�鰻�� 
public class ThreadTest05 {
	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1();
		MyThread2 t2 = new MyThread2();
		
		System.out.println("t1(-): " + t1.getName());
		System.out.println("t2(|): " + t2.getName());
		
		// �켱���� ����
		t1.setPriority(9);
		t2.setPriority(1);
		
		// �켱���� Ȯ��
		System.out.println("t1 �켱����: " + t1.getPriority());
		System.out.println("t2 �켱����: " + t2.getPriority());
		
		// ���� �������� ����
		System.out.println("t1: " + t1.isDaemon());
		System.out.println("t2: " + t2.isDaemon());
		
		// ���ÿ� ����
		t1.start();
		t2.start();
	}

}
