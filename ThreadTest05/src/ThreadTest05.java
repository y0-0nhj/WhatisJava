
class MyThread1 extends Thread {
	@Override
	public void run() {
		for(int i=0; i<500; i++) {
			System.out.printf("%s", new String("-"));
			if(i%50 == 0) System.out.println();
			for(int j=0; j<10000000; j++) { } // 작업의 지연
		}
	}
}

class MyThread2 extends Thread {
	@Override
	public void run() {
		for(int i=0; i<500; i++) {
			System.out.printf("%s", new String("|"));
			if(i%50 == 0) System.out.println();
			for(int j=0; j<10000000; j++) { } // 작업의 지연
		}
	}
}

// 쓰레드의 우선순위 : 1 ~ 10 까지 존재, 기본값으로 5의 우선순위를 갖는다.
// 데몬 쓰레드(daemon thread) : 일반 쓰레드를 작업을 보조하는 기능, 일반적인 쓰레드가 종료될 때 자동 종료. ex) 가비지 컬렉터, 자동저장, 화면갱신 
public class ThreadTest05 {
	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1();
		MyThread2 t2 = new MyThread2();
		
		System.out.println("t1(-): " + t1.getName());
		System.out.println("t2(|): " + t2.getName());
		
		// 우선순위 변경
		t1.setPriority(9);
		t2.setPriority(1);
		
		// 우선순위 확인
		System.out.println("t1 우선순위: " + t1.getPriority());
		System.out.println("t2 우선순위: " + t2.getPriority());
		
		// 데몬 쓰레드의 여부
		System.out.println("t1: " + t1.isDaemon());
		System.out.println("t2: " + t2.isDaemon());
		
		// 동시에 실행
		t1.start();
		t2.start();
	}

}
