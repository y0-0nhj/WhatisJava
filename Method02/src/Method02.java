import java.util.Scanner;

// ����) ���� �������� �Է¹޾Ƽ� ���� ����, ���� �ѷ��� ���ϴ� ���α׷� -> �޼ҵ�� �ۼ�

public class Method02 {
	// Math.PI
	
	// �޼ҵ� ����
	// calcArea() : ���� ������ ����ϴ� �޼ҵ�
	static double calcArea(double radius) {
		double area = Math.PI * radius * radius;
		return area;
	}
	
	// calcPerimeter() : ���� �ѷ��� ����ϴ� �޼ҵ�
	static double calcPerimeter(double radius) {
		double perimeter = 2 * Math.PI * radius;
		return perimeter;
	}
	
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		double area = 0.0, perimeter = 0.0;
		
		System.out.print("���� ������ �Է� : ");
		double radius = sc.nextDouble();
		
		// �޼ҵ� ȣ��
		area = calcArea(radius);
		perimeter = calcPerimeter(radius);
		
		System.out.printf("���� ���� : %.2f\n���� �ѷ� : %.2f\n", area, perimeter);
		
		sc.close();
	}

}
