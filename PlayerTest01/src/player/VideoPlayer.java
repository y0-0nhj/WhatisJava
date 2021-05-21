package player;

public class VideoPlayer implements Player {
	private static int count = 0;
	private int id;
	
	public VideoPlayer() { 
		id = ++count;
	}
	
	@Override
	public void play() {
		System.out.println("�� ���� �÷��̾� ��� ����...");
	}
	
	@Override
	public void stop() {
		System.out.println("�� ���� �÷��̾� ��� ����...");
	}
	
	// getter
	public int getId() {
		return id;
	}
	
	// ���� ��� �޼ҵ� �߰�
	public void printInfo() {
		System.out.println("���� �ĺ���ȣ : " + id);
	}
	
}
