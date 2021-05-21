// ������� Ŭ���� - ���¸���, ���¹�ȣ, �����ܰ�
class Account {
	String name; 
	String no;
	int balance;
	
	// ��ǥ �鸸��
	// ������(Constructor)
	// �������� Ư¡
	// 1. Ŭ������ �̸��� ����. 2. ����Ÿ���� ����.
	
	// �������� ����
	// 1. �ν��Ͻ��� ���鶧�� ȣ��ȴ�.
	// 2. Ȯ���� �ʱ�ȭ�� ���� ������ ���ش�.
	
	// ������ �����ε�
	Account(String n, String num, int b) {
		name = n;
		no = num;
		balance = b;
	}
	
	// �⺻ ������
	Account() {
		
	}
	
}

public class AccountTest03 {
	public static void main(String[] args) {
		// �ν��Ͻ� ����
		// 1. john�̶�� �������� ����
		// 2. john�� �ν��Ͻ� ����
		// 3. ������ ȣ��
		Account john = new Account("john", "123456", 1000);
		Account mary = new Account("mary", "654321", 200);
		//Account tom = new Account();
		
		john.balance -= 200;
		
		// ���
		System.out.println("�� John�� ����");
		System.out.println("���¸��� : " + john.name);
		System.out.println("���¹�ȣ : " + john.no);
		System.out.println("�����ܰ� : " + john.balance);
		System.out.println();
		
		System.out.println("�� Mary�� ����");
		System.out.println("���¸��� : " + mary.name);
		System.out.println("���¹�ȣ : " + mary.no);
		System.out.println("�����ܰ� : " + mary.balance);
	}

}
