import java.util.HashMap;
import java.util.Scanner;

public class HashMapTest05 {
	public static void main(String[] args) {
		// HashMap 생성 - 아이디와 비밀번호를 저장하는 맵 -> 로그인 프로그램
		// 키: 아이디, 값: 비밀번호
		HashMap<String, String> map = new HashMap<String, String>();
		Scanner sc = new Scanner(System.in);
		
		// 데이터 추가
		map.put("aaa1111", "1111");
		map.put("bbb2222", "2222");
		map.put("ccc3333", "3333");
		map.put("ddd4444", "4444");
		map.put("eee5555", "5555");
		System.out.println(map);
		
		// 로그인하는 상황
		System.out.println("신세계 쇼핑몰에 오신걸 환영합니다.\n아이디와 비밀번호를 입력해주세요.");
		while(true) {
			System.out.print("아이디 입력: ");
			String id = sc.next();
			System.out.print("비밀번호 입력: ");
			String pwd = sc.next();
			
			// 아이디의 존재 유무 -> true, false
			if(map.containsKey(id)) { // 아이디가 있을 때
				if(map.get(id).equals(pwd)) { // 아이디에 대한 비밀번호가 같을 때
					System.out.println(id + "님이 로그인하였습니다.");
					break;
				} else {                      // 아이디에 대한 비밀번호가 다를 때
					System.out.println("비밀번호가 다릅니다.\n비밀번호를 다시 입력해주세요");
				}
			} else {                  // 아이디가 없을 때
				System.out.println("아이디가 존재하지 않습니다.\n아이디를 다시 입력해주세요.");
			}
		}
		
		sc.close();
	}
}
