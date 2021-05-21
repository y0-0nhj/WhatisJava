import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HashMapTest02 {
	public static void main(String[] args) {
		// HashMap 생성
		// 한영사전
		// key: 한글단어, value: 영어단어
		HashMap<String, String> map = new HashMap<String, String>();
		
		// 데이터 추가
		map.put("사자", "lion");
		map.put("코끼리", "elephant");
		map.put("표범", "leopard");
		map.put("얼룩말", "zebra");
		map.put("하마", "hippo");
		map.put("기린", "giraffe");
		map.put("누", "wildebeest");
		map.put("하이에나", "hyena");
		map.put("치타", "cheetah");
		map.put("가젤", "gazelle");
		map.put("호랑이", "tiger");
		map.put("임팔라", "deer");
		
		// 데이터 확인
		System.out.println(map);
		System.out.println("크기: " + map.size());
		
		// 데이터 삭제
		System.out.println("사전에서 아프리카에 살지 않는 동물을 삭제하시오.");
		map.remove("호랑이");
		System.out.println(map);
		System.out.println("크기: " + map.size());
		
		// 데이터 변경
		System.out.println("사전에서 잘못된 동물의 이름을 수정하시오.");
		map.put("임팔라", "impala");
		System.out.println(map);
		System.out.println("크기: " + map.size());
		System.out.println("----------");
		
		// 데이터 출력
		// 1. 출력 - keySet() 사용
		Set<String> keySet = map.keySet();
		Iterator<String> it = keySet.iterator();
		while(it.hasNext()) {
			String kor = it.next();    // 한글이름
			String eng = map.get(kor); // 영어이름
			System.out.println(kor + "(" + eng + ")");
		}
		System.out.println("----------");
		
		// 2. 출력 - entrySet(), Iterator() 사용
		Set<Map.Entry<String, String>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, String>> entryIt = entrySet.iterator();
		while(entryIt.hasNext()) {
			Map.Entry<String, String> entry = entryIt.next();
			String kor = entry.getKey();
			String eng = entry.getValue();
			System.out.println(kor + "(" + eng + ")");
		}
		System.out.println("----------");
		
		// 3. 출력  - entrySet(), for-in문
		entrySet = map.entrySet(); // entrySet()으로 재지정
		for(Map.Entry<String, String> entry : entrySet) {
			String kor = entry.getKey();
			String eng = entry.getValue();
			System.out.println(kor + "(" + eng + ")");
		}
		System.out.println("----------");
		
		// 한글단어을 입력하면 영어단어를 알려주는 프로그램
		// ex) 하마는 영어로 hippo입니다.
		Scanner sc = new Scanner(System.in);
		System.out.println("--- 아프리카 동물 영어 맞추기 게임 ---");
		System.out.println("--- 한글단어를 입력하면 영어단어를 알려드립니다. ---");
		System.out.print("한글단어 입력: ");
		String kor = sc.next();
		String eng = map.get(kor); // get() 메소드는 키에 해당하는 내용이 없으면 null을 리턴
		if(eng == null) {
			System.out.println(kor + "에 해당하는 영어단어는 없습니다.");
		} else {
			System.out.println(kor + "은 영어로 " + eng + "입니다.");
		}
		
		sc.close();
	}

}
