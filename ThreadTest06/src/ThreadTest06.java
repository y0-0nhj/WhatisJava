
public class ThreadTest06 implements Runnable {
	public static boolean flag = false;
	
	public static void main(String[] args) {
		// ������ : �� ������ �Ϲ� �������̹Ƿ�, ������ ���� ���ο� ������� ��� �����.
		// �ذ�å : ���� ������� �����ؾ���. ���� ������� �Ϲݾ����尡 ����Ǹ� �Բ� ����Ǳ� ����...
		Thread t = new Thread(new ThreadTest06());
		t.setDaemon(true); // ���󾲷���� ����
		System.out.println("t ���󾲷��� ���� ����: " + t.isDaemon());
		t.start();
		
		for(int i=1; i<=30; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000); // 1�� ����
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
			if(i%5 == 0) flag = true;
		}
		
		System.out.println("���α׷��� �����մϴ�.");
	}
	
	@Override 
	public void run() {
		while(true) {
			try {
				Thread.sleep(3000); // 3�� ����
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
			if(flag == true) autoSave();
		}
	}
	
	public void autoSave() {
		System.out.println("�۾������� �ڵ������Ͽ����ϴ�...");
	}

}
