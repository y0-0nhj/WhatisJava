package test;

import point.Point2D;
import point.Point3D;

// 문제) Point2D에 대한 인스턴스 5개, Point3D에 대한 인스턴스 5개를 생성하여, 한꺼번에 처리하시오.

public class PointTest01 {
	public static void main(String[] args) {
//		Point2D p1 = new Point2D(10, 20);
//		Point3D p2 = new Point3D(30, 40, 50);
//		
//		System.out.println(p1.toString());
//		System.out.println(p2);
		
		/*
		Point2D[] p1 = new Point2D[] {
				new Point2D(10, 20), new Point2D(12, 15), new Point2D(20, 30), 
				new Point2D(25, 35), new Point2D(17, 24),
		};
		
		Point3D[] p2 = new Point3D[] {
				new Point3D(10, 15, 20), new Point3D(22, 25, 32), new Point3D(17, 22, 35), 
				new Point3D(40, 50, 60), new Point3D(77, 88, 55), 
		};
		
		// 출력
		System.out.println("--- Point2D ---");
		for(int i=0; i<p1.length; i++) {
			System.out.println(p1[i].toString());
		}
		System.out.println();
		System.out.println("--- Point3D ---");
		for(int i=0; i<p2.length; i++) {
			System.out.println(p2[i].toString());
		}
		*/
		
		// 다형성 활용
		// 다형성(polymorphism) - 다양한 형태로 표현되는 것을 하나의 방법으로 처리하는 것
		Point2D[] p3 = {
				new Point2D(10, 20), new Point2D(12, 15), new Point2D(20, 30), 
				new Point2D(25, 35), new Point2D(17, 24),
				new Point3D(10, 15, 20), new Point3D(22, 25, 32), new Point3D(17, 22, 35), 
				new Point3D(40, 50, 60), new Point3D(77, 88, 55), 
		};
		
		for(int i=0; i<p3.length; i++) {
			System.out.println(p3[i].toString());
		}
		
		//
	}

}
