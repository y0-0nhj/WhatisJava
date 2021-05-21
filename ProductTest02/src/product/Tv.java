package product;

// 자식 클래스
public class Tv extends Product {
	
	// 디폴트 생성자
	public Tv() {
		super(100);
	}

	@Override
	public String toString() {
		return "Tv";
	}
	
}
