import java.util.LinkedList;
import java.util.Queue;

// Queue(ť) : �� �������� �����Ͱ� �̵��ϴ� ������ó�� ���� ���� ����, offer(������ ����), poll(������ ����)
// - ���Լ��� : FIFO(First In First OUT)

public class QueueTest01 {
	public static void main(String[] args) {
		//Queue<Integer> q1 = new Queue<Integer>();
		Queue<Integer> q1 = new LinkedList<Integer>();
		
		q1.offer(10); q1.offer(20); q1.offer(30);
		System.out.println(q1);
		
		
		while(!q1.isEmpty()) {
			System.out.println(q1.poll()); // �����͸� ������ �� ���� ����
		}
		System.out.println(q1);
		
		System.out.println("----------");
		
		Queue<String> q2 = new LinkedList<String>();
		
		q2.offer("������"); q2.offer("���ؿ�"); q2.offer("�缮��"); q2.offer("�ȵ���"); q2.offer("ä��ȭ");
		System.out.println(q2);
		
		while(!q2.isEmpty()) {
			System.out.println(q2.poll());
		}
		System.out.println(q2);
	}

}
