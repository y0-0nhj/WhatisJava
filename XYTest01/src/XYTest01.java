
class XY {
	// Ŭ���� ����
	private static int count;
	// �ν��Ͻ� ����
	private int id;
	private int x = 0;
	private int y = 0;
	
	// �ν��Ͻ� �ʱ���
	// - ��� ������ ��� ������ ȣ��Ǵ� �ʱ���
	{
		id = ++count;
	}
	
	// ������ �����ε�
	// �⺻ ������
	public XY() {
		//id = ++count;
	}
	
	// �Ű������� 1�� ���� ������
	public XY(int x) {
		this.x = x;
		//id = ++count;
	}
	
	// �Ű������� 2�� ���� ������
	public XY(int x, int y) {
		this.x = x;
		this.y = y;
		//id = ++count;
	}
	
	// ���� ������
	public XY(XY a) {
		this.x = a.x;
		this.y = a.y;
		//id = ++count;
	}
	
	public String toString() {
		return "No. " + id + " : (" + x + ", " + y + ")";
	}
 }

public class XYTest01 {
	public static void main(String[] args) {
		XY a = new XY();
		XY b = new XY(10);
		XY c = new XY(20, 30);
		XY d = new XY(c);
		
		System.out.println(a.toString());
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);	
	}

}
