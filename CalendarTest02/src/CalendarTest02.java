import java.util.Calendar;

public class CalendarTest02 {
	public static void main(String[] args) {
		System.out.println("--- Calendar 클래스로 날짜 설정 ---");
		Calendar c1 = Calendar.getInstance();
		c1.set(2021, 6, 13, 14, 33, 27);
		
		int year = c1.get(Calendar.YEAR);
		int month = c1.get(Calendar.MONTH);
		int date = c1.get(Calendar.DATE);
		int hour = c1.get(Calendar.HOUR);
		int hour2 = c1.get(Calendar.HOUR_OF_DAY);
		int minute = c1.get(Calendar.MINUTE);
		int second = c1.get(Calendar.SECOND);
		System.out.printf("%4d년%2d월%2d일 %2d:%2d:%2d\n", year, month, date, hour, minute, second);
		System.out.printf("%4d년%2d월%2d일 %2d:%2d:%2d\n", year, month, date, hour2, minute, second);
		
		// Calendar.AM_PM : 오전:0, 오후:1 -> 14시 기준
		int ampm = c1.get(Calendar.AM_PM); // 1
		
		// 오전오후 설정하는 방법 1 - 직접 요일을 만들어 넣는 방법
		String[] ap = {"오전", "오후"};
		System.out.printf("%s %2d:%2d:%2d\n", ap[ampm], hour, minute, second);
		
		// 오전오후 설정하는 방법2 - Calendar 클래스를 활용하는 방법
		String ampm2 = "";
		if(ampm == Calendar.AM) {
			ampm2 = "오전";
		} else {
			ampm2 = "오후";
		}
		System.out.printf("%s %2d:%2d:%2d\n", ampm2, hour, minute, second);
		
		// 24시간으로 표현
		System.out.printf("%2d:%2d:%2d\n", hour2, minute, second);
		
		// end
	}

}
