import java.util.Calendar;

public class CalendarTest02 {
	public static void main(String[] args) {
		System.out.println("--- Calendar Ŭ������ ��¥ ���� ---");
		Calendar c1 = Calendar.getInstance();
		c1.set(2021, 6, 13, 14, 33, 27);
		
		int year = c1.get(Calendar.YEAR);
		int month = c1.get(Calendar.MONTH);
		int date = c1.get(Calendar.DATE);
		int hour = c1.get(Calendar.HOUR);
		int hour2 = c1.get(Calendar.HOUR_OF_DAY);
		int minute = c1.get(Calendar.MINUTE);
		int second = c1.get(Calendar.SECOND);
		System.out.printf("%4d��%2d��%2d�� %2d:%2d:%2d\n", year, month, date, hour, minute, second);
		System.out.printf("%4d��%2d��%2d�� %2d:%2d:%2d\n", year, month, date, hour2, minute, second);
		
		// Calendar.AM_PM : ����:0, ����:1 -> 14�� ����
		int ampm = c1.get(Calendar.AM_PM); // 1
		
		// �������� �����ϴ� ��� 1 - ���� ������ ����� �ִ� ���
		String[] ap = {"����", "����"};
		System.out.printf("%s %2d:%2d:%2d\n", ap[ampm], hour, minute, second);
		
		// �������� �����ϴ� ���2 - Calendar Ŭ������ Ȱ���ϴ� ���
		String ampm2 = "";
		if(ampm == Calendar.AM) {
			ampm2 = "����";
		} else {
			ampm2 = "����";
		}
		System.out.printf("%s %2d:%2d:%2d\n", ampm2, hour, minute, second);
		
		// 24�ð����� ǥ��
		System.out.printf("%2d:%2d:%2d\n", hour2, minute, second);
		
		// end
	}

}
