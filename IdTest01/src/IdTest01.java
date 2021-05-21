
// 인스턴스 변수 - 인스턴스를 만들때마다 생성되는 변수, static 없는 변수
// instance variable : non-static field, 비정적 필드

// 클래스 변수 - 클래스가 최초로 사용되는 시점에 딱 한번만 생성되어 모든 인스턴스에서 공유하는 변수, static 있는 변수
// class variable : static field, 정적 필드

class Id {
	private static int count = 0;	// 클래스 변수, 정적 필드
	private int id = 0;				// 인스턴스 변수, 비정적 필드
	
	// 생성자
	public Id() {
		this.id = ++count;
	}
	
	// getter
	public static int getCount() { // 클래스 메소드, 정적 메소드
		return count;
	}
	
	public int getId() {		// 인스턴스 메소드, 비정적 메소드
		return id;
	}
	
	// setter	
	public void setId(int id) { // 인스턴스 메소드
		this.id = id;
	}
	
	// toString()
	public String toString() {
		return "No : " + id;
	}
}

public class IdTest01 {
	public static void main(String[] args) {
		Id a = new Id();
		Id b = new Id();
		Id c = new Id();
		
		System.out.println(a.toString()); // toString()은 쓰지 않아도 자동 호출
		System.out.println(b);
		System.out.println(c);
		
		// 공유하는 메소드인 클래스 메소드를 통해서 확인하는 방법
		// 권장하지 않음 -> 클래스 메소드가 각 인스턴스에 속해 있는 인스턴스 메소드처럼 보이기 때문.
		System.out.println("지금까지 생성된 count의 값 : " + a.getCount());
		System.out.println("지금까지 생성된 count의 값 : " + b.getCount());
		System.out.println("지금까지 생성된 count의 값 : " + c.getCount());
		
		// 클래스 메소드를 사용하는 방법 - 클래스명.클래스 메소드명
		System.out.println("지금까지 생성된 count의 값 : " + Id.getCount());
	}

}
