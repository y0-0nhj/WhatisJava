package player;

// 인터페이스의 규칙
// 1. 인터페이스는 추상 메소드만을 가진다.
// 2. 인터페이스는 클래스 상수만을 가진다.
// 3. 인터페이스의 추상 메소드는 public 또는 abstract를 생략할 수 있다.
// 4. 인터페이스의 클래스 상수는 public 또는 static 또는 final을 생략할 수 있다.
public interface Skinnable {
	/*public static final*/ int RED = 1; // 클래스 상수
	int GREEN = 2;
	int BLUE = 3;
	int BLACK = 4;
	int LEOPARD = 5;
	
	/*public abstract*/ void changeSkin(int skin);
	
}
