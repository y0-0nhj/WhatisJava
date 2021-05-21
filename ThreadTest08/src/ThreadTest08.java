
// 공유 프린터
class SharePrinter {
	// 임계영역 -> 동기화된 영역으로 설정해야 함.
	
	// 1. 동기화 메소드로 설정
	/*
	public synchronized void print(String text) {
		for(int i=0; i<text.length(); i++) {
			System.out.print(text.charAt(i));
			Thread.yield();
		}
		System.out.println();
	}*/
	
	public void print(String text) {
		// 2번 동기화된 영역으로 설정
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
	
	// 실행코드
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
		
		// 애국가
		String[] kor = {
			"하느님이 보우하사 우리 나라 만세",
			"무궁화 삼천리 화려강산,",
			"대한 사람 대한으로 길이 보전하세",
			"남산 위에 저 소나무 철갑을 두른 듯",
			"바람서리 불변함은 우리 기상일세",
			"무궁화 삼천리 화려강산",
			"대한 살람 대한으로 길이 보전하세",
		};
		
		// 쓰레드 생성
		WorkerThread th1 = new WorkerThread(sp, eng);
		WorkerThread th2 = new WorkerThread(sp, kor);
		
		// 동시에 쓰레드 기동
		th1.start();
		th2.start();
		
		// end
	}

}
