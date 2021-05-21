import java.util.Scanner;

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
	
	// 차 이동 거리 계산 메소드
	public boolean move(double dx, double dy) {
		double distance = Math.sqrt(dx*dx + dy*dy);
		
		if(fuel > distance) {    // 연료 충분 -> 이동 가능
			this.x += dx;
			this.y += dy;
			fuel -= distance;
			return true;
		} else {  // 연료 부족 -> 이동 불가능
			return false;
		}
	}
}

public class CarTest02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("자동차의  제원을 입력하시오.");
		System.out.print("이름: ");
		String name = sc.next();
		System.out.print("너비: ");
		int width = sc.nextInt();
		System.out.print("높이: ");
		int height = sc.nextInt();
		System.out.print("길이: ");
		int length = sc.nextInt();
		System.out.print("연료량: ");
		double fuel = sc.nextDouble();
		
		Car myCar = new Car(name, width, height, length, fuel);
		System.out.println();
		//myCar.putSpec();
		
		while(true) {
			System.out.println("현재 위치: (" + myCar.getX() + ", " + myCar.getY() + "), 남은 연료량: " + myCar.getFuel());
			System.out.print("이동하겠습니까?(YES:1 / NO:0) : ");
			int yn = sc.nextInt();
			if(yn == 0) break;
			
			System.out.print("x방향 이동거리: ");
			double dx = sc.nextDouble();
			System.out.print("y방향 이동거리: ");
			double dy = sc.nextDouble();
			
			if(!myCar.move(dx, dy)) {
				System.out.println("연료가 부족합니다.");
			}
		}
		
		System.out.println("차가 정지하였습니다.");

		
		sc.close();
	}

}
