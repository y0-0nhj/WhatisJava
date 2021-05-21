import java.text.SimpleDateFormat;
import java.util.Date;

// SimpleDateFormat : 날짜를 다양한 형식으로 출력하도록 해주는 클래스
public class SimpleDateFormatTest01 {
	public static void main(String[] args) {
		Date d = new Date(); // 시스템으로부터 얻은 날짜
		
		// yyyy:년도4자리, yy:년도 2자리, MM:월2자리, M:월1자리, dd:일2자리, d:일1자리 
		// hh:12시간, HH:24시간, mm:분2자리, ss초2자리, SSS:1000분의 1초 
		// a: 오전 또는 오후, E:요일
		SimpleDateFormat sdf1 = new SimpleDateFormat("yy년 M월 dd일");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss"); // 24시간으로 표현
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy/MM/dd a hh:mm:ss.SSS E"); // 24시간으로 표현
		
		System.out.println(sdf1.format(d));
		System.out.println(sdf2.format(d));
		System.out.println(sdf3.format(d));
		System.out.println(sdf4.format(d));

	}

}
