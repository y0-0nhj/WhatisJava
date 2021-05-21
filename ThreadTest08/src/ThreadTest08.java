
// ���� ������
class SharePrinter {
	// �Ӱ迵�� -> ����ȭ�� �������� �����ؾ� ��.
	
	// 1. ����ȭ �޼ҵ�� ����
	/*
	public synchronized void print(String text) {
		for(int i=0; i<text.length(); i++) {
			System.out.print(text.charAt(i));
			Thread.yield();
		}
		System.out.println();
	}*/
	
	public void print(String text) {
		// 2�� ����ȭ�� �������� ����
		synchronized(this) {
			for(int i=0; i<text.length(); i++) {
				System.out.print(text.charAt(i));
				Thread.yield();
			}
		}
		System.out.println();
	}
}

class WorkerThread extends Thread {
	private SharePrinter sp;
	private String[] str;
	
	public WorkerThread(SharePrinter sp, String[] str) {
		this.sp = sp;
		this.str = str;
	}
	
	// �����ڵ�
	@Override
	public void run() {
		for(int i=0; i<str.length; i++) {
			sp.print(str[i]);
		}
	}
}

public class ThreadTest08 {
	public static void main(String[] args) {
		SharePrinter sp = new SharePrinter();
		
		// UB40
		String[] eng = {
			"Wise man say only fools rush in",
			"But I can't help, ",
			"falling in love with you",
			"Shall I stay?",
			"Would it be a sin?",
			"If I cat't help", 
			"falling in love with you",
		};
		
		// �ֱ���
		String[] kor = {
			"�ϴ����� �����ϻ� �츮 ���� ����",
			"����ȭ ��õ�� ȭ������,",
			"���� ��� �������� ���� �����ϼ�",
			"���� ���� �� �ҳ��� ö���� �θ� ��",
			"�ٶ����� �Һ����� �츮 ����ϼ�",
			"����ȭ ��õ�� ȭ������",
			"���� ��� �������� ���� �����ϼ�",
		};
		
		// ������ ����
		WorkerThread th1 = new WorkerThread(sp, eng);
		WorkerThread th2 = new WorkerThread(sp, kor);
		
		// ���ÿ� ������ �⵿
		th1.start();
		th2.start();
		
		// end
	}

}
