
// ������� Ŭ���� - ���¸���, ���¹�ȣ, �����ܰ�
// Ŭ���� ���� - ���赵

// 1. Ȯ���� �ʱ�ȭ�� ������ �ǰ� ���� �ʴ�.
// 2. �ƹ��� ������� �ϰ� �ִ�.
class Account {
	// ��� ����
	String name;
	String no;
	int balance;
	
	// ����Ʈ ������(�⺻ ������)
	// 1. Ŭ������ ����� ������ �����Ѵ�.
	// 2. ����Ʈ �����ڴ� ���� ����
	// 3. �ٸ� ������(�Ű������� ���� ������)�� ����� ����Ʈ �����ڴ� ��������.
	Account() {
		
	}
}

public class AccountTest02 {
	public static void main(String[] args) {
		// Ŭ���� ���
		// �������� ���� - ��ü�� ����
		// �ڹ� - �ν��Ͻ�(instance), ��ü
		Account john = new Account(); // �ν��Ͻ�
		Account mary = new Account();
		
		// . ������ - ��� ����(access) ������
//		john.name = "John"; // ���� ����, �ʱ�ȭ
//		john.no = "123456";
//		john.balance = 1000;
//		
//		mary.name = "Mary";
//		mary.no = "654321";
//		mary.balance = 200;
		
//		john.balance -= 200; // ���
//		mary.balance += 100; // �Ա�
		
		
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
