import java.util.Calendar;

public class CalendarTest03 {
	public static void main(String[] args) {
		Calendar c1 = Calendar.getInstance(); // 현재 시스템의 날짜
		Calendar c2 = Calendar.getInstance(); 
		//c2.set(2020, 0, 8); // 2020년 1월 8일 설정 - 코로나 최초 발생일, 월은 1을 빼서 설정
		c2.set(2020, Calendar.JANUARY, 8); // 2020년 1월 8일 설정
		
		// 두 개의 날짜의 차이
		long difference = c1.getTimeInMillis() - c2.getTimeInMillis(); // 1000분의 1초
		System.out.println("두 날짜의 차이 : " + difference + " ms"); // 1000분의 1초
		System.out.println("두 날짜의 차이 : " + difference/1000 + " 초"); 
		System.out.println("두 날짜의 차이 : " + difference/1000/60 + "분");
		System.out.println("두 날짜의 차이 : " + difference/1000/60/60 + " 시간");
		System.out.println("두 날짜의 차이 : " + difference/1000/60/60/24 + " 일");
	} 

}
