package test;

import player.*;

// 문제)
// 1. Player 인터페이스의 배열을 만들어 CDPlayer, VideoPlayer 인스턴스 각 2개씩을 저장하시오.
// 2. 다형성을 활용하여 Player 배열의 내용을 출력하시오.
// 3. CDPlayer, VideoPlayer의 각 특징들오 출력하시오.

public class PlayerTest01 {
	public static void main(String[] args) {
		// Player p = new Player(); // 인터페이스는 인스턴스 생성 불가
		Player[] players = new Player[4]; // 인터페이스의 배열은 가능 - 다형성 구현
		
		players[0] = new CDPlayer();
		players[1] = new VideoPlayer();
		players[2] = new CDPlayer();
		players[3] = new VideoPlayer();
		
		// 출력 - for-in문 : 각각의 클래스에 추가된 기능도 출력
		for(Player p : players) {
			p.play();
			p.stop();
			
			if(p instanceof CDPlayer) {
				((CDPlayer)p).clean();
			}
			if(p instanceof VideoPlayer) {
				((VideoPlayer)p).printInfo();
			}
			System.out.println();
		}
		
		// end
	}

}
