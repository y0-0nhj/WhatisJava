package test;

import shape.*;

// ����)
// 1. Plane2D �������̽��� ������ �Ŀ� ������ ����ϴ� getArea() �߻� �޼ҵ带 �߰��Ͻÿ�.
// 2. Rectangle Ŭ������ Plane2D �������̽��� �����Ͽ� ������ ����ϴ� ����� �߰��Ͻÿ�.
// 3. Triangle Ŭ����, Parallelogram Ŭ������ �����Ͽ� Shape Ŭ������ ��ӹް�, Plane2D �������̽��� �����ϵ��� �Ͻÿ�.
// 4. main() �޼ҵ忡�� Shape���� �迭�� �����, 6���� ������ �ν��Ͻ� ��� �������� �����Ͽ� ����Ͻÿ�.
// 5. ����� ��, ������ ����� �� �ִ� 3���� Ŭ������ ������ ����ϵ��� �Ͻÿ�.

public class ShapeTest02 {
	public static void main(String[] args) {
		// �ν��Ͻ� �迭
		Shape[] shapes = new Shape[] {
				new Point(),
				new Rectangle(7, 4), 	// ����
				new HorizontalLine(12),
				new VerticalLine(5),
				new Triangle(5, 5),		// ����
				new Parallelogram(7, 4),// ����
		};
		
		// ���
		for(Shape s : shapes) {
			s.print();
			if(s instanceof Plane2D) {
				System.out.println("Area : " + ((Plane2D)s).getArea());
			}
			System.out.println();
		}
		
	}

}
