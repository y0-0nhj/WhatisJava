
public class ThreadTest06 implements Runnable {
	public static boolean flag = false;
	
	public static void main(String[] args) {
		// 문제점 : 이 쓰레드 일반 쓰레드이므로, 메인의 종료 여부와 상관없이 계속 실행됨.
		// 해결책 : 데몬 쓰레드로 변경해야함. 데몬 쓰레드는 일반쓰레드가 종료되면 함께 종료되기 때문...
		Thread t = new Thread(new ThreadTest06());
		t.setDaemon(true); // 데몬쓰레드로 설정
		System.out.println("t 데몬쓰레드 설정 유무: " + t.isDaemon());
		t.start();
		
		for(int i=1; i<=30; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000); // 1초 지연
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
			if(i%5 == 0) flag = true;
		}
		
		System.out.println("프로그램을 종료합니다.");
	}
	
	@Override 
	public void run() {
		while(true) {
			try {
				Thread.sleep(3000); // 3초 지연
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
			if(flag == true) autoSave();
		}
	}
	
	public void autoSave() {
		System.out.println("작업파일을 자동저장하였습니다...");
	}

}
