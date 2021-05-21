import java.util.TreeSet;

class Fruit implements Comparable<Fruit> {
	private String name; // 과일 이름
	private int price;   // 과일 가격
	private int volume;  // 과일 수량
	
	// 생성자
	public Fruit(String name, int price, int volume) {
		this.name = name;
		this.price = price;
		this.volume = volume;
	}
	
	// getter
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public int getVolume() {
		 return volume;
	}
	
	// setter
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	// toString()
	public String toString() {
		return name + ", 가격: " + price + ", 수량: " + volume + "\n";
	}
	
	// 출력 
	public void print() {
		System.out.println(name + ", 가격: " + price + ", 수량: " + volume);
	}
	
	// Comparable 인터페이스의 추상메소드를 오버라이딩
	// 과일이름을 기준으로 오름차순 정렬
//	@Override
//	public int compareTo(Fruit f) {
//		if(this.name.compareTo(f.name) > 0) return 1;
//		else if(this.name.compareTo(f.name) < 0) return -1;
//		else return 0;
//	}
	
	// 과일이름을 기준으로 내림차순 정렬
//	@Override
//	public int compareTo(Fruit f) {
//		if(this.name.compareTo(f.name) > 0) return -1;
//		else if(this.name.compareTo(f.name) < 0) return 1;
//		else return 0;
//	}
	
	// 과일가격을 기준으로 오름차순 정렬
//	@Override
//	public int compareTo(Fruit f) {
//		if(this.price > f.price) return 1;
//		else if(this.price < f.price) return -1;
//		else return 0;
//	}
	
	// 과일가격을 기준으로 내림차순 정렬
//	@Override
//	public int compareTo(Fruit f) {
//		if(this.price > f.price) return -1;
//		else if(this.price < f.price) return 1;
//		else return 0;
//	}
	
	// 과일수량을 기준으로 오름차순 정렬
//	@Override
//	public int compareTo(Fruit f) {
//		if(this.volume > f.volume) return 1;
//		else if(this.volume < f.volume) return -1;
//		else return 0;
//	}
	
	// 과일수량을 기준으로 내림차순 정렬
	@Override
	public int compareTo(Fruit f) {
		if(this.volume > f.volume) return -1;
		else if(this.volume < f.volume) return 1;
		else return 0;
	}
	
}

// 문제)
// 1. Fruit 클래스를 완성하시오.
// 2. main() 메소드에 Fruit 클래스의 객체를 저장하는 TreeSet인 set을 생성하시오.
// 3. set에 5가지의 과일을 저장하시오.
// 4. set이 정렬을 하고 있는지 확인하고, 그렇지 않다면 이 문제를 해결하시오.
// 5. set의 내용을 출력하시오.


public class TreeSetTest07 {
	public static void main(String[] args) {
		// 2. TreeSet 생성
		TreeSet<Fruit> set = new TreeSet<Fruit>();
		
		// 3. 데이터 추가
		// 4. 데이터 추가할 때 예외가 발생
		// - 문제점) TreeSet은 데이터를 추가할 때 오름차순으로 정렬해서 추가해야 하는데, Fruit 객체는 정렬의 기준이 마련되어있지 않음.
		// - 해결책) Fruit 클래스의 정렬 기준을 Fruit 클래스를 생성할 때 적어 주어야 함.
		set.add(new Fruit("사과", 1000, 35));
		set.add(new Fruit("자두", 3000, 50));
		set.add(new Fruit("포도", 6000, 27));
		set.add(new Fruit("망고", 4500, 30));
		set.add(new Fruit("메론", 2800, 28));
		
		// 5. 출력
		for(Fruit f : set) {
			f.print();
		}
		
		
	}

}
