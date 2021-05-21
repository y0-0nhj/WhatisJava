import java.util.Iterator;
import java.util.LinkedList;

// 포인트 클래스
class Point {
	private int x;
	private int y;
	
	// 생성자
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
	
	// 포인트 객체의 값을 비교하는 메소드 
	public boolean compare(Point p) {
		return this.x == p.x && this.y == p.y;
	}
	
}

// 문제)
// 1. Point 클래스에 생성자, getter/setter, toString()메소드를 추가하여 클래스를 완성하시오.
// 2. main에 Point 객체를 담는 LinkedList인 list를 생성하시오.
// 3. 리스트에 Point 객체 10개를 저장하시오.
// (10, 10), (20, 20), (30, 30) ...... (100, 100)
// 4. 리스트에 (10, 10) 뒤에 (11, 11) 데이터를 추가하시오.
// 5. 리스트의 (40, 40) 데이터를 삭제하시오.
// 6. 리스트의 (50, 50) 데이터를 (55, 55)로 수정하시오.
// 7. 리스트의 맨 앞에 (1, 1) 데이터를 추가하시오.
// 8. 리스트의 데이터를 3가지 방법으로 출력하시오. (기본 for문, for-in문, Iterator 사용) 


public class LinkedListTest02 {
	public static void main(String[] args) {
		System.out.println("- 2. LinkedList 생성");
		LinkedList<Point> list = new LinkedList<Point>();
		
		System.out.println("- 3. 리스트의 맨뒤에 데이터 추가");
		for(int i=10; i<=100; i+=10) {
			list.add(new Point(i, i));
		}
		System.out.println(list);
		
		System.out.println("- 4. 리스트의 중간에 데이터 추가");
		//list.add(1, new Point(11, 11));
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).compare(new Point(10, 10))) {
				list.add(i+1, new Point(11, 11));
			}
		}
		System.out.println(list);
		
		System.out.println("- 5. 리스트의 데이터 삭제");
		//list.remove(4);
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).compare(new Point(40, 40))) {
				list.remove(i);
			}
		}
		System.out.println(list);
		
		System.out.println("- 6. 리스트의 데이터 수정");
		//list.set(4, new Point(55, 55));
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).compare(new Point(50, 50))) {
				list.set(i, new Point(55, 55));
			}
		}
		System.out.println(list);
		
		System.out.println("- 7. 리스트의 맨 앞에 데이터 추가");
		//list.add(0, new Point(1, 1));
		list.addFirst(new Point(1, 1));
		System.out.println(list);
		
		System.out.println("- 8. 리스트의 내용 출력");
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
		
		System.out.println("크기: " + list.size());
	}

}
