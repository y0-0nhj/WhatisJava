import java.util.Calendar;

public class CalendarTest01 {
	public static void main(String[] args) {
		//Calendar c1 = new Calendar(); // 추상 클래스이기 때문에 new로는 인스턴스를 생성 불가
		
		// 시스템의 날짜를 얻어오는 방법
		Calendar c1 = Calendar.getInstance();
		
		int year = c1.get(Calendar.YEAR);
		int month = c1.get(Calendar.MONTH) + 1; // 월은 1을 더해서 보정
		int date = c1.get(Calendar.DATE);
		
		System.out.println(year + "년 " + month + "월 " + date + "일 ");
		
		int hour = c1.get(Calendar.HOUR); // 12시간
		int hour2 = c1.get(Calendar.HOUR_OF_DAY); // 24시간
		int minute = c1.get(Calendar.MINUTE);
		int second = c1.get(Calendar.SECOND);
		int millisecond = c1.get(Calendar.MILLISECOND); // 1000분 1초
		
		System.out.println(hour +":" + minute + ":" + second + " " + millisecond);
		System.out.println(hour2 +":" + minute + ":" + second + " " + millisecond);
		
		System.out.println("--- Calendar 클래스에서 추가된 기능 ---");
		System.out.println("올해의 몇번째 주 : " + c1.get(Calendar.WEEK_OF_YEAR));  // 50번째 주 - 2020/12/07(월)
		System.out.println("이달의 몇번째 주 : " + c1.get(Calendar.WEEK_OF_MONTH)); // 2번째 주
		System.out.println("올해의 몇일 : " + c1.get(Calendar.DAY_OF_YEAR)); 	  // 342일째
		System.out.println("이달의 몇일 : " + c1.get(Calendar.DAY_OF_MONTH)); 	  // 7일째
		System.out.println("이주의 몇일 : " + c1.get(Calendar.DAY_OF_WEEK)); 	  // 2일째
		//System.out.println("이주의 몇일 : " + c1.get(Calendar.DAY_OF_WEEK_IN_MONTH)); // 2일째
		
		// Calendar.DAY_OF_WEEK - 요일(일~토:1~7) - 일:1, 월:2, 3:화, 4:수, 5:목, 6:금, 7:토
		// 요일 1번 - 직접 요일을 생성하는 경우
		String[] weekDay = {"", "일", "월", "화", "수", "목", "금", "토"};
		int week = c1.get(Calendar.DAY_OF_WEEK);
		System.out.println("오늘의 요일 : " + weekDay[week]);
		
		// 요일 2번 - Calendar 클래스 활용
		switch(week) {
		case Calendar.SUNDAY:
			System.out.println("일요일");
			break;
		case Calendar.MONDAY:
			System.out.println("월요일");
			break;
		case Calendar.TUESDAY:
			System.out.println("화요일");
			break;
		case Calendar.WEDNESDAY:
			System.out.println("수요일");
			break;
		case Calendar.THURSDAY:
			System.out.println("목요일");
			break;
		case Calendar.FRIDAY:
			System.out.println("금요일");
			break;
		case Calendar.SATURDAY:
			System.out.println("토요일");
			break;
		}		
		
		// end
	}

}
