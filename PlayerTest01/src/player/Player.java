package player;

// 인터페이스 규칙
// 1. 인터페이스는 추상 메소드만을 가진다.
// 2. 인터페이스의 추상 메소드는 public 또는 abstract를 생략할 수 있다.
// 3. 인스턴스를 만들수 없다.
// 4. 인터페이스의 배열은 만들수 있다. - 다형성의 구현

// 플레이어 기기의 특징을 인터페이스 설정
public interface Player {
	
//	public abstract void play(); // 1번
//	abstract void play(); // 2번
//	public void play(); // 3번
	/*public abstract*/ void play(); // 4번
	
	void stop();
}
