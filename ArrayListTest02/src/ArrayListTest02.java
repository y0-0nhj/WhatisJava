import java.util.ArrayList;
import java.util.Iterator;

// 회원 클래스
class Member {
	private String no;   // 회원번호
	private String name; // 회원이름
	private int age;     // 회원나이
	
	// 생성자
	public Member(String no, String name, int age) {
		this.no = no;
		this.name = name;
		this.age = age;
	}
	
	// getter
	public String getNo() {
		return no;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	// setter
	public void setNo(String no) {
		this.no = no;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	// 출력 - toString()
	public String toString() {
		return no + "(" + name + ") : " + age;
	}
	
}

public class ArrayListTest02 {
	public static void main(String[] args) {
		// 1. Member형의 인스턴스를 저장하는 ArrayList 생성
		System.out.println("- 1. 리스트 생성");
		ArrayList<Member> list = new ArrayList<Member>();
		
		// 2. 리스트에 Member 5명을 추가
		System.out.println("- 2. 리스트에 데이터 추가");
		list.add(new Member("123456", "이익준", 40));
		list.add(new Member("123457", "양석형", 41));
		list.add(new Member("123458", "추민하", 32));
		list.add(new Member("123459", "채송화", 38));
		list.add(new Member("123460", "안정원", 39));
		//System.out.println(list);
		
		// 3. 출력
		System.out.println("- 3. 리스트의 데이터 출력");
		for(Member m : list) {
			System.out.println(m);
		}
		System.out.println("크기: " + list.size());
	
		// 4. 순차적인 데이터 추가 (1건) - 맨 뒤에 추가
		System.out.println("- 4. 맨 뒤에 데이터 추가");
		list.add(new Member("223344", "장겨울", 30));
		
		for(Member m : list) {
			System.out.println(m);
		}
		System.out.println("크기: " + list.size());
		
		// 5. 비순차적인 데이터 추가(1건) - 중간에서 추가, 이익준 뒤에 김준완 추가
		System.out.println("- 5. 중간에 데이터 추가");
		//list.add(1, new Member("778899", "김준완", 40));
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getName().equals("이익준")) {
				list.add(i+1, new Member("778899", "김준완", 40));
			}
		}
		
		for(Member m : list) {
			System.out.println(m);
		}
		System.out.println("크기: " + list.size());
		
		// 6. 데이터를 수정 - 양석형의 나이를 43으로 수정
		System.out.println("- 6. 데이터 수정");
//		Member member = list.get(2);
//		member.setAge(43);
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getName().equals("양석형")) {
				list.get(i).setAge(43);
			}
		}
		
		for(Member m : list) {
			System.out.println(m);
		}
		System.out.println("크기: " + list.size());
		
		// 7. 데이터를 삭제 - 추민하의 데이터를 삭제
		System.out.println("- 7. 데이터 삭제");
		//list.remove(3);
		
		for(int i=list.size()-1; i>=0; i--) {
			if(list.get(i).getName().equals("추민하")) {
				list.remove(i);
			}
		}
		
		for(Member m : list) {
			System.out.println(m);
		}
		System.out.println("크기: " + list.size());
		
		// 8. 출력
		System.out.println("- 8. 전체 데이터 출력");
		// 8-1. 기본 for문
//		for(int i=0; i<list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		
		// 8-2. for-in문
//		for(Member m : list) {
//			System.out.println(m);
//		}
		
		// 8-3. Iterator(반복자) 클래스 활용
		Iterator<Member> it = list.iterator();
		while(it.hasNext()) {
//			Member member = it.next();
//			System.out.println(member);
			System.out.println(it.next());
		}
		System.out.println("크기: " + list.size());
		
		// end
	}

}
