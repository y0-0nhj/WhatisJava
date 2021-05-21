package test;

import shape.*;

// 문제) 4가지 도형의 인스턴스를 한꺼번에 생성하여 출력하시오.
// - 2가지 출력 방법 (기본 for문, for-in문)
public class ShapeTest01 {
	public static void main(String[] args) {
		// 인스턴스 배열 1
//		Shape[] shapes = new Shape[4];
//		shapes[0] = new Point();
//		shapes[1] = new Rectangle(7, 4);
//		shapes[2] = new HorizontalLine(12);
//		shapes[3] = new VerticalLine(5);
		
		// 인스턴스 배열 2
		Shape[] shapes = new Shape[] {
				new Point(),
				new Rectangle(7, 4),
				new HorizontalLine(12),
				new VerticalLine(5),
		};
		
		// 출력 1 - 기본 for문
		for(int i=0; i<shapes.length; i++) {
//			System.out.println(shapes[i].toString());
//			shapes[i].draw();
//			System.out.println();
			shapes[i].print();
		}
		System.out.println("----------");
		
		// 출력 2 - for-in문
		for(Shape s : shapes) {
			s.print();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
