
interface I {
	/*public abstract*/ void a(); // �߻� �޼ҵ�
	void b();
}

abstract class A implements I {
	public void a() { }
}

class B extends A {
	public void b() { }
}

public class IntefaceTest01 {
	public static void main(String[] args) {
		
	}

}
