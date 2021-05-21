import java.util.Vector;

public class VectorTest03 {
	public static void main(String[] args) {
		Vector<Integer> v1 = new Vector<Integer>();
		Vector<Integer> v2 = new Vector<Integer>();
		Vector<Integer> v3 = new Vector<Integer>();
		
		v1.add(10); v1.add(20); v1.add(30); 
		v2.add(40); v2.add(50); v2.add(60); 
		v3.add(30); v3.add(40); v3.add(50); 
		
		System.out.println("v1 : " + v1);
		System.out.println("v2 : " + v2);
		System.out.println("v3 : " + v3);
		
		System.out.println("--- ���Ϳ� �ٸ� ������ ���� �߰� ---");
		v1.addAll(v2); // ������ �߰�
		//v1.addAll(1, v2); // ������� �߰�(�߰�)
		System.out.println("v1 : " + v1);
		
		System.out.println("--- ���Ϳ��� �������� ���� ���� Ȯ�� ---");
		System.out.println(v1.indexOf(50));  // 4, 50 �������� �ε���
		System.out.println(v1.contains(50)); // true
		System.out.println(v1.indexOf(80));  // -1, 80 �����ʹ� ����
		System.out.println(v1.contains(80)); // false
		
		System.out.println("--- ���Ϳ��� �ٸ� ������ �������� ���� ���� Ȯ�� ---");
		System.out.println(v1.containsAll(v2)); // true
		System.out.println(v3.containsAll(v2)); // false
		
		System.out.println("--- ���� ���� ---");
		@SuppressWarnings("unchecked")
		Vector<Integer> v4 = (Vector<Integer>)v1.clone();
		System.out.println("v4 : " + v4);
		
		System.out.println("--- ���� ���� ---");
		Vector<Integer> v5 = new Vector<Integer>();
		v5.addAll(v1);
		System.out.println("v5 : " + v4);
	}

}
