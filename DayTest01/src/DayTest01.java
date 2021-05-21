import java.util.Scanner;

// ��¥ Ŭ����
// �ν��Ͻ� ���� - ��(year), ��(month), ��(date)

class Day {
	// �ν��Ͻ� ����
	private int year;
	private int month;
	private int date;
	
	// �Ű������� 3�� ���� ������, ������ �����ε�
	public Day(int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;
	}
	
	// ���� ������, ������ �����ε�
	public Day(Day d) {
		this.year = d.year;
		this.month = d.month;
		this.date = d.date;
	}
	
	// setter
	public void setYear(int year) {
		this.year = year;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	public void setDate(int date) {
		this.date = date;
	}
	
	// getter
	public int getYear() {
		return year;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getDate() {
		return date;
	}
	
	// ��, ��, ���� �Ѳ����� �����ϴ� �޼ҵ�
	public void set(int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;
	}
	
	// ������ ����ϴ� �޼ҵ�
	// ������ ���� - 0~6 ������ ���� ����
	// 0:��, 1:��, 2:ȭ, 3:��, 4:��, 5:��, 6:��
	public int dayOfWeek() {
		int y = year;
		int m = month;
		int d = date;
		
		if(m==1 || m==2) {
			y--;
			m += 12;
		} 
		return (y + y/4 - y/100 + y/400 + (13*m+8)/5 + d) % 7;
	}
	
}

public class DayTest01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] weekDay = new String[]{"��", "��", "ȭ", "��", "��", "��", "��"};
		
		System.out.println("��������� �Է��Ͻÿ�.");
		System.out.print("�� �Է�: ");
		int year = sc.nextInt();
		System.out.print("�� �Է�: ");
		int month = sc.nextInt();
		System.out.print("�� �Է�: ");
		int date = sc.nextInt();
		
		Day birthday = new Day(year, month, date); // �ν��Ͻ�
		
		// ������
		// 1. birthday�� ������ xDay�� ����
		// 2. birthday�� �����ϴ� ���� xDay�� ������ -> birthday�� xDay�� ���� ���� ������.
		// 3. ������ ������ ���� �ƴ϶� ������ ������.
		//Day xDay = birthday;
		
		// �ذ�å
		// 1. ���� �����ڸ� ���� �ν��Ͻ� ������ �����ϰ�, �� ������ ������ ����
		Day xDay = new Day(birthday); // �ν��Ͻ��� ���� ����
		
		xDay.set(2022, 11, 21);
		
		System.out.println("birthday = " + birthday.getYear() + "�� " +
				birthday.getMonth() + "�� " + birthday.getDate() + "�� (" + 
				weekDay[birthday.dayOfWeek()] + ")");
		
		System.out.println("xDay = " + xDay.getYear() + "�� " +
				xDay.getMonth() + "�� " + xDay.getDate() + "�� (" + 
				weekDay[xDay.dayOfWeek()] + ")");
		
		sc.close();
	}

}
