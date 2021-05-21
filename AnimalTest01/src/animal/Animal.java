package animal;

// 동물 클래스 - 추상 클래스, 부모 클래스, 다형성의 구현에 활용
public abstract class Animal {
	private String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	// 추상 메소드
	public abstract void bark();
	public abstract String toString();
	
	// getter
	public String getName() {
		return name;
	}
	
	// setter 
	public void setName(String name) {
		this.name = name;
	}
	
	public void introduce() {
		System.out.println(toString());
		bark();
	}
}
