import java.util.Date;

// Date 클래스 : 1.0 버전부터 사용
// Calendar 클래스 : 1.1 버전부터 사용, Date 클래스를 보완하고 개선해서 성능을 향상시킨 클래스

public class DateTest01 {
	public static void main(String[] args) {
		System.out.println("--- 1. 시스템의 날짜를 활용");
		Date d = new Date();
		
		int year = d.getYear() + 1900; // 1900년부터 시작, 1900을 더해서 보정
		int month = d.getMonth() + 1;  // 월은 0~11까지의 값, 1으을 더해서 보정
		int day = d.getDate();
		System.out.print(year + "년 " + month + "월 " + day + "일 ");
		
		int hour = d.getHours();
		int minute = d.getMinutes();
		int second = d.getSeconds();
		System.out.println(hour + "시 " + minute + "분 " + second + "초");
		
		System.out.println("--- 2. 날짜 설정");
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
		System.out.println(year + "년 " + month + "월 " + day + "일 " + hour + "시 " + minute + "분 " + second + "초");
		
	}

}
