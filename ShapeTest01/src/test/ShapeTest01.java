package test;

import shape.*;

// ����) 4���� ������ �ν��Ͻ��� �Ѳ����� �����Ͽ� ����Ͻÿ�.
// - 2���� ��� ��� (�⺻ for��, for-in��)
public class ShapeTest01 {
	public static void main(String[] args) {
		// �ν��Ͻ� �迭 1
//		Shape[] shapes = new Shape[4];
//		shapes[0] = new Point();
//		shapes[1] = new Rectangle(7, 4);
//		shapes[2] = new HorizontalLine(12);
//		shapes[3] = new VerticalLine(5);
		
		// �ν��Ͻ� �迭 2
		Shape[] shapes = new Shape[] {
				new Point(),
				new Rectangle(7, 4),
				new HorizontalLine(12),
				new VerticalLine(5),
		};
		
		// ��� 1 - �⺻ for��
		for(int i=0; i<shapes.length; i++) {
//			System.out.println(shapes[i].toString());
//			shapes[i].draw();
//			System.out.println();
			shapes[i].print();
		}
		System.out.println("----------");
		
		// ��� 2 - for-in��
		for(Shape s : shapes) {
			s.print();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
