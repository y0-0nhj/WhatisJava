import java.util.Vector;

// List �迭
// 1. ������ �ְ�, �ߺ� �����͸� ���
// 2. �������� �迭 ����
// 3. Vector, ArrayList, LinkedList, Stack, Queue ...

public class VectorTest01 {
	public static void main(String[] args) {
		// ���� ����
		// raw Ÿ�� - ������� �ʴ� ��� -> generic type���� ����� ���� ����(�Ϲ�ȭ�� Ÿ��, ��üȭ�� Ÿ��)
		// ������) ������ Ÿ���� �������� �ʾƼ� ���߿� ó���Ҷ� ū ������ �߻��� �� ����.
		Vector v1 = new Vector();
		
		// ������ ����
		v1.add("30"); // ���ڿ�
		v1.add(10);   // ����
		v1.add("����");// ���ڿ�
		v1.add(true); // boolean
		v1.add(3.14); // �Ǽ�
		
		double sum = 0.0;
		// ��� ��� 1��
		for(int i=0; i<v1.size(); i++) {
			System.out.println(v1.get(i));
			// sum += v1.get(i); // ����
		}
		System.out.println("----------");
		// ��� ��� 2��
		for(Object o : v1) {
			System.out.println(o);
		}
		
		System.out.println("**********");
		// generic type (�Ϲ�ȭ�� Ÿ��, ��üȭ�� Ÿ��)
		System.out.println("--- 1. ������ ���� ---");
		Vector<Integer> v2 = new Vector<Integer>();	
		
		System.out.println("--- 2. ������ ���� ---");
		v2.add(98);
		v2.add(75);
		v2.add(82);
		v2.add(64);
		v2.add(77);
		//v2.add("����");
		//v2.add(75.5);
		
		System.out.println("--- 3. ������ ��� ---");
		for(int i=0; i<v2.size(); i++) {
			System.out.println(v2.get(i));
		}
		
		int tot = 0;
		System.out.println("-----");
		for(int score : v2) {
			System.out.println(score);
			tot += score;
		}
		System.out.println("���� : " + tot);
		
		System.out.println("--- 4. ������ Ȯ�� ---");
		System.out.println(v2.toString());
		
	}

}
