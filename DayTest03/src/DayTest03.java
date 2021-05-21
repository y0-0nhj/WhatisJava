
class Day {
	// 인스턴스 변수
	private int year;
	private int month;
	private int date;
	
	// 생성자 오버로딩
	
	// 기본 생성자 (디폴트 생성자)
	public Day() {
		year = 1;
		month = 1;
		date = 1;
	}
	
	// 매개변수 1개인 생성자
	public Day(int year) {
		this.year = year;
		this.month = 1;
		this.date = 1;
	}
	
	// 매개변수 2개인 생성자
	public Day(int year, int month) {
		this.year = year;
		this.month = month;
		this.date = 1;
	}
	
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
	
	// 날짜 정보 출력 메소드
	public String toString() {
		String[] weekDay = {"일", "월", "화", "수", "목", "금", "토"};
		return year + "년 " + month + "월 " + date + "일 (" + weekDay[dayOfWeek()] + ")";
	}
	
}

public class DayTest03 {
	public static void main(String[] args) {
		Day day1 = new Day(2022, 11, 21); // 매개변수가 3개인 생성자 활용
		Day day2 = new Day(day1);		  // 복사 생성자 활용, 매개변수가 참조변수 1개인 생성자
		Day day3 = new Day();			  // 기본 생성자 활용
		Day day4 = new Day(2022);		  // 매개변수가 1개인 생성자 활용
		Day day5 = new Day(2022, 11);     // 매개변수가 2개인 생성자 활용
		
		// toString() 메소드는 생략 가능 -> 자동으로 toString 메소드 호출
		System.out.println(day1);
		System.out.println(day2);
		System.out.println(day3);
		System.out.println(day4);
		System.out.println(day5);
	}

}
