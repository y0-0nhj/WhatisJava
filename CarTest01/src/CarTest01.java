
class Car {
	// 인스턴스 변수 - 7개
	private String name;
	private int width;
	private int height;
	private int length;
	private double x;
	private double y;
	private double fuel;
	
	// 생성자
	public Car(String name, int width, int height, int length, double fuel) {
		this.name = name;
		this.width = width;
		this.height = height;
		this.length = length;
		this.fuel = fuel;
		x = y = 0;
	}

	// 인스턴스 메소드
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
	
	// 차 정보(제원) 출력 메소드
	public void putSpec() { 
		System.out.println("차 이름: " + name);
		System.out.println("차 너비: " + width);
		System.out.println("차 높이: " + height);
		System.out.println("차 길이: " + length);
		System.out.println();
	}
}

public class CarTest01 {
	public static void main(String[] args) {
		// 인스턴스 생성
		Car car1 = new Car("팰리세이드", 1800, 800, 3500, 100);
		Car car2 = new Car("소나타 하이브리드", 1600, 600, 3200, 80);
		Car car3 = new Car("포르쉐 P10", 1500, 550, 3100, 120);
		
		car1.putSpec();
		car2.putSpec();
		car3.putSpec();
	}

}
