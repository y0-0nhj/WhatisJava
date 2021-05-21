import java.util.Scanner;

class Day {
	// 인스턴스 변수
	private int year;
	private int month;
	private int date;
	
	// 매개변수를 3개 가진 생성자, 생성자 오버로딩
	public Day(int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;
	}
	
	// 복사 생성자, 생성자 오버로딩
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
	
	// 년, 월, 일을 한꺼번에 설정하는 메소드
	public void set(int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;
	}
	
	// 요일을 계산하는 메소드
	// 제라의 공식 - 0~6 사이의 값을 리턴
	// 0:일, 1:월, 2:화, 3:수, 4:목, 5:금, 6:토
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
	
	// 두 개의 인스턴스를 비교하는 메소드
	public boolean equalDay(Day d) {
		return this.year==d.year && this.month==d.month && this.date==d.date;
	}
	
}

public class DayTest02 {
	// 두 개의 날짜를 비교하는 메소드
	public static boolean compareDay(Day d1,  Day d2) {
		return d1.getYear()==d2.getYear() && d1.getMonth()==d2.getMonth() && d1.getDate()==d2.getDate();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int y, m, d;
		
		System.out.println("날짜1을 입력하시오.");
		System.out.print("년 입력 : ");
		y = sc.nextInt();
		System.out.print("월 입력 : ");
		m = sc.nextInt();
		System.out.print("일 입력 : ");
		d = sc.nextInt();
		
		// 1. 인스턴스 생성
		Day day1 = new Day(y, m, d);
		
		System.out.println("날짜2을 입력하시오.");
		System.out.print("년 입력 : ");
		y = sc.nextInt();
		System.out.print("월 입력 : ");
		m = sc.nextInt();
		System.out.print("일 입력 : ");
		d = sc.nextInt();
		
		// 2. 인스턴스 생성
		Day day2 = new Day(y, m, d);
		
		// 잘못된 비교 방법 - 참조를 비교하여 결과는 항상 else문을 실행
//		if(day1 == day2) {
//			System.out.println("두 날짜는 같습니다.");
//		} else {
//			System.out.println("두 날짜는 다릅니다.");
//		}
		
		// 1. 옳은 방법 - 값(내용)을 비교
//		if(day1.getYear()==day2.getYear() && 
//				day1.getMonth()==day2.getMonth() && day1.getDate()==day2.getDate()) {
//			System.out.println("두 날짜는 같습니다.");
//		} else {
//			System.out.println("두 날짜는 다릅니다.");
//		}
		
		// 2. 옳은 방법 - 조건식을 간결하게 표현 -> 메소드를 활용
//		if(compareDay(day1, day2)) {
//			System.out.println("두 날짜는 같습니다.");
//		} else {
//			System.out.println("두 날짜는 다릅니다.");
//		}
		
		// 3. 옳은 방법 - 두 개의 날짜를 비교하는 메소드를 클래스의 멤버로 포함시킨 것.
		if(day1.equalDay(day2)) {
			System.out.println("두 날짜는 같습니다.");
		} else {
			System.out.println("두 날짜는 다릅니다.");
		}
		
		sc.close();
	}

}
