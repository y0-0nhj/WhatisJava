import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// ArrayList와  LinkedList의 속도 비교
// 1. ArrayList  : 접근속도(읽기) 빠름, 순차적인 추가, 삭제는 빠름, 비순차적인(중간) 추가, 삭제는 느림.
// 2. LinkedList : 접근속도(읽기) 느림, 순차적인 추가, 삭제는 느림, 비순차적인(중간) 추가, 삭제는 빠름.

public class LinkedListTest03 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		System.out.println("- 1. 순차적인 데이터 추가  -");
		System.out.println("ArrayList 의 시간 : " + add1(al) + "ms");
		System.out.println("LinkedList의 시간 : " + add1(ll) + "ms");
		
		System.out.println("- 2. 중간에서 데이터 추가  -");
		System.out.println("ArrayList 의 시간 : " + add2(al) + "ms");
		System.out.println("LinkedList의 시간 : " + add2(ll) + "ms");
		
		System.out.println("- 3. 중간에서 데이터 삭제  -");
		System.out.println("ArrayList 의 시간 : " + remove1(al) + "ms");
		System.out.println("LinkedList의 시간 : " + remove1(ll) + "ms");
		
		System.out.println("- 4. 순차적인 데이터 삭제  -");
		System.out.println("ArrayList 의 시간 : " + remove2(al) + "ms");
		System.out.println("LinkedList의 시간 : " + remove2(ll) + "ms");
	}
	
	// 1. 순차적인 추가 메소드
	public static long add1(List<Integer> list) {
		long start = System.currentTimeMillis(); // 1000분의 1초
		for(int i=0; i<10000000; i++) {
			list.add(i);
		}
		long end = System.currentTimeMillis();
		return end - start;
	}

	// 2. 중간에서 추가 메소드
	public static long add2(List<Integer> list) {
		long start = System.currentTimeMillis(); // 1000분의 1초
		for(int i=0; i<1000; i++) {
			list.add(500, i);
		}
		long end = System.currentTimeMillis();
		return end - start;
	}
	
	// 3. 중간에서 삭제 메소드
	public static long remove1(List<Integer> list) {
		long start = System.currentTimeMillis(); // 1000분의 1초
		for(int i=0; i<1000; i++) {
			list.remove(i);
		}
		long end = System.currentTimeMillis();
		return end - start;
	}
	
	// 4. 순차적인 삭제 메소드
	public static long remove2(List<Integer> list) {
		//long start = System.nanoTime(); // 10 마이너스 9승
		long start = System.currentTimeMillis(); // 1000분의 1초, 10의 마이너스 3승
		for(int i=list.size()-1; i>=0; i--) {
			list.remove(i);
		}
		long end = System.currentTimeMillis();
		//long end = System.nanoTime();
		return end - start;
	}
	
	// 
}
