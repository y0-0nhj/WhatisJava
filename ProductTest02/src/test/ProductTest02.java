package test;

import product.Audio;
import product.Buyer;
import product.Computer;
import product.Tv;

public class ProductTest02 {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		Tv tv1 = new Tv();
		b.buy(tv1);
		Audio audio1 = new Audio();
		b.buy(audio1);
		Computer com1 = new Computer();
		b.buy(com1);
		Computer com2 = new Computer();
		b.buy(com2);
		Computer com3 = new Computer();
		b.buy(com3);
		Computer com4 = new Computer();
		b.buy(com4);
		Computer com5 = new Computer(); // 잔액 부족
		b.buy(com5);
		
		b.refund(tv1);  // tv1 반품
		b.refund(com1); // com1 반품
		System.out.println("----------");
		
		b.summary();
	}

}
