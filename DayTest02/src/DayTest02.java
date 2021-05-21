import java.util.Scanner;

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
	
	// �� ���� �ν��Ͻ��� ���ϴ� �޼ҵ�
	public boolean equalDay(Day d) {
		return this.year==d.year && this.month==d.month && this.date==d.date;
	}
	
}

public class DayTest02 {
	// �� ���� ��¥�� ���ϴ� �޼ҵ�
	public static boolean compareDay(Day d1,  Day d2) {
		return d1.getYear()==d2.getYear() && d1.getMonth()==d2.getMonth() && d1.getDate()==d2.getDate();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int y, m, d;
		
		System.out.println("��¥1�� �Է��Ͻÿ�.");
		System.out.print("�� �Է� : ");
		y = sc.nextInt();
		System.out.print("�� �Է� : ");
		m = sc.nextInt();
		System.out.print("�� �Է� : ");
		d = sc.nextInt();
		
		// 1. �ν��Ͻ� ����
		Day day1 = new Day(y, m, d);
		
		System.out.println("��¥2�� �Է��Ͻÿ�.");
		System.out.print("�� �Է� : ");
		y = sc.nextInt();
		System.out.print("�� �Է� : ");
		m = sc.nextInt();
		System.out.print("�� �Է� : ");
		d = sc.nextInt();
		
		// 2. �ν��Ͻ� ����
		Day day2 = new Day(y, m, d);
		
		// �߸��� �� ��� - ������ ���Ͽ� ����� �׻� else���� ����
//		if(day1 == day2) {
//			System.out.println("�� ��¥�� �����ϴ�.");
//		} else {
//			System.out.println("�� ��¥�� �ٸ��ϴ�.");
//		}
		
		// 1. ���� ��� - ��(����)�� ��
//		if(day1.getYear()==day2.getYear() && 
//				day1.getMonth()==day2.getMonth() && day1.getDate()==day2.getDate()) {
//			System.out.println("�� ��¥�� �����ϴ�.");
//		} else {
//			System.out.println("�� ��¥�� �ٸ��ϴ�.");
//		}
		
		// 2. ���� ��� - ���ǽ��� �����ϰ� ǥ�� -> �޼ҵ带 Ȱ��
//		if(compareDay(day1, day2)) {
//			System.out.println("�� ��¥�� �����ϴ�.");
//		} else {
//			System.out.println("�� ��¥�� �ٸ��ϴ�.");
//		}
		
		// 3. ���� ��� - �� ���� ��¥�� ���ϴ� �޼ҵ带 Ŭ������ ����� ���Խ�Ų ��.
		if(day1.equalDay(day2)) {
			System.out.println("�� ��¥�� �����ϴ�.");
		} else {
			System.out.println("�� ��¥�� �ٸ��ϴ�.");
		}
		
		sc.close();
	}

}
