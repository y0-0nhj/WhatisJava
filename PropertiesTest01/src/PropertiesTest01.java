import java.util.Enumeration;
import java.util.Properties;

// Properties 
// 1. 내부적으로 Hashtable 구조를 갖고 있음. Map 계열
// 2. 키와 값을 String으로만 사용하도록 설계, String 전용 Map
// 3. <> 사용하지 않음
// 4. 문자열의 키와 값을 데이터로 전달할 때 많이 사용.

public class PropertiesTest01 {
	public static void main(String[] args) {
		// Properties 생성
		Properties pro = new Properties();
		
		// 데이터 추가
		pro.setProperty("이익준", "간담췌외과");
		pro.setProperty("김준완", "흉부외과");
		pro.setProperty("채송화", "신경외과");
		pro.setProperty("양석형", "산부인과");
		pro.setProperty("안정원", "소아외과");
		
		// 데이터 확인 1
		System.out.println(pro);
		System.out.println("----------");
		
		// 데이터 확인 2
		pro.list(System.out);
		System.out.println("----------");
		
		// 출력
		Enumeration e = pro.propertyNames();
		while(e.hasMoreElements()) {
			String name = (String)e.nextElement();   // 키: 이름
			String major = pro.getProperty(name);    // 값: 전공
			System.out.println("이름: " + name + ", 전공: " + major);
		}
		
		
	}

}
