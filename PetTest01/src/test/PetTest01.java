package test;

//import pet.Pet;
//import pet.RobotPet;

import pet.*;

public class PetTest01 {
	public static void main(String[] args) {
		Pet happy = new Pet("해피", "안정원");
		happy.introduce();
		System.out.println();
		
		RobotPet r2d2 = new RobotPet("R2D2", "장겨울");
		r2d2.introduce();
		System.out.println();
		
		// 동적 바인딩 (dynamic biding): 부모 타입의 내용을 출력하는 것이 아니라, 실제의 내용을 찾아가서 실제 내용을 출력하는 것
		Pet navi = r2d2;
		navi.introduce();
		System.out.println();
	}

}
