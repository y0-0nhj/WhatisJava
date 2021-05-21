import java.util.Scanner;

// 날짜 클래스
// 인스턴스 변수 - 년(year), 월(month), 일(date)

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
	
}

public class DayTest01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] weekDay = new String[]{"일", "월", "화", "수", "목", "금", "토"};
		
		System.out.println("생년월일을 입력하시오.");
		System.out.print("년 입력: ");
		int year = sc.nextInt();
		System.out.print("월 입력: ");
		int month = sc.nextInt();
		System.out.print("일 입력: ");
		int date = sc.nextInt();
		
		Day birthday = new Day(year, month, date); // 인스턴스
		
		// 문제점
		// 1. birthday가 참조를 xDay에 복사
		// 2. birthday가 참조하는 곳을 xDay도 참조함 -> birthday와 xDay가 같은 곳을 참조함.
		// 3. 내용을 복사한 것이 아니라 참조만 복사함.
		//Day xDay = birthday;
		
		// 해결책
		// 1. 복사 생성자를 통해 인스턴스 내용을 복사하고, 그 복사한 내용을 변경
		Day xDay = new Day(birthday); // 인스턴스의 내용 복사
		
		xDay.set(2022, 11, 21);
		
		System.out.println("birthday = " + birthday.getYear() + "년 " +
				birthday.getMonth() + "월 " + birthday.getDate() + "일 (" + 
				weekDay[birthday.dayOfWeek()] + ")");
		
		System.out.println("xDay = " + xDay.getYear() + "년 " +
				xDay.getMonth() + "월 " + xDay.getDate() + "일 (" + 
				weekDay[xDay.dayOfWeek()] + ")");
		
		sc.close();
	}

}
