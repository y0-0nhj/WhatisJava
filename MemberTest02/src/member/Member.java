package member;

// 문제) 
// 1. Member 클래스 : 회원 클래스, 부모 클래스, 
// - 인스턴스 변수 : name(회원이름), no(회원번호), age(회원나이)
// - 생성자, getter/setter 메소드, 출력 메소드(showInfo, toString)

// 2. SpecialMember : 특별회원 클래스, Member 클래스로부터 상속받은 자식 클래스
// - 인스턴스 변수 : privilege(특별혜택) ex) 10% 할인, 무료, 20% 할인 쿠폰, 절반 가격, 1일 무료 ...
// - 생성자, getter/setter 메소드, 출력메소드 - 오버라이딩

// 3. main() 메소드 
// - Member 3명, SpecialMember 3명 -> 배열로 생성
// - 다형성을 구현하여 출력(2가지 방법)


public class Member {
	private String name;
	private String no;
	private int age;
	
	public Member(String name, String no, int age) {
		this.name = name;
		this.no = no;
		this.age = age;
	}
	
	// getter 
	public String getName() {
		return name;
	}
	
	public String getNo() {
		return no;
	}
	
	public int getAge() {
		return age;
	}
	
	// setter 
	public void setName(String name) {
		this.name = name;
	}
	
	public void setNo(String no) {
		this.no = no;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	// 출력1
	public void showInfo() {
		System.out.println("회원이름 : " + name);
		System.out.println("회원번호 : " + no);
		System.out.println("회원나이 : " + age);
	}
	
	// 출력2
	@Override
	public String toString() {
		return "회원이름: " + name + ", 번호: " + no + ", 나이 : " + age; 
	}

}
