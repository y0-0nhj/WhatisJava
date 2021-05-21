
class Day {
	// �ν��Ͻ� ����
	private int year;
	private int month;
	private int date;
	
	// ������ �����ε�
	
	// �⺻ ������ (����Ʈ ������)
	public Day() {
		year = 1;
		month = 1;
		date = 1;
	}
	
	// �Ű����� 1���� ������
	public Day(int year) {
		this.year = year;
		this.month = 1;
		this.date = 1;
	}
	
	// �Ű����� 2���� ������
	public Day(int year, int month) {
		this.year = year;
		this.month = month;
		this.date = 1;
	}
	
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
	
	// �� ���� �ν��Ͻ��� ���ϴ� �޼ҵ�
	public boolean equalDay(Day d) {
		return this.year==d.year && this.month==d.month && this.date==d.date;
	}
	
	// ��¥ ���� ��� �޼ҵ�
	public String toString() {
		String[] weekDay = {"��", "��", "ȭ", "��", "��", "��", "��"};
		return year + "�� " + month + "�� " + date + "�� (" + weekDay[dayOfWeek()] + ")";
	}
	
}

public class DayTest03 {
	public static void main(String[] args) {
		Day day1 = new Day(2022, 11, 21); // �Ű������� 3���� ������ Ȱ��
		Day day2 = new Day(day1);		  // ���� ������ Ȱ��, �Ű������� �������� 1���� ������
		Day day3 = new Day();			  // �⺻ ������ Ȱ��
		Day day4 = new Day(2022);		  // �Ű������� 1���� ������ Ȱ��
		Day day5 = new Day(2022, 11);     // �Ű������� 2���� ������ Ȱ��
		
		// toString() �޼ҵ�� ���� ���� -> �ڵ����� toString �޼ҵ� ȣ��
		System.out.println(day1);
		System.out.println(day2);
		System.out.println(day3);
		System.out.println(day4);
		System.out.println(day5);
	}

}
