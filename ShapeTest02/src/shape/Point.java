package shape;

// �� Ŭ���� - Shape�κ��� ��ӹ��� �ڽ� Ŭ����
public class Point extends Shape {
	
	public Point() { }
	
	@Override
	public void draw() {
		System.out.println("*");
	}
	
	@Override
	public String toString() {
		return "Point";
	}

}
