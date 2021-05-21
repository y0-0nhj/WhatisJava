package player;

// Player, Skinnable �������̽��� ��� �����ϴ� Ŭ����
public class PortablePlayer implements Player, Skinnable {
	
	@Override
	public void play() {
		System.out.println("�� ���ͺ� �÷��̾� ���...");
	}
	
	@Override
	public void stop() {
		System.out.println("�� ���ͺ� �÷��̾� ����...");
	}
	
	@Override
	public void changeSkin(int skin) {
		System.out.print("��Ų�� ");
		switch(skin) {
		case RED:
			System.out.print("����");
			break;
		case GREEN:
			System.out.print("�ʷ�");
			break;
		case BLUE:
			System.out.print("�Ķ�");
			break;
		case BLACK:
			System.out.print("����");
			break;
		case LEOPARD:
			System.out.print("ǥ������");
			break;
		default:
			System.out.print("���");
			break;
		}
		System.out.println("�� �����Ͽ����ϴ�.");
	}

}
