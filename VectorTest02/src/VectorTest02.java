import java.util.Vector;

public class VectorTest02 {
	public static void main(String[] args) {
		System.out.println("--- ���� ���� ���� ---");
		Vector<Integer> v = new Vector<Integer>();
		int[] a = {10, 20, 30, 40, 50};
		
		System.out.println("--- ������ ���� ---");
		for(int i=0; i<a.length; i++) {
			v.add(a[i]);
		}
		System.out.println(v);
		
		System.out.println("--- ������ ����(1��) ---");
		v.remove(2); // 2�� �ε��� ����
		System.out.println(v);
		
		System.out.println("--- ������� ����(�߰�) ---");
		v.add(2, 60);
		System.out.println(v);
		
		System.out.println("--- ������ ����(����) ---");
		v.set(3, 80);
		System.out.println(v);
		
		System.out.println("--- ù��° ������ ��� ---");
		System.out.println(v.get(0));
		System.out.println(v.firstElement());
		
		System.out.println("--- ������ ������ ��� ---");
		System.out.println(v.get(v.size()-1));
		System.out.println(v.lastElement());
		
		System.out.println("--- Ư�� �ε����� �ش��ϴ� ������ ��� ---");
		System.out.println(v.get(2)); // 2�� �ε����� ������ Ȯ��
		System.out.println(v.elementAt(2));
		
		System.out.println("������ ���� : " + v.size());
		System.out.println("������ �뷮 : " + v.capacity());
		
		System.out.println("--- �����Ͱ� �ִ� �ε��� ��� ---");
		System.out.println(v.indexOf(80)); // 80 �����Ͱ� �ִ� �ε��� Ȯ��
		
		System.out.println("--- ������ �߰� ---");
		v.add(60);
		System.out.println(v);
		
		System.out.println("--- �������� �ε��� ���(�տ������� �˻�) ---");
		System.out.println(v.indexOf(60));
		
		System.out.println("--- �������� �ε��� ���(�ڿ������� �˻�) ---");
		System.out.println(v.lastIndexOf(60));
		
		System.out.println("--- �ش��ϴ� ���� ã�� ������ �� -1 ��� ---");
		System.out.println(v.indexOf(90)); // -1, �迭�� �ε����δ� ������ �� ���� ��
		
		System.out.println("--- Ư�� ��ġ���� �ش��ϴ� ���� �˻� ---");
		System.out.println(v.indexOf(60, 3)); // 3�� �ε������� 60 �����͸� �˻�
		
		System.out.println("--- ������� ������ �߰� ---");
		v.add(4, 70);
		//v.insertElementAt(70, 4);
		System.out.println(v);
		
		System.out.println("������ ũ�� : " + v.size());
		System.out.println(v);
		
		System.out.println("--- ������ ũ�� ���� ---");
		v.setSize(5);
		System.out.println("������ ũ�� : " + v.size());
		System.out.println(v);
		
		System.out.println("--- �Ѳ����� ��� ������ ������ ���� ---");
		v.clear();
		//v.removeAllElements();
		
		System.out.println("������ ũ�� : " + v.size());
		System.out.println(v);
		
		// end
	}

}
