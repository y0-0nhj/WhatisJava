import java.util.LinkedList;
import java.util.Queue;

// Queue(큐) : 한 방향으로 데이터가 이동하는 파이프처럼 생긴 저장 구조, offer(데이터 삽입), poll(데이터 꺼냄)
// - 선입선출 : FIFO(First In First OUT)

public class QueueTest01 {
	public static void main(String[] args) {
		//Queue<Integer> q1 = new Queue<Integer>();
		Queue<Integer> q1 = new LinkedList<Integer>();
		
		q1.offer(10); q1.offer(20); q1.offer(30);
		System.out.println(q1);
		
		
		while(!q1.isEmpty()) {
			System.out.println(q1.poll()); // 데이터를 꺼내고 난 다음 삭제
		}
		System.out.println(q1);
		
		System.out.println("----------");
		
		Queue<String> q2 = new LinkedList<String>();
		
		q2.offer("이익준"); q2.offer("김준완"); q2.offer("양석형"); q2.offer("안덩원"); q2.offer("채송화");
		System.out.println(q2);
		
		while(!q2.isEmpty()) {
			System.out.println(q2.poll());
		}
		System.out.println(q2);
	}

}
