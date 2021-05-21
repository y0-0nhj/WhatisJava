import java.util.Date;

// Date Ŭ���� : 1.0 �������� ���
// Calendar Ŭ���� : 1.1 �������� ���, Date Ŭ������ �����ϰ� �����ؼ� ������ ����Ų Ŭ����

public class DateTest01 {
	public static void main(String[] args) {
		System.out.println("--- 1. �ý����� ��¥�� Ȱ��");
		Date d = new Date();
		
		int year = d.getYear() + 1900; // 1900����� ����, 1900�� ���ؼ� ����
		int month = d.getMonth() + 1;  // ���� 0~11������ ��, 1���� ���ؼ� ����
		int day = d.getDate();
		System.out.print(year + "�� " + month + "�� " + day + "�� ");
		
		int hour = d.getHours();
		int minute = d.getMinutes();
		int second = d.getSeconds();
		System.out.println(hour + "�� " + minute + "�� " + second + "��");
		
		System.out.println("--- 2. ��¥ ����");
		//Date d2 = new Date(2021, 6, 25, 11, 20, 35);
		Date d2 = new Date();
		
		d2.setYear(2021);
		d2.setMonth(6);
		d2.setDate(25);
		d2.setHours(11);
		d2.setMinutes(20);
		d2.setSeconds(35);
		
		year = d2.getYear();
		month = d2.getMonth();
		day = d2.getDate();
		hour = d2.getHours();
		minute = d2.getMinutes();
		second = d2.getSeconds();
		System.out.println(year + "�� " + month + "�� " + day + "�� " + hour + "�� " + minute + "�� " + second + "��");
		
	}

}
