import java.util.Calendar;
import java.util.Date;

public class DateTest02 {
	public static void main(String[] args) {
		Date d1 = new Date();
		
		int year = d1.getYear() + 1900;
		int month = d1.getMonth() + 1;
		int date = d1.getDate();
		
		System.out.println(year + "�� " + month + "�� " + date + "��");
		
		System.out.println("--- 1. DateŬ�������� CalendarŬ������ ��ȯ ---");
		Calendar c1 = Calendar.getInstance();
		c1.setTime(d1); // Date -> Calendar�� �����ϴ� �޼ҵ�
		
		year = c1.get(Calendar.YEAR);
		month = c1.get(Calendar.MONTH) + 1; // ���� 1�� ���ؼ� ����
		date = c1.get(Calendar.DATE);
		System.out.println(year + "�� " + month + "�� " + date + "��");
		
		System.out.println("--- 2. CalendarŬ�������� DateŬ���������� ��ȯ ---");
		Calendar c2 = Calendar.getInstance();
		Date d2 = new Date(c2.getTimeInMillis()); // Calendar -> Date ����
		
		year = d2.getYear() + 1900;
		month = d2.getMonth() + 1;
		date = d2.getDate();
		System.out.println(year + "�� " + month + "�� " + date + "��");
		
		// end
	}

}
