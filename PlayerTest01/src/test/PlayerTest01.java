package test;

import player.*;

// ����)
// 1. Player �������̽��� �迭�� ����� CDPlayer, VideoPlayer �ν��Ͻ� �� 2������ �����Ͻÿ�.
// 2. �������� Ȱ���Ͽ� Player �迭�� ������ ����Ͻÿ�.
// 3. CDPlayer, VideoPlayer�� �� Ư¡��� ����Ͻÿ�.

public class PlayerTest01 {
	public static void main(String[] args) {
		// Player p = new Player(); // �������̽��� �ν��Ͻ� ���� �Ұ�
		Player[] players = new Player[4]; // �������̽��� �迭�� ���� - ������ ����
		
		players[0] = new CDPlayer();
		players[1] = new VideoPlayer();
		players[2] = new CDPlayer();
		players[3] = new VideoPlayer();
		
		// ��� - for-in�� : ������ Ŭ������ �߰��� ��ɵ� ���
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
