package product;

// 자식 클래스
public class Computer extends Product {
	
	public Computer() {
		super(200);
	}
	
	@Override 
	public String toString() {
		return "Computer";
	}

}
