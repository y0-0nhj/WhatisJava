package test;

import shape.*;

// 문제)
// 1. Plane2D 인터페이스를 생성한 후에 면적을 계산하는 getArea() 추상 메소드를 추가하시오.
// 2. Rectangle 클래스는 Plane2D 인터페이스를 구현하여 면적을 계산하는 기능을 추가하시오.
// 3. Triangle 클래스, Parallelogram 클래스를 생성하여 Shape 클래스를 상속받고, Plane2D 인터페이스를 구현하도록 하시오.
// 4. main() 메소드에서 Shape형의 배열을 만들고, 6가지 도형의 인스턴스 담아 다형성을 구현하여 출력하시오.
// 5. 출력할 때, 면적을 계산할 수 있는 3가지 클래스는 면적도 출력하도록 하시오.

public class ShapeTest02 {
	public static void main(String[] args) {
		// 인스턴스 배열
		Shape[] shapes = new Shape[] {
				new Point(),
				new Rectangle(7, 4), 	// 면적
				new HorizontalLine(12),
				new VerticalLine(5),
				new Triangle(5, 5),		// 면적
				new Parallelogram(7, 4),// 면적
		};
		
		// 출력
		for(Shape s : shapes) {
			s.print();
			if(s instanceof Plane2D) {
				System.out.println("Area : " + ((Plane2D)s).getArea());
			}
			System.out.println();
		}
		
	}

}
