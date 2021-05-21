package product;

// 추상 클래스
public abstract class Product {
	private int price;
	private int bonusPoint;
	
	public Product() { }
	
	public Product(int price) {
		this.price = price;
		this.bonusPoint = (int)(price * 0.1);
	}

	// 추상 메소드
	public abstract String toString();
	
	// getter
	public int getPrice() {
		return price;
	}
	
	public int getBonusPoint() {
		return bonusPoint;
	}
}
