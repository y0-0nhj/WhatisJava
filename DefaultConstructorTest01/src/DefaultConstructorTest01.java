
// �ٸ� Ŭ�����κ��� ��ӹ��� �ʴ� ��� �ڹ��� Ŭ������  Object Ŭ�����κ��� ��ӹ޴� �����̴�.
// - extends Object�� ���� ����

// lang ��Ű��: �ڹٿ��� �ʼ������� ����ϴ� Ŭ������ ��Ƴ��� ��Ű��
// - System, String, Math, Object ...
// - lang ��Ű���� import�� ���� �ʾƵ� �ڵ����� �����Ϸ����� ����Ʈ �Ѵ�. ���� ����

// ��� ����Ʈ �����ڴ� super()��� ���� ������ �ִ�.

//import java.lang.Object;

class A /*extends Object*/ { 
	private int a;
	
	// �⺻ ������
	public A() {
		super();
		a = 50;
	}
	
	// getter
	public int getA() {
		return a;
	}
}

class B extends A {
	// �⺻ ������
	public B() {
		super();
	}
}

public class DefaultConstructorTest01 {
	public static void main(String[] args) {
		B x = new B();
		
		// �� ����� 50�� �Ǿ��°�?
		System.out.println(x.getA());
	}

}
