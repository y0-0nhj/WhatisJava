// Math Ŭ���� 
// 1. ���п� ���õ� �޼ҵ�, ��� ���� ���ǵǾ� �ִ� Ŭ����
// 2. Ŭ���� ������ Ŭ���� �޼ҵ常 ����, �ν��Ͻ� ������ �ν��Ͻ� �޼ҵ�� ����.
// 3. Ŭ������.�޼ҵ��

// static import ���
import static java.lang.Math.*;

public class ImportTest03 {
	public static void main(String[] args) {
		double radius = 11.7;
		int x = 10, y = 20, z = -30;
		
		double perimeter = 2 * PI * radius; // ���� �ѷ�
		double area = PI * radius * radius; // ���� ����
		double distance = sqrt(x*x + y*y);   // �Ÿ��� ���ϴ� ����, ��Ŭ����
		z = abs(z); // ���밪
		
		System.out.println("���� �ѷ� : " + perimeter);
		System.out.println("���� ���� : " + area);
		System.out.println("�Ÿ� : " + distance);
		System.out.println("���밪 : " + z);
		
	}

}
