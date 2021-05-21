import java.util.TreeSet;

class Fruit implements Comparable<Fruit> {
	private String name; // ���� �̸�
	private int price;   // ���� ����
	private int volume;  // ���� ����
	
	// ������
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
		return name + ", ����: " + price + ", ����: " + volume + "\n";
	}
	
	// ��� 
	public void print() {
		System.out.println(name + ", ����: " + price + ", ����: " + volume);
	}
	
	// Comparable �������̽��� �߻�޼ҵ带 �������̵�
	// �����̸��� �������� �������� ����
//	@Override
//	public int compareTo(Fruit f) {
//		if(this.name.compareTo(f.name) > 0) return 1;
//		else if(this.name.compareTo(f.name) < 0) return -1;
//		else return 0;
//	}
	
	// �����̸��� �������� �������� ����
//	@Override
//	public int compareTo(Fruit f) {
//		if(this.name.compareTo(f.name) > 0) return -1;
//		else if(this.name.compareTo(f.name) < 0) return 1;
//		else return 0;
//	}
	
	// ���ϰ����� �������� �������� ����
//	@Override
//	public int compareTo(Fruit f) {
//		if(this.price > f.price) return 1;
//		else if(this.price < f.price) return -1;
//		else return 0;
//	}
	
	// ���ϰ����� �������� �������� ����
//	@Override
//	public int compareTo(Fruit f) {
//		if(this.price > f.price) return -1;
//		else if(this.price < f.price) return 1;
//		else return 0;
//	}
	
	// ���ϼ����� �������� �������� ����
//	@Override
//	public int compareTo(Fruit f) {
//		if(this.volume > f.volume) return 1;
//		else if(this.volume < f.volume) return -1;
//		else return 0;
//	}
	
	// ���ϼ����� �������� �������� ����
	@Override
	public int compareTo(Fruit f) {
		if(this.volume > f.volume) return -1;
		else if(this.volume < f.volume) return 1;
		else return 0;
	}
	
}

// ����)
// 1. Fruit Ŭ������ �ϼ��Ͻÿ�.
// 2. main() �޼ҵ忡 Fruit Ŭ������ ��ü�� �����ϴ� TreeSet�� set�� �����Ͻÿ�.
// 3. set�� 5������ ������ �����Ͻÿ�.
// 4. set�� ������ �ϰ� �ִ��� Ȯ���ϰ�, �׷��� �ʴٸ� �� ������ �ذ��Ͻÿ�.
// 5. set�� ������ ����Ͻÿ�.


public class TreeSetTest07 {
	public static void main(String[] args) {
		// 2. TreeSet ����
		TreeSet<Fruit> set = new TreeSet<Fruit>();
		
		// 3. ������ �߰�
		// 4. ������ �߰��� �� ���ܰ� �߻�
		// - ������) TreeSet�� �����͸� �߰��� �� ������������ �����ؼ� �߰��ؾ� �ϴµ�, Fruit ��ü�� ������ ������ ���õǾ����� ����.
		// - �ذ�å) Fruit Ŭ������ ���� ������ Fruit Ŭ������ ������ �� ���� �־�� ��.
		set.add(new Fruit("���", 1000, 35));
		set.add(new Fruit("�ڵ�", 3000, 50));
		set.add(new Fruit("����", 6000, 27));
		set.add(new Fruit("����", 4500, 30));
		set.add(new Fruit("�޷�", 2800, 28));
		
		// 5. ���
		for(Fruit f : set) {
			f.print();
		}
		
		
	}

}
