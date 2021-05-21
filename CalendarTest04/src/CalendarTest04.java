import java.util.Calendar;

public class CalendarTest04 {
	public static void main(String[] args) {
		Calendar c1 = Calendar.getInstance();
		c1.set(2015, 7, 31); // 2015년 8월 31일로 설정
		
		// Calendar 클래스의 모든 정보를 확인
		System.out.println(c1.toString());
		printDate(c1);
		
		System.out.println("--- 1일 후 ---");
		c1.add(Calendar.DATE, 1); // 2015년 9월 1일, 일도 자동으로 날짜 보정
		printDate(c1);
		
		System.out.println("--- 6개월 후 ---");
		c1.add(Calendar.MONTH, 6); // 2016년 3월 1일, 월도 자동으로 보정
		printDate(c1);
		
		System.out.println("--- 3개월 전 ---");
		c1.add(Calendar.MONTH, -3); // 2015년 12월 1일
		printDate(c1);
		
		System.out.println("--- 7일 전 ---");
		c1.add(Calendar.DATE, -7); // 2015년 11월 24일
		printDate(c1);
		
		// add()와 roll() 메소드의 차이점
		// add() : 일을 변경하면 월과 년까지 함께 보정함.
		// roll() : 해당하는 값만 변경, 다른 값은 변경되지 않음.
		
//		System.out.println("--- 40일 후 : add() 활용 ---");
//		c1.add(Calendar.DATE, 40);
		
		System.out.println("--- 40일 후 : roll() 활용 ---");
		c1.roll(Calendar.DATE, 40);
		
		printDate(c1);
		
		// end
	}
	
	public static void printDate(Calendar c) {
		System.out.printf("%4d년 %2d월 %2d일\n", c.get(Calendar.YEAR), c.get(Calendar.MONTH)+1, c.get(Calendar.DATE));
	}

}
