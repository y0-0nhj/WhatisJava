package player;

public class DVDPlayer implements ExtendedPlayer {
	
	@Override
	public void play() {
		System.out.println("�� DVD �÷��̾� ���...");
	}
	
	@Override
	public void stop() {
		System.out.println("�� DVD �÷��̾� ����...");
	}
	
	@Override
	public void fast() {
		System.out.println("�� DVD �÷��̾� 2������� ������ ����~~~");
	}
	
	@Override
	public void slow() {
		System.out.println("�� DVD �÷��̾� 0.5������� ������ ����~~~");
	}

}
