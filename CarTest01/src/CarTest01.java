
class Car {
	// �ν��Ͻ� ���� - 7��
	private String name;
	private int width;
	private int height;
	private int length;
	private double x;
	private double y;
	private double fuel;
	
	// ������
	public Car(String name, int width, int height, int length, double fuel) {
		this.name = name;
		this.width = width;
		this.height = height;
		this.length = length;
		this.fuel = fuel;
		x = y = 0;
	}

	// �ν��Ͻ� �޼ҵ�
	// setter
	public void setX(double x) {
		this.x = x;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public void setFuel(double fuel) {
		this.fuel = fuel;
	}
	
	// getter
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public double getFuel() {
		return fuel;
	}
	
	// �� ����(����) ��� �޼ҵ�
	public void putSpec() { 
		System.out.println("�� �̸�: " + name);
		System.out.println("�� �ʺ�: " + width);
		System.out.println("�� ����: " + height);
		System.out.println("�� ����: " + length);
		System.out.println();
	}
}

public class CarTest01 {
	public static void main(String[] args) {
		// �ν��Ͻ� ����
		Car car1 = new Car("�Ӹ����̵�", 1800, 800, 3500, 100);
		Car car2 = new Car("�ҳ�Ÿ ���̺긮��", 1600, 600, 3200, 80);
		Car car3 = new Car("������ P10", 1500, 550, 3100, 120);
		
		car1.putSpec();
		car2.putSpec();
		car3.putSpec();
	}

}
