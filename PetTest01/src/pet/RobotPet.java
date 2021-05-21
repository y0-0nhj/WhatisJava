package pet;

// 로봇애완동물 클래스
public class RobotPet extends Pet {
	
	public RobotPet(String name, String masterName) {
		super(name, masterName);
	}
	
	// 오버라이딩
	public void introduce() {
		System.out.println("◎ 저는 로봇펫입니다. 이름은 " + getName() + "입니다.");
		System.out.println("◎ 주인님의 이름은 " + getMasterName() + "입니다.");
	}
	
	// 추가 - 집안일을 하는 기능
	public void work(int sw) {
		switch(sw) {
		case 1:
			System.out.println("청소를 합니다.");
			break;
		case 2:
			System.out.println("빨래를 합니다.");
			break;
		case 3:
			System.out.println("밥상을 차립니다.");
			break;
		}
	}
}
