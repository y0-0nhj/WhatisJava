import java.util.Scanner;

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
	
	// �� �̵� �Ÿ� ��� �޼ҵ�
	public boolean move(double dx, double dy) {
		double distance = Math.sqrt(dx*dx + dy*dy);
		
		if(fuel > distance) {    // ���� ��� -> �̵� ����
			this.x += dx;
			this.y += dy;
			fuel -= distance;
			return true;
		} else {  // ���� ���� -> �̵� �Ұ���
			return false;
		}
	}
}

public class CarTest02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ڵ�����  ������ �Է��Ͻÿ�.");
		System.out.print("�̸�: ");
		String name = sc.next();
		System.out.print("�ʺ�: ");
		int width = sc.nextInt();
		System.out.print("����: ");
		int height = sc.nextInt();
		System.out.print("����: ");
		int length = sc.nextInt();
		System.out.print("���ᷮ: ");
		double fuel = sc.nextDouble();
		
		Car myCar = new Car(name, width, height, length, fuel);
		System.out.println();
		//myCar.putSpec();
		
		while(true) {
			System.out.println("���� ��ġ: (" + myCar.getX() + ", " + myCar.getY() + "), ���� ���ᷮ: " + myCar.getFuel());
			System.out.print("�̵��ϰڽ��ϱ�?(YES:1 / NO:0) : ");
			int yn = sc.nextInt();
			if(yn == 0) break;
			
			System.out.print("x���� �̵��Ÿ�: ");
			double dx = sc.nextDouble();
			System.out.print("y���� �̵��Ÿ�: ");
			double dy = sc.nextDouble();
			
			if(!myCar.move(dx, dy)) {
				System.out.println("���ᰡ �����մϴ�.");
			}
		}
		
		System.out.println("���� �����Ͽ����ϴ�.");

		
		sc.close();
	}

}
