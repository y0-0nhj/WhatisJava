import java.util.Calendar;

public class CalendarTest01 {
	public static void main(String[] args) {
		//Calendar c1 = new Calendar(); // �߻� Ŭ�����̱� ������ new�δ� �ν��Ͻ��� ���� �Ұ�
		
		// �ý����� ��¥�� ������ ���
		Calendar c1 = Calendar.getInstance();
		
		int year = c1.get(Calendar.YEAR);
		int month = c1.get(Calendar.MONTH) + 1; // ���� 1�� ���ؼ� ����
		int date = c1.get(Calendar.DATE);
		
		System.out.println(year + "�� " + month + "�� " + date + "�� ");
		
		int hour = c1.get(Calendar.HOUR); // 12�ð�
		int hour2 = c1.get(Calendar.HOUR_OF_DAY); // 24�ð�
		int minute = c1.get(Calendar.MINUTE);
		int second = c1.get(Calendar.SECOND);
		int millisecond = c1.get(Calendar.MILLISECOND); // 1000�� 1��
		
		System.out.println(hour +":" + minute + ":" + second + " " + millisecond);
		System.out.println(hour2 +":" + minute + ":" + second + " " + millisecond);
		
		System.out.println("--- Calendar Ŭ�������� �߰��� ��� ---");
		System.out.println("������ ���° �� : " + c1.get(Calendar.WEEK_OF_YEAR));  // 50��° �� - 2020/12/07(��)
		System.out.println("�̴��� ���° �� : " + c1.get(Calendar.WEEK_OF_MONTH)); // 2��° ��
		System.out.println("������ ���� : " + c1.get(Calendar.DAY_OF_YEAR)); 	  // 342��°
		System.out.println("�̴��� ���� : " + c1.get(Calendar.DAY_OF_MONTH)); 	  // 7��°
		System.out.println("������ ���� : " + c1.get(Calendar.DAY_OF_WEEK)); 	  // 2��°
		//System.out.println("������ ���� : " + c1.get(Calendar.DAY_OF_WEEK_IN_MONTH)); // 2��°
		
		// Calendar.DAY_OF_WEEK - ����(��~��:1~7) - ��:1, ��:2, 3:ȭ, 4:��, 5:��, 6:��, 7:��
		// ���� 1�� - ���� ������ �����ϴ� ���
		String[] weekDay = {"", "��", "��", "ȭ", "��", "��", "��", "��"};
		int week = c1.get(Calendar.DAY_OF_WEEK);
		System.out.println("������ ���� : " + weekDay[week]);
		
		// ���� 2�� - Calendar Ŭ���� Ȱ��
		switch(week) {
		case Calendar.SUNDAY:
			System.out.println("�Ͽ���");
			break;
		case Calendar.MONDAY:
			System.out.println("������");
			break;
		case Calendar.TUESDAY:
			System.out.println("ȭ����");
			break;
		case Calendar.WEDNESDAY:
			System.out.println("������");
			break;
		case Calendar.THURSDAY:
			System.out.println("�����");
			break;
		case Calendar.FRIDAY:
			System.out.println("�ݿ���");
			break;
		case Calendar.SATURDAY:
			System.out.println("�����");
			break;
		}		
		
		// end
	}

}
