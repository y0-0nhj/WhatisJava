
// ���� ������ ������
class MyThread extends Thread {
	@Override
	public void run() {
		long start = System.currentTimeMillis();
		for(int i=0; i<500; i++) {
			System.out.printf("%s", new String("-"));
			if(i%50 == 0) System.out.println();
		}
		long end = System.currentTimeMillis();
		System.out.println("\n�ҿ�ð�1 : " + (end - start));
	}
}

public class ThreadTest02 {
	public static void main(String[] args) {
		// ���� ������ �������� �⵿
		MyThread t1 = new MyThread();
		t1.start();
		
		// main() �޼ҵ��� �⵿
		long start = System.currentTimeMillis();
		for(int i=0; i<500; i++) {
			System.out.printf("%s", new String("|"));
			if(i%50 == 0) System.out.println();
		}
		long end = System.currentTimeMillis();
		System.out.println("\n�ҿ�ð�2 : " + (end - start));
		
	}

}
