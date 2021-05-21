import java.util.Vector;

// 문제)
// 1. 문자열을 담는 벡터 v를 생성하시오.
// 2. 벡터 v에 5개의 문자열을 추가하시오. ex) 김연아, 박찬호, 이승엽, 김연경, 류현진
// 3. 벡터 v에서 이승엽 다음에 손흥민을 추가하시오.
// 4. 벡터 v에서 박찬호를 삭제하시오.
// 5. 벡터 v에서 김연경을 이다영으로 변경하시오.
// 6. 벡터 v의 내용을 2가지 방법으로 출력하시오. (기본 for문, for-in문)

public class VectorTest06 {
	public static void main(String[] args) {
		System.out.println("- 1. 문자열 벡터 생성 -");
		Vector<String> v = new Vector<String>();
		
		System.out.println("- 2. 벡터에 문자열 데이터 추가 -");
		String[] name = {"김연아", "박찬호", "이승엽", "김연경", "류현진"};
		
		for(int i=0; i<name.length; i++) {
			v.add(name[i]);
		}
		System.out.println(v);
		
		int idx;
		System.out.println("- 3. 이승엽 다음에 손흥민 추가 -");
		//v.add(3, "손흥민");
		idx = v.indexOf("이승엽"); // 2
		v.add(idx+1, "손흥민");
		System.out.println(v);
		
		System.out.println("- 4. 박찬호 삭제 -");
		//v.remove(1);    // 인덱스를 통해 삭제
		//v.remove("박찬호"); // 문자열일 때는 값을 통해 삭제 가능
		idx = v.indexOf("박찬호"); // 1
		v.remove(idx);
		System.out.println(v);
		
		System.out.println("- 5. 김연경을 이다영으로 변경 -");
		//v.set(3, "이다영");
		idx = v.indexOf("김연경"); // 3
		v.set(idx, "이다영");
		System.out.println(v);
		
		System.out.println("- 6-1. 출력 (기본 for문) -");
		for(int i=0; i<v.size(); i++) {
			System.out.print(v.get(i) + ", ");
		}
		System.out.println();
		
		System.out.println("- 6-2. 출력 (for-in문) -");
		for(String s : v) {
			System.out.print(s + ", ");
		}
		System.out.println();
				
		// end
	}

}