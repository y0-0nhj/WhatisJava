
// ���� ������(������), access modifier
// 1. public : �������Գ�, ��𿡼��� ���� ����
// 2. protected : ���� ��Ű������ ���� ����, ��Ű���� �޶� ����� ���� �ڽĿ����� ���� ����
// 3. default : ���� ��Ű�������� ���� ����, ���� �����ڸ� ������� ���� ����
// 4. private : ���� Ŭ������ ��������� ���� ����, �ٸ� Ŭ���������� ���� �Ұ�

// ���� ������ : public > protected > default > private
// ���� ���� :    �д�(wide)  <-                      -> ����(narrow)
// ���� ���� :   ���ϴ�(weak) <-                      -> ���ϴ�(strong)
// ���� ���� : �����ϴ�(loose) <-                      -> �����ϴ� (tight)

class Base {
	protected int x; // ����� ���� �ڽĿ����� ���� ����
	
	public Base() {
		this.x = 1;
	}
	
	public Base(int x) {
		this.x = x;
	}
	
	public void print() {
		System.out.println("Base's x = " + x);
	}
}

class Derived extends Base {
	private int x;
	
	public Derived(int x1, int x2) {
		super.x = x1;
		this.x = x2;
	}
	
	// �������̵�
	@Override
	public void print() {
		super.print();
		System.out.println("Derived's x = " + x);
	}
}

public class SuperTest01 {
	public static void main(String[] args) {
		Base a = new Base(10);
		a.print();
		System.out.println();
		
		Derived b = new Derived(20, 30);
		b.print();
		System.out.println();
		
	}

}
