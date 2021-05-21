
// 새로 생성한 쓰레드
class MyThread extends Thread {
	@Override
	public void run() {
		long start = System.currentTimeMillis();
		for(int i=0; i<500; i++) {
			System.out.printf("%s", new String("-"));
			if(i%50 == 0) System.out.println();
		}
		long end = System.currentTimeMillis();
		System.out.println("\n소요시간1 : " + (end - start));
	}
}

public class ThreadTest02 {
	public static void main(String[] args) {
		// 새로 생성한 쓰레드의 기동
		MyThread t1 = new MyThread();
		t1.start();
		
		// main() 메소드의 기동
		long start = System.currentTimeMillis();
		for(int i=0; i<500; i++) {
			System.out.printf("%s", new String("|"));
			if(i%50 == 0) System.out.println();
		}
		long end = System.currentTimeMillis();
		System.out.println("\n소요시간2 : " + (end - start));
		
	}

}
