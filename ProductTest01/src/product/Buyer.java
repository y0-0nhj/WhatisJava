package product;

// ������, ��, 3���� ��ǰ�� �����ϴ� ������
public class Buyer {
	private int money = 1000; // �������� �����ݾ�
	private int bonusPoint = 0;
	Product[] item = new Product[10]; // -> �������� ����
	private int i = 0; // ��ǰ������ ī����
	
	// ��ǰ ���� �޼ҵ�
	public void buy(Product p) { // -> �������� ����
		// �ܾ��� ����
		if(money < p.getPrice()) {
			System.out.println("�ܾ��� �����Ͽ� ��ǰ�� ������ �� �����ϴ�.");
			return;
		}
		
		// �ܾ��� ���
		item[i++] = p;
		money -= p.getPrice(); // �ܾ׿��� ��ǰ�� ������ ����
		bonusPoint += p.getBonusPoint(); // ���ʽ�����Ʈ�� ����
		System.out.println(p.toString() + "�� �����Ͽ����ϴ�.");
	}
	
	// ��ǰ �޼ҵ�
	public void refund(Product p) {
		
	}
	
	// ���� ��� �޼ҵ� - ���� �ѱݾ�, ���� ��ǰ
	public void summary() {
		int sum = 0; // ���� �ѱݾ�
		String itemList = ""; // ���� ��ǰ ����Ʈ
		
		for(int i=0; i<item.length; i++) {
			if(item[i] == null) break; // ���̻� ������ ��ǰ�� ���ٸ�
			sum += item[i].getPrice();
			itemList += item[i].toString() + ", ";
		}
		
		System.out.println("�����Ͻ� ��ǰ�� " + itemList + "�Դϴ�.");
		System.out.println("�����Ͻ� �ѱݾ��� " + sum + "�Դϴ�.");
		System.out.println("������ �ܰ�� " + money + "�Դϴ�.");
		System.out.println("������ ����Ʈ�� " + bonusPoint + "�Դϴ�.");
	}
}
