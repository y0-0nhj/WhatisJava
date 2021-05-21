import javax.swing.JOptionPane;

class MyThread extends Thread {
	@Override
	public void run() {
		for(int i=10; i>=0; i--) {
			System.out.println(i + "초");
			try {
				Thread.sleep(1000); // 1초 지연
			} catch(InterruptedException e) { 
				e.printStackTrace();
			}
			
		}
	}
}

public class ThreadTest04 {
	public static void main(String[] args) {
		// 새로 생성한 쓰레드의 기동
		MyThread t1 = new MyThread();
		t1.start();
		
		// main()
		String input = JOptionPane.showInputDialog("이름을 입력하시오.");
		System.out.println("당신의 이름은 " + input +"입니다.");
	}

}
