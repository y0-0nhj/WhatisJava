package wearable;

public class WearableRobot implements Wearable, Color {
	private int color;
	
	public WearableRobot(int color) {
		this.color = color;
	}

	@Override
	public void putOn() {
		System.out.println(toString() + " ÀåÂø~~~");
	}
	
	@Override
	public void putOff() {
		System.out.println(toString() + " ÇØÁ¦~~~");
	}
	
	@Override
	public void changeColor(int color) {
		this.color = color;
	}
	
	// toString()
	public String toString() {
		switch(color) {
		case RED:
			return "»¡°­ ·Îº¿";
		case GREEN:
			return "ÃÊ·Ï ·Îº¿";
		case BLUE:
			return "ÆÄ¶û ·Îº¿";
		default:
			return "°ËÁ¤ ·Îº¿";
		}
	}
}
