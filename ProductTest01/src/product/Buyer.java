package product;

// 구매자, 고객, 3가지 상품을 구매하는 구매자
public class Buyer {
	private int money = 1000; // 구매자의 소유금액
	private int bonusPoint = 0;
	Product[] item = new Product[10]; // -> 다형성을 구현
	private int i = 0; // 상품개수를 카운팅
	
	// 상품 구매 메소드
	public void buy(Product p) { // -> 다형성을 구현
		// 잔액이 부족
		if(money < p.getPrice()) {
			System.out.println("잔액이 부족하여 상품을 구매할 수 없습니다.");
			return;
		}
		
		// 잔액이 충분
		item[i++] = p;
		money -= p.getPrice(); // 잔액에서 상품의 가격을 뺀다
		bonusPoint += p.getBonusPoint(); // 보너스포인트는 누적
		System.out.println(p.toString() + "를 구매하였습니다.");
	}
	
	// 반품 메소드
	public void refund(Product p) {
		
	}
	
	// 구매 결과 메소드 - 구매 총금액, 구매 제품
	public void summary() {
		int sum = 0; // 구매 총금액
		String itemList = ""; // 구매 상품 리스트
		
		for(int i=0; i<item.length; i++) {
			if(item[i] == null) break; // 더이상 구매한 상품이 없다면
			sum += item[i].getPrice();
			itemList += item[i].toString() + ", ";
		}
		
		System.out.println("구매하신 상품은 " + itemList + "입니다.");
		System.out.println("구매하신 총금액은 " + sum + "입니다.");
		System.out.println("고객님의 잔고는 " + money + "입니다.");
		System.out.println("고객님의 포인트는 " + bonusPoint + "입니다.");
	}
}
