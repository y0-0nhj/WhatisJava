
public class ForIn01 {
	public static void main(String[] args) {
		int[] a = {85, 87, 65, 92, 76};
		
		// ����ϴ� ���
		// 1�� - �⺻ for��
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		// 2�� - for-in��, for-each��, enhanced for��, ���� for��, Ȯ�� for��
		// 1. ������ ó������ ������  ����.
		// 2. �ε����� ����ϴ� ���� �ƴ�.
		for(int i : a) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

}
