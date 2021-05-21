import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

class Member {
	 private int no;      // 회원번호  
	 private String name; // 회원이름
	 private int age;     // 회원나이
	 
	 // 생성자
	 public Member(int no, String name, int age) {
		 this.no = no;
		 this.name = name;
		 this.age = age;
	 }
	 
	 // getter
	 public int getNo() {
		 return no;
	 }
	 
	 public String getName() {
		 return name;
	 }
	 
	 public int getAge() {
		 return age;
	 }
	 
	 // setter
	 public void setNo(int no) {
		 this.no = no;
	 }
	 
	 public void setName(String name) {
		 this.name = name;
	 }
	 
	 public void setAge(int age) {
		 this.age = age;
	 }
	 
	 // toString()
	 public String toString() {
		 return no + "(" + name + "): " + age + "세";
	 }	 
}

// 문제)
// 1. Member 클래스를 완성하시오.
// 2. 키는 전화번호(010-1111-1111)이고, 값은 Member객체를 저장하는 HashMap인 map을 생성하시오.
// 3. map에 5명의 회원정보를 삽입하시오.
// 4. 전화번호가 010-2222-2222인 회원의 정보를 삭제하시오.
// 5. 전화번호가 010-3333-3333인 회원의 정보에서 이름과 나이 정보를 장겨울, 32로 수정하시오.
// 6. map의 데이터를 3가지 방법으로 출력하시오.

public class HashMapTest03 {
	public static void main(String[] args) {
		// 2. HashMap 생성
		HashMap<String, Member> map = new HashMap<String, Member>();
				
		// 3. 데이터 추가
		map.put("010-1111-1111", new Member(123456, "이익준", 40));
		map.put("010-2222-2222", new Member(123457, "김준완", 41));
		map.put("010-3333-3333", new Member(123458, "채송화", 39));
		map.put("010-4444-4444", new Member(123459, "양석형", 38));
		map.put("010-5555-5555", new Member(123460, "안정원", 42));
		
		// 6-1. 출력 - keySet(), Iterator
		Set<String> keySet = map.keySet();
		Iterator<String> it = keySet.iterator();
		while(it.hasNext()) {
			String tel = it.next();
			Member m = map.get(tel);
			System.out.println("전화번호: " + tel +", 회원정보: " + m);
		}
		System.out.println("----------");
		 
		// 6-2. 출력 - entrySet(), Iterator
//		Set<Map.Entry<String, Member>> entrySet = map.entrySet();
//		Iterator<Map.Entry<String, Member>> it2 = entrySet.iterator();
//		while(it2.hasNext()) {
//			Map.Entry<String, Member> entry = it2.next();
//			String tel = entry.getKey();
//			Member m = entry.getValue();
//			System.out.println("전화번호: " + tel + ", 회원정보: " + m);
//		}
//		System.out.println("----------");
		
		// 6-3. 출력 - entrySet(), for-in
//		entrySet = map.entrySet();
//		for(Map.Entry<String, Member> entry : entrySet) {
//			String tel = entry.getKey();
//			Member m = entry.getValue();
//			System.out.println("전화번호: " + tel + ", 회원정보: " + m);
//		}
//		System.out.println("----------");
		
		// 4. 데이터 삭제
		// 키값을 찾지 못했을 때 null을 리턴
		Member obj = map.remove("010-2222-2222");
		if(obj == null) {
			System.out.println("전화번호가 존재하지 않습니다.");
		} else {
			System.out.println("데이터를 삭제하였습니다.");
		}
		
		keySet = map.keySet();
		it = keySet.iterator();
		while(it.hasNext()) {
			String tel = it.next();
			Member m = map.get(tel);
			System.out.println("전화번호: " + tel +", 회원정보: " + m);
		}
		System.out.println("----------");
		
		// 5. 데이터 수정 -> 010-3333-3333을 수정하여 장겨울, 32로 수정, 학번은 원래의 학번을 사용
		// map.put("010-3333-3333", new Member(333333, "장겨울", 32)); // 학번을 알 경우
		Member member = map.get("010-3333-3333"); // 학번을 모를 경우
		map.put("010-3333-3333", new Member(member.getNo(), "장겨울", 32));
		
		keySet = map.keySet();
		it = keySet.iterator();
		while(it.hasNext()) {
			String tel = it.next();
			Member m = map.get(tel);
			System.out.println("전화번호: " + tel +", 회원정보: " + m);
		}
		System.out.println("----------");
		
		
		
	}

}
