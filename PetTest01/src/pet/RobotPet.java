package pet;

// �κ��ֿϵ��� Ŭ����
public class RobotPet extends Pet {
	
	public RobotPet(String name, String masterName) {
		super(name, masterName);
	}
	
	// �������̵�
	public void introduce() {
		System.out.println("�� ���� �κ����Դϴ�. �̸��� " + getName() + "�Դϴ�.");
		System.out.println("�� ���δ��� �̸��� " + getMasterName() + "�Դϴ�.");
	}
	
	// �߰� - �������� �ϴ� ���
	public void work(int sw) {
		switch(sw) {
		case 1:
			System.out.println("û�Ҹ� �մϴ�.");
			break;
		case 2:
			System.out.println("������ �մϴ�.");
			break;
		case 3:
			System.out.println("����� �����ϴ�.");
			break;
		}
	}
}
