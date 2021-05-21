import javax.swing.JOptionPane;

public class ThreadTest03 {
	public static void main(String[] args) {
		// 쓰레드
		String input = JOptionPane.showInputDialog("이름을 입력하시오.");
		System.out.println("당신의 이름은 " + input + "입니다.");
				
		// main()의 쓰레드
		for(int i=10; i>=0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000); // 지연시간 1초
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}

}
