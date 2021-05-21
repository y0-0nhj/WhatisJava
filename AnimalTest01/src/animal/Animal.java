package animal;

// ���� Ŭ���� - �߻� Ŭ����, �θ� Ŭ����, �������� ������ Ȱ��
public abstract class Animal {
	private String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	// �߻� �޼ҵ�
	public abstract void bark();
	public abstract String toString();
	
	// getter
	public String getName() {
		return name;
	}
	
	// setter 
	public void setName(String name) {
		this.name = name;
	}
	
	public void introduce() {
		System.out.println(toString());
		bark();
	}
}
