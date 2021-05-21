
class Day {
	// �ν��Ͻ� ����
	private int year = 1; // �ʱ갪
	private int month = 1;
	private int date = 1;
	
	// ������ �����ε�
	
	// �⺻ ������ (����Ʈ ������)
	public Day() { }
	
	// �Ű����� 1���� ������
	public Day(int year) {
		this.year = year;
	}
	
	// �Ű����� 2���� ������
	public Day(int year, int month) {
		this(year);
		this.month = month;
	}
	
	// �Ű������� 3�� ���� ������, ������ �����ε�
	public Day(int year, int month, int date) {
		this(year, month);
		this.date = date;
	}
	
	// this() : �ڽ��� Ŭ�������� �����ڸ� ȣ���ϴ� ��
	
	// ���� ������, ������ �����ε�
	public Day(Day d) {
		this(d.year, d.month, d.date);
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

public class DayTest04 {
	public static void main(String[] args) {
		
	}

}
