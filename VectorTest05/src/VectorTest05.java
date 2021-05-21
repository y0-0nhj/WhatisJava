import java.util.Vector;

public class VectorTest05 {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		System.out.println("�뷮: " + v.capacity()); // 10, �ʱ� �뷮
		System.out.println("ũ��: " + v.size()); 		// 0, ũ��
		
		System.out.println("--- 1. 5�� ������ �߰� ��");
		v.add(10); v.add(20); v.add(30); v.add(40); v.add(50); 
		System.out.println("�뷮: " + v.capacity()); // 10
		System.out.println("ũ��: " + v.size());		// 5
		
		System.out.println("--- 2. 10�� ������ �߰� ��");
		v.add(10); v.add(20); v.add(30); v.add(40); v.add(50); 
		System.out.println("�뷮: " + v.capacity()); 	// 10	
		System.out.println("ũ��: " + v.size());		// 10
		
		System.out.println("--- 3. 15�� ������ �߰� ��");
		v.add(10); v.add(20); v.add(30); v.add(40); v.add(50); 
		System.out.println("�뷮: " + v.capacity()); // 20, �뷮�� 10���� ������ �ڵ����� 10���� �߰�
		System.out.println("ũ��: " + v.size());		// 15
		
		System.out.println("--- �뷮�� ũ��� ���� ���� ---");
		v.trimToSize();
		System.out.println("�뷮: " + v.capacity()); 	// 15	
		System.out.println("ũ��: " + v.size());		// 15
		
		
	}

}
