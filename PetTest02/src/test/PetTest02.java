package test;

import pet.*;

// ������(polymorphism)
// - �پ��� ���·� ǥ���Ǵ� ����
// - �پ��� ������ Ŭ������ �ν��Ͻ��� �Ѳ����� �����ϰ�, �Ѳ����� ó���ϵ��� �ϴ� ��.
public class PetTest02 {
	public static void main(String[] args) {
		// �迭 Ȱ��
		// 1��
//		Pet[] pets = new Pet[4];
//		pets[0] = new Pet("����", "������");
//		pets[1] = new RobotPet("��ũ", "��ܿ�");
//		pets[2] = new Pet("����", "������");
//		pets[3] = new RobotPet("����", "ä��ȭ");
		
		// 2��
		Pet[] pets = new Pet[] {
			new Pet("����", "������"), 
			new RobotPet("��ũ", "��ܿ�"),
			new Pet("����", "������"),
			new RobotPet("����", "ä��ȭ"),
		};
		
		// ��� 1�� - �⺻ for��
		for(int i=0; i<pets.length; i++) {
			pets[i].introduce();
			// ����: �κ����� ��쿡�� ���� ��Ų���� �Ϸ��� ��� �ұ�?
			// pet[i]�� RobotPet���� �����Ѵٸ�(�ν��Ͻ����) ��(true)
			if(pets[i] instanceof RobotPet) { 
				((RobotPet)pets[i]).work(1);
			}
			System.out.println();
		}
		System.out.println("----------");
		
		// ���2�� - for-in��, Ȯ�� for��
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
