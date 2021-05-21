
public class StringTest06 {
	public static void main(String[] args) {
		String s1 = "Hello Java World.hwp";
		//String s1 = "Hello Java World.pdf";
		
		// endsWith() : 지정한 문자열로 끝나는지의 여부, boolean값으로 출력
		System.out.println(s1.endsWith("txt"));
		
		// 파일이 pdf파일만 업로드 할 수 있도록 조건 생성
		if(s1.endsWith("pdf")) {
			System.out.println("정상적으로 업로드되었습니다.");
		} else {
			System.out.println("업로드가 완료되지 않았습니다.\n파일형식을 pdf로 변경하여 업로드 해주세요.");
		}
		System.out.println("----------");
		
		// startsWith() : 지정한 문자열로 시작하는지의 여부, boolean값으로 출력
		System.out.println(s1.startsWith("Hello"));
		System.out.println(s1.startsWith("hello"));
		System.out.println("----------");
		
		// indexOf() : 문자 또는 문자열에 해당하는 인덱스를 생성
		System.out.println(s1.indexOf("J"));
		System.out.println(s1.indexOf("Java"));
		System.out.println(s1.indexOf("java")); // -1, 해당 문자열을 찾지 못했을 때, -1은 문자열의 인덱스롤 존재할 수 없음.
		System.out.println("----------");
		
		// lastIndexOf() : 문자 또는 문자열에 해당하는 마지막 인덱스를 생성
		String s2 = "java.Object.java.pdf";
		System.out.println(s2.indexOf(".")); // 4, 첫번째로 찾은 .의 인덱스
		System.out.println(s2.lastIndexOf(".")); // 16, 마지막에 찾은 .의 인덱스
		System.out.println(s2.indexOf(".", 15)); // 15번 위치에서부터 .을 찾은 인덱스
		System.out.println(s2.indexOf(".", 5)); // 두번째 .의 인덱스, 5번 위치에서부터 .을 찾은 인덱스
		
	}

}
