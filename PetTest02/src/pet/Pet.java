package pet;

// 애완동물 클래스
public class Pet {
	private String name; 		// 이름
	private String masterName;  // 주인이름
	
	// constructor
	public Pet(String name, String masterName) {
		this.name = name;
		this.masterName = masterName;
	}
	
	// getter
	public String getName() { 
		return name;
	}
	
	public String getMasterName() {
		return masterName;
	}
	
	public void introduce() {
		System.out.println("◆ 제 이름은 " + name + "입니다.");
		System.out.println("◆ 주인님의 이름은 " + masterName + "입니다.");
	}
}
