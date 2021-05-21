package shape;

// 수평선 클래스
public class HorizontalLine extends AbstractLine {
	
	public HorizontalLine(int length) {
		super(length);
	}

	@Override
	public void draw() {
		for(int i=1; i<=getLength(); i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	@Override
	public String toString() {
		return "HrizontalLine (length: " + getLength() + ")";
	}
	
}
