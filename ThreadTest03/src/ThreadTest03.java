import javax.swing.JOptionPane;

public class ThreadTest03 {
	public static void main(String[] args) {
		// ������
		String input = JOptionPane.showInputDialog("�̸��� �Է��Ͻÿ�.");
		System.out.println("����� �̸��� " + input + "�Դϴ�.");
				
		// main()�� ������
		for(int i=10; i>=0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000); // �����ð� 1��
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}

}
