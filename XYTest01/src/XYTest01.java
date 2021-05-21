
class XY {
	// 클래스 변수
	private static int count;
	// 인스턴스 변수
	private int id;
	private int x = 0;
	private int y = 0;
	
	// 인스턴스 초기자
	// - 모든 생성자 사용 직전에 호출되는 초기자
	{
		id = ++count;
	}
	
	// 생성자 오버로딩
	// 기본 생성자
	public XY() {
		//id = ++count;
	}
	
	// 매개변수를 1개 갖는 생성자
	public XY(int x) {
		this.x = x;
		//id = ++count;
	}
	
	// 매개변수를 2개 갖는 생성자
	public XY(int x, int y) {
		this.x = x;
		this.y = y;
		//id = ++count;
	}
	
	// 복사 생성자
	public XY(XY a) {
		this.x = a.x;
		this.y = a.y;
		//id = ++count;
	}
	
	public String toString() {
		return "No. " + id + " : (" + x + ", " + y + ")";
	}
 }

public class XYTest01 {
	public static void main(String[] args) {
		XY a = new XY();
		XY b = new XY(10);
		XY c = new XY(20, 30);
		XY d = new XY(c);
		
		System.out.println(a.toString());
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);	
	}

}
