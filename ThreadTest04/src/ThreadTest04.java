import javax.swing.JOptionPane;

class MyThread extends Thread {
	@Override
	public void run() {
		for(int i=10; i>=0; i--) {
			System.out.println(i + "��");
			try {
				Thread.sleep(1000); // 1�� ����
			} catch(InterruptedException e) { 
				e.printStackTrace();
			}
			
		}
	}
}

public class ThreadTest04 {
	public static void main(String[] args) {
		// ���� ������ �������� �⵿
		MyThread t1 = new MyThread();
		t1.start();
		
		// main()
		String input = JOptionPane.showInputDialog("�̸��� �Է��Ͻÿ�.");
		System.out.println("����� �̸��� " + input +"�Դϴ�.");
	}

}
