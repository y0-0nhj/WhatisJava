package test;

import pet.*;

// 다형성(polymorphism)
// - 다양한 형태로 표현되는 성질
// - 다양한 형태의 클래스의 인스턴스를 한꺼번에 선언하고, 한꺼번에 처리하도록 하는 것.
public class PetTest02 {
	public static void main(String[] args) {
		// 배열 활용
		// 1번
//		Pet[] pets = new Pet[4];
//		pets[0] = new Pet("나비", "안정원");
//		pets[1] = new RobotPet("마크", "장겨울");
//		pets[2] = new Pet("벌이", "이익준");
//		pets[3] = new RobotPet("제리", "채송화");
		
		// 2번
		Pet[] pets = new Pet[] {
			new Pet("나비", "안정원"), 
			new RobotPet("마크", "장겨울"),
			new Pet("벌이", "이익준"),
			new RobotPet("제리", "채송화"),
		};
		
		// 출력 1번 - 기본 for문
		for(int i=0; i<pets.length; i++) {
			pets[i].introduce();
			// 문제: 로봇펫인 경우에는 일을 시킨도록 하려면 어떻게 할까?
			// pet[i]가 RobotPet형을 참조한다면(인스턴스라면) 참(true)
			if(pets[i] instanceof RobotPet) { 
				((RobotPet)pets[i]).work(1);
			}
			System.out.println();
		}
		System.out.println("----------");
		
		// 출력2번 - for-in문, 확장 for문
		for(Pet p : pets) {
			p.introduce();
			if(p instanceof RobotPet) { 
				((RobotPet)p).work(2);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		// End
	}

}
