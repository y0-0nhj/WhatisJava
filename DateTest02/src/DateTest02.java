import java.util.Calendar;
import java.util.Date;

public class DateTest02 {
	public static void main(String[] args) {
		Date d1 = new Date();
		
		int year = d1.getYear() + 1900;
		int month = d1.getMonth() + 1;
		int date = d1.getDate();
		
		System.out.println(year + "년 " + month + "월 " + date + "일");
		
		System.out.println("--- 1. Date클래스형을 Calendar클래스형 변환 ---");
		Calendar c1 = Calendar.getInstance();
		c1.setTime(d1); // Date -> Calendar로 변경하는 메소드
		
		year = c1.get(Calendar.YEAR);
		month = c1.get(Calendar.MONTH) + 1; // 월은 1을 더해서 보정
		date = c1.get(Calendar.DATE);
		System.out.println(year + "년 " + month + "월 " + date + "일");
		
		System.out.println("--- 2. Calendar클래스형을 Date클래스형으로 변환 ---");
		Calendar c2 = Calendar.getInstance();
		Date d2 = new Date(c2.getTimeInMillis()); // Calendar -> Date 변경
		
		year = d2.getYear() + 1900;
		month = d2.getMonth() + 1;
		date = d2.getDate();
		System.out.println(year + "년 " + month + "월 " + date + "일");
		
		// end
	}

}
