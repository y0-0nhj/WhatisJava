
// �߻� Ŭ����
abstract class A {
	public abstract void a(); // �߻� �޼ҵ�
	public abstract void b();
}

// Ŭ���� A�κ��� ��ӹ޾��� �� ������ ���� ����
// �ذ� ���  1 - Ŭ���� B�� �߻� Ŭ������ �����ϴ� ���, �ν��Ͻ��� �������� ����
//abstract class B extends A {	
//}

// �ذ� ��� 2 - Ŭ���� A�� �߻� �޼ҵ带 �������̵�(����)�ϴ� ���
// - �������̵��� �� ���� �� ���� ���� ������ ����� �� ����.
// - �������̵��� �� ���� �����ϰų�, ���� ���� ������ ����ؾ� �Ѵ�.
//class B extends A {
//	public void a() { }
//	public void b() { }
//}

// �ذ� ��� - Ŭ���� A�� �߻� �޼ҵ� �߿��� a()�޼ҵ常 �������̵��� �� ��Ȳ
abstract class B extends A {
	public void a() { }; 
}

class C extends B {
	public void b() { }
}

public class AbstractTest02 {
	public static void main(String[] args) {
		
	}

}
