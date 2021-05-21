
public class StringBufferTest04 {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer();
		System.out.println(sb1);
		
		// 문자열 추가
		sb1.append("Hello Java World!");
		System.out.println(sb1);
		
		// charAt() : 인덱스에 해당하는 문자를 확인
		char c1 = sb1.charAt(6);
		System.out.println(c1);
		char c2 = sb1.charAt(11);
		System.out.println(c2);
		
		// deleteCharAt() : 인덱스에 해당하는 한 문자를 삭제
		sb1.deleteCharAt(11);
		System.out.println(sb1);
		
		// delete() : 인덱스에 해당하는 문자 또는 문자열을 삭제
		sb1.delete(6, 10); // 6번에서 10번 앞까지를 삭제
		System.out.println(sb1);
		
		// insert() : 특정 위치에 문자 또는 문자열을 삽입
		// append() : 맨 뒤에 문자열을 추가,
		sb1.insert(7, "W");
		System.out.println(sb1);
		
		sb1.insert(6, "Java");
		System.out.println(sb1);
		System.out.println("문자열 길이: " + sb1.length());
		
		// replace() : 특정 위치의 문자열을 변경하는 메소드
		sb1.replace(6, 10, "Android");
		System.out.println(sb1);
		
		sb1.replace(0, 5, "Hi");
		System.out.println(sb1);
		
		sb1.replace(16, 17, "?");
		System.out.println(sb1);
		
		// reverse() : 문자열을 거꾸로 뒤집어 생성하는 메소드
		sb1.reverse();
		System.out.println(sb1);
		
		sb1.reverse();
		System.out.println(sb1);
		
		// setCharAt() : 인덱스에 해당하는 한 문자를 변경하는 메소드
		sb1.setCharAt(16, '*');
		System.out.println(sb1);
		
		// substring() : 문자열을 추출하여 String형으로 저장하는 메소드
		String s1 = sb1.substring(3, 10); // 3번부터 10번 앞까지를 추출
		System.out.println(s1);
		
		String s2 = sb1.substring(3);     // 3번부터 끝까지를 추출
		System.out.println(s2);
		
		String s3 = sb1.substring(0, 2);  // 0번부터 2번 앞까지를 추출
		System.out.println(s3);
	}

}
