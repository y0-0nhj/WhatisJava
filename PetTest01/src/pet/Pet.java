package pet;

// �ֿϵ��� Ŭ����
public class Pet {
	private String name; 		// �̸�
	private String masterName;  // �����̸�
	
	// constructor
	public Pet(String name, String masterName) {
		this.name = name;
		this.masterName = masterName;
	}
	
	// getter
	public String getName() { 
		return name;
	}
	
	public String getMasterName() {
		return masterName;
	}
	
	public void introduce() {
		System.out.println("�� �� �̸��� " + name + "�Դϴ�.");
		System.out.println("�� ���δ��� �̸��� " + masterName + "�Դϴ�.");
	}
}
