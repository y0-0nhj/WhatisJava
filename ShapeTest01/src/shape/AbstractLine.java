package shape;

// ���� Ŭ���� - �߻� Ŭ����
// 1. Shape Ŭ������ �ڽ� Ŭ����
// 2. HorizontalLine�� VerticalLine�� �θ� Ŭ������ ����
// 3. �ν��Ͻ��� ������ ������ ����.
// 4. ���� �� ���� Ŭ������ �θ�νḸ ������ �����̴�.

public abstract class AbstractLine extends Shape {
	private int length;
	
	public AbstractLine(int length) {
		this.length = length;
	}
	
	// getter
	public int getLength() {
		return length;
	}
	
	// setter
	public void setLength(int length) {
		this.length = length;
	}
	
}
