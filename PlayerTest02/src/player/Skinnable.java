package player;

// �������̽��� ��Ģ
// 1. �������̽��� �߻� �޼ҵ常�� ������.
// 2. �������̽��� Ŭ���� ������� ������.
// 3. �������̽��� �߻� �޼ҵ�� public �Ǵ� abstract�� ������ �� �ִ�.
// 4. �������̽��� Ŭ���� ����� public �Ǵ� static �Ǵ� final�� ������ �� �ִ�.
public interface Skinnable {
	/*public static final*/ int RED = 1; // Ŭ���� ���
	int GREEN = 2;
	int BLUE = 3;
	int BLACK = 4;
	int LEOPARD = 5;
	
	/*public abstract*/ void changeSkin(int skin);
	
}
