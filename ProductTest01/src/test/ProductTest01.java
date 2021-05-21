package test;

import product.*;

public class ProductTest01 {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		
//		Tv tv = new Tv();
//		b.buy(tv);
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer()); // ¿‹∞Ì ∫Œ¡∑
		System.out.println("----------");
		
		b.summary();
	}
	
}
