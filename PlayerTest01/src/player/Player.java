package player;

// �������̽� ��Ģ
// 1. �������̽��� �߻� �޼ҵ常�� ������.
// 2. �������̽��� �߻� �޼ҵ�� public �Ǵ� abstract�� ������ �� �ִ�.
// 3. �ν��Ͻ��� ����� ����.
// 4. �������̽��� �迭�� ����� �ִ�. - �������� ����

// �÷��̾� ����� Ư¡�� �������̽� ����
public interface Player {
	
//	public abstract void play(); // 1��
//	abstract void play(); // 2��
//	public void play(); // 3��
	/*public abstract*/ void play(); // 4��
	
	void stop();
}
