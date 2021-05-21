import java.util.Iterator;
import java.util.LinkedList;

// ����Ʈ Ŭ����
class Point {
	private int x;
	private int y;
	
	// ������
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// getter
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	// setter
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	// toString()
	public String toString() {
		return "(" + x + "," + y + ")";
	}
	
	// ����Ʈ ��ü�� ���� ���ϴ� �޼ҵ� 
	public boolean compare(Point p) {
		return this.x == p.x && this.y == p.y;
	}
	
}

// ����)
// 1. Point Ŭ������ ������, getter/setter, toString()�޼ҵ带 �߰��Ͽ� Ŭ������ �ϼ��Ͻÿ�.
// 2. main�� Point ��ü�� ��� LinkedList�� list�� �����Ͻÿ�.
// 3. ����Ʈ�� Point ��ü 10���� �����Ͻÿ�.
// (10, 10), (20, 20), (30, 30) ...... (100, 100)
// 4. ����Ʈ�� (10, 10) �ڿ� (11, 11) �����͸� �߰��Ͻÿ�.
// 5. ����Ʈ�� (40, 40) �����͸� �����Ͻÿ�.
// 6. ����Ʈ�� (50, 50) �����͸� (55, 55)�� �����Ͻÿ�.
// 7. ����Ʈ�� �� �տ� (1, 1) �����͸� �߰��Ͻÿ�.
// 8. ����Ʈ�� �����͸� 3���� ������� ����Ͻÿ�. (�⺻ for��, for-in��, Iterator ���) 


public class LinkedListTest02 {
	public static void main(String[] args) {
		System.out.println("- 2. LinkedList ����");
		LinkedList<Point> list = new LinkedList<Point>();
		
		System.out.println("- 3. ����Ʈ�� �ǵڿ� ������ �߰�");
		for(int i=10; i<=100; i+=10) {
			list.add(new Point(i, i));
		}
		System.out.println(list);
		
		System.out.println("- 4. ����Ʈ�� �߰��� ������ �߰�");
		//list.add(1, new Point(11, 11));
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).compare(new Point(10, 10))) {
				list.add(i+1, new Point(11, 11));
			}
		}
		System.out.println(list);
		
		System.out.println("- 5. ����Ʈ�� ������ ����");
		//list.remove(4);
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).compare(new Point(40, 40))) {
				list.remove(i);
			}
		}
		System.out.println(list);
		
		System.out.println("- 6. ����Ʈ�� ������ ����");
		//list.set(4, new Point(55, 55));
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).compare(new Point(50, 50))) {
				list.set(i, new Point(55, 55));
			}
		}
		System.out.println(list);
		
		System.out.println("- 7. ����Ʈ�� �� �տ� ������ �߰�");
		//list.add(0, new Point(1, 1));
		list.addFirst(new Point(1, 1));
		System.out.println(list);
		
		System.out.println("- 8. ����Ʈ�� ���� ���");
		// 8-1.
//		for(int i=0; i<list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		
		// 8-2.
//		for(Point p : list) {
//			System.out.println(p);
//		}
		
		// 8-3.
		Iterator<Point> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("ũ��: " + list.size());
	}

}
