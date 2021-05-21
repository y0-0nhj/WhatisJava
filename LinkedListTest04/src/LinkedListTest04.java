import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest04 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		System.out.println("- 1. 데이터 추가 -");
		System.out.println("ArrayList  추가 시간 : " + add(al) + "ms");
		System.out.println("LinkedList 추가 시간 : " + add(ll) + "ms");
		
		System.out.println("- 2. 데이터 접근 시간 -");
		System.out.println("ArrayList  접근 시간 : " + access(al) + "ms");
		System.out.println("LinkedList 접근 시간 : " + access(ll) + "ms");
		
	}

	// 데이터 추가 메소드
	public static long add(List<Integer> list) {
		long start = System.currentTimeMillis();
		for(int i=0; i<100000; i++) {
			list.add(i);
		}
		long end = System.currentTimeMillis();
		return end - start;
	}
	
	// 데이터 접근 시간
	public static long access(List<Integer> list) {
		long start = System.currentTimeMillis();
		for(int i=0; i<list.size(); i++) {
			list.get(i); // 읽기
		}
		long end = System.currentTimeMillis();
		return end - start;
	}
	
}
