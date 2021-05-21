package product;

import java.util.ArrayList;

// ������, ��, 3���� ��ǰ�� �����ϴ� ������
public class Buyer {
	private int money = 1000; // �������� �����ݾ�
	private int bonusPoint = 0;
	ArrayList<Product> item = new ArrayList<Product>(); // -> �������� ����
	private int i = 0; // ��ǰ������ ī����
	
	// ��ǰ ���� �޼ҵ�
	public void buy(Product p) { // -> �������� ����
		// �ܾ��� ����
		if(money < p.getPrice()) {
			System.out.println("�ܾ��� �����Ͽ� ��ǰ�� ������ �� �����ϴ�.");
			return;
		}
		
		// �ܾ��� ���
		item.add(p);
		money -= p.getPrice(); // �ܾ׿��� ��ǰ�� ������ ����
		bonusPoint += p.getBonusPoint(); // ���ʽ�����Ʈ�� ����
		System.out.println(p.toString() + "�� �����Ͽ����ϴ�.");
	}
	
	// ��ǰ �޼ҵ�
	public void refund(Product p) {
		if(item.remove(p)) { // ���ſ� �������� ��
			money += p.getPrice();
			bonusPoint -= p.getBonusPoint();
			System.out.println(p + " ��ǰ�� ��ǰ�ϼ̽��ϴ�.");
		} else {			 // ���ſ� �������� ��
			System.out.println("��ǰ�� �����Ͽ����ϴ�.\n�����Ͻ� ��ǰ��Ͽ� " + p + " ��ǰ�� �����ϴ�.");
		}
	}
	
	// ���� ��� �޼ҵ� - ���� �ѱݾ�, ���� ��ǰ
	public void summary() {
		int sum = 0; // ���� �ѱݾ�
		String itemList = ""; // ���� ��ǰ ����Ʈ
		
		// ������ ��ǰ�� ���� ��
		if(item.isEmpty()) {
			System.out.println("�����Ͻ� ��ǰ�� �����ϴϴ�.");
			return;
		}
		
		for(int i=0; i<item.size(); i++) {
			Product p = item.get(i);
			sum += p.getPrice();
			itemList += p.toString() + ", ";
		}
		
		System.out.println("�����Ͻ� ��ǰ�� " + itemList + "�Դϴ�.");
		System.out.println("�����Ͻ� �ѱݾ��� " + sum + "�Դϴ�.");
		System.out.println("������ �ܰ�� " + money + "�Դϴ�.");
		System.out.println("������ ����Ʈ�� " + bonusPoint + "�Դϴ�.");
	}
}
