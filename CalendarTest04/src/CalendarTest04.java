import java.util.Calendar;

public class CalendarTest04 {
	public static void main(String[] args) {
		Calendar c1 = Calendar.getInstance();
		c1.set(2015, 7, 31); // 2015�� 8�� 31�Ϸ� ����
		
		// Calendar Ŭ������ ��� ������ Ȯ��
		System.out.println(c1.toString());
		printDate(c1);
		
		System.out.println("--- 1�� �� ---");
		c1.add(Calendar.DATE, 1); // 2015�� 9�� 1��, �ϵ� �ڵ����� ��¥ ����
		printDate(c1);
		
		System.out.println("--- 6���� �� ---");
		c1.add(Calendar.MONTH, 6); // 2016�� 3�� 1��, ���� �ڵ����� ����
		printDate(c1);
		
		System.out.println("--- 3���� �� ---");
		c1.add(Calendar.MONTH, -3); // 2015�� 12�� 1��
		printDate(c1);
		
		System.out.println("--- 7�� �� ---");
		c1.add(Calendar.DATE, -7); // 2015�� 11�� 24��
		printDate(c1);
		
		// add()�� roll() �޼ҵ��� ������
		// add() : ���� �����ϸ� ���� ����� �Բ� ������.
		// roll() : �ش��ϴ� ���� ����, �ٸ� ���� ������� ����.
		
//		System.out.println("--- 40�� �� : add() Ȱ�� ---");
//		c1.add(Calendar.DATE, 40);
		
		System.out.println("--- 40�� �� : roll() Ȱ�� ---");
		c1.roll(Calendar.DATE, 40);
		
		printDate(c1);
		
		// end
	}
	
	public static void printDate(Calendar c) {
		System.out.printf("%4d�� %2d�� %2d��\n", c.get(Calendar.YEAR), c.get(Calendar.MONTH)+1, c.get(Calendar.DATE));
	}

}
