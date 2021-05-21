package player;

public class VideoPlayer implements Player {
	private static int count = 0;
	private int id;
	
	public VideoPlayer() { 
		id = ++count;
	}
	
	@Override
	public void play() {
		System.out.println("■ 비디오 플레이어 재생 시작...");
	}
	
	@Override
	public void stop() {
		System.out.println("■ 비디오 플레이어 재생 중지...");
	}
	
	// getter
	public int getId() {
		return id;
	}
	
	// 정보 출력 메소드 추가
	public void printInfo() {
		System.out.println("비디오 식별번호 : " + id);
	}
	
}
