import java.util.HashSet;
import java.util.Iterator;

class Member {
	private String name;
	private int age;
	
	// 생성자
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// getter
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	// setter
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	// toString()
	@Override
	public String toString() {
		return name + "(" + age + ")";
	}
	
	// HashSet에서 사용할수 있도록 하는  두 개의 메소드를 오버라이딩
	@Override
	public int hashCode() {
		return (name+age).hashCode();
	}
	
	@Override 
	public boolean equals(Object o) {
		if(o instanceof Member) {
			Member m = (Member)o;
			return this.name.equals(m.name) && this.age == m.age;
		} 
		return false;
	}
}

// 문제)
// 1. Member 클래스를 완성하시오.
// 2. main() 메소드에 Member 클래스의 객체를 저장하는 HashSet인 set을 생성하시오.
// 3. set에 5명의 데이터를 추가하시오.
// 4. 순서의 없음을 확인하시오.
// 5. 중복된 데이터의 허용여부를 확인하시오.
// 6. 김준완 데이터를 삭제하시오.
// 7. 이익준의 나이를 45로 변경하시오.
// 8. set의 데이터를 2가지 방법으로 출력하시오. (for-in문, Iterator 사용)

public class HashSetTest03 {
	public static void main(String[] args) {
		// 2. HashSet 생성
		HashSet<Member> set = new HashSet<Member>();
		
		// 3. 데이터 추가  
		// 4. 순서 없음
		set.add(new Member("이익준", 42));
		set.add(new Member("김준완", 41));
		set.add(new Member("안정원", 39));
		set.add(new Member("채송화", 38));
		set.add(new Member("양석형", 40));
		System.out.println(set);
		System.out.println("크기 : " + set.size());
		
		// 5-1. 중복 데이터 추가 : 이름만 중복 -> 허용
		set.add(new Member("채송화", 25));
		System.out.println(set);
		System.out.println("크기 : " + set.size());
		
		// 5-2. 중복 데이터 추가 : 나이만 중복 -> 허용
		set.add(new Member("도재학", 38));
		System.out.println(set);
		System.out.println("크기 : " + set.size());
		
		// 5-3. 중복 데이터 추가 : 이름과 나이 모두 중복
		// -> 문제점 : 이 문제를 해결해야만 set에 객체를 담아 사용하는 것이 가능해짐.
		// -> 해결책 : set에서 사용하는 클래스 안에  hashCode(), equals() 이 두 개의 메소드를 오버라이딩해야만 함.
		set.add(new Member("이익준", 42));
		System.out.println(set);
		System.out.println("크기 : " + set.size());
		
		// 6. 데이터의 삭제
		int age = 0;
		for(Member m : set) {
			if(m.getName().equals("김준완")) {
				age = m.getAge();
			}
		}
		set.remove(new Member("김준완", age));
		
		System.out.println(set);
		System.out.println("크기 : " + set.size());
		
		
		// 7. 데이터의 변경
		age = 0;
		for(Member m : set) {
			if(m.getName().equals("이익준")) {
				age = m.getAge();
			}
		}
		set.remove(new Member("이익준", age));
		set.add(new Member("이익준", 45));
		
		System.out.println(set);
		System.out.println("크기 : " + set.size());
		
		// 8-1. 출력 : for-in문
		for(Member m : set) {
			System.out.println(m);
		}
		System.out.println("-----");
		
		// 8-2. 출력 : Iterator 사용
		Iterator<Member> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("-----");
		
		
		
		
		
		
		
	}

}
