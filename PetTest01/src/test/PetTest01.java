package test;

//import pet.Pet;
//import pet.RobotPet;

import pet.*;

public class PetTest01 {
	public static void main(String[] args) {
		Pet happy = new Pet("����", "������");
		happy.introduce();
		System.out.println();
		
		RobotPet r2d2 = new RobotPet("R2D2", "��ܿ�");
		r2d2.introduce();
		System.out.println();
		
		// ���� ���ε� (dynamic biding): �θ� Ÿ���� ������ ����ϴ� ���� �ƴ϶�, ������ ������ ã�ư��� ���� ������ ����ϴ� ��
		Pet navi = r2d2;
		navi.introduce();
		System.out.println();
	}

}
