import java.util.Calendar;

class DateId {
	private static long count = 0;
	private long id;
	
	// 클래스 초기자, 정적 초기자
	// - 최초로 생성자 호출되기 직전에 딱 한번만 호출되어 사용, 전체 클래스에서 초기화하는 변수의 값을 설정
	static  {
		Calendar c = Calendar.getInstance();
		long year = c.get(Calendar.YEAR);
		long month = c.get(Calendar.MONTH) + 1; // 0~11
		long date = c.get(Calendar.DATE);
		
		count = year*10000000 + month*100000 + date*1000;
		//System.out.printf("%4d년 %2d월 %2d일\n", year, month, date);
	}
	
	// 생성자
	public DateId() {
		id = ++count;
	}
	
	// getter
	public long getId() {
		return id;
	}
}

public class DateIdTest01 {
	public static void main(String[] args) {
		DateId a = new DateId();
		DateId b = new DateId();
		DateId c = new DateId();
		
		System.out.println("a의 id = " + a.getId());
		System.out.println("b의 id = " + b.getId());
		System.out.println("c의 id = " + c.getId());
	}

}
