// Ŭ������ ������ ������ ���� �ƴ� -> Ŭ������ ������ �ʿ��� ������ �����ϱ� ���� ����
// ������� Ŭ����
// ������� - ���¸���, ���¹�ȣ, �����ܰ�

// ������1 - ������ ������ �ܼ��� ������, �ּ��� ���� �˼� �ִ�.
// ������2 - �� ����� ���¶�� �ϳ��� ��� ó���ؾ� �Ѵ�. ������ ���� ó���ǰ� �ִ�.
// ������3 - �ƹ��� ������ �̸��� ���� �Ա�, ����� �� �� �ִ�.

public class AccountTest01 {
	public static void main(String[] args) {
		// john�� ����
		String johnAccountName = "John";
		String johnAccountNo = "123456";
		int johnAccountBalance = 1000;
		
		// mary�� ����
		String maryAccountName = "mary";
		String maryAccountNo = "654321";
		int maryAccountBalance = 500;
		
		// ���
		johnAccountBalance -= 200;
		// �Ա�
		maryAccountBalance += 100;
		
		System.out.println("�� John�� ����");
		System.out.println("���¸��� : " + johnAccountName);
		System.out.println("���¹�ȣ : " + johnAccountNo);
		System.out.println("�����ܰ� : " + johnAccountBalance);
		System.out.println();
		
		System.out.println("�� Mary�� ����");
		System.out.println("���¸��� : " + maryAccountName);
		System.out.println("���¹�ȣ : " + maryAccountNo);
		System.out.println("�����ܰ� : " + maryAccountBalance);
		
	}

}
