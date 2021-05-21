
// �ν��Ͻ� ���� - �ν��Ͻ��� ���鶧���� �����Ǵ� ����, static ���� ����
// instance variable : non-static field, ������ �ʵ�

// Ŭ���� ���� - Ŭ������ ���ʷ� ���Ǵ� ������ �� �ѹ��� �����Ǿ� ��� �ν��Ͻ����� �����ϴ� ����, static �ִ� ����
// class variable : static field, ���� �ʵ�

class Id {
	private static int count = 0;	// Ŭ���� ����, ���� �ʵ�
	private int id = 0;				// �ν��Ͻ� ����, ������ �ʵ�
	
	// ������
	public Id() {
		this.id = ++count;
	}
	
	// getter
	public static int getCount() { // Ŭ���� �޼ҵ�, ���� �޼ҵ�
		return count;
	}
	
	public int getId() {		// �ν��Ͻ� �޼ҵ�, ������ �޼ҵ�
		return id;
	}
	
	// setter	
	public void setId(int id) { // �ν��Ͻ� �޼ҵ�
		this.id = id;
	}
	
	// toString()
	public String toString() {
		return "No : " + id;
	}
}

public class IdTest01 {
	public static void main(String[] args) {
		Id a = new Id();
		Id b = new Id();
		Id c = new Id();
		
		System.out.println(a.toString()); // toString()�� ���� �ʾƵ� �ڵ� ȣ��
		System.out.println(b);
		System.out.println(c);
		
		// �����ϴ� �޼ҵ��� Ŭ���� �޼ҵ带 ���ؼ� Ȯ���ϴ� ���
		// �������� ���� -> Ŭ���� �޼ҵ尡 �� �ν��Ͻ��� ���� �ִ� �ν��Ͻ� �޼ҵ�ó�� ���̱� ����.
		System.out.println("���ݱ��� ������ count�� �� : " + a.getCount());
		System.out.println("���ݱ��� ������ count�� �� : " + b.getCount());
		System.out.println("���ݱ��� ������ count�� �� : " + c.getCount());
		
		// Ŭ���� �޼ҵ带 ����ϴ� ��� - Ŭ������.Ŭ���� �޼ҵ��
		System.out.println("���ݱ��� ������ count�� �� : " + Id.getCount());
	}

}
