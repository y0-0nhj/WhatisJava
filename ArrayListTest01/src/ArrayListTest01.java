import java.util.ArrayList;

// ArrayList
// 1. Vector�� ��ɰ� ������ ����
// 2. Vector�� �������� ����ȭ ����� �־� ������ ���ϰ� �߻�
// -> ArrayList�� Vector�� ������ ����ȭ ����� �����Ͽ� ������ ������.
// 3. Vector�� capacity() �޼ҵ尡 ����.

// ����)
// 1. ������ ��� ArrayList�� list�� �����Ͻÿ�.
// 2. �����迭 score�� ������ list�� �߰��Ͻÿ�.
// ex) score�� �� : 95, 88, 75, 63, 52, 77, 47, 48, 93, 91
// 3. ����Ʈ���� 60�� �̸��� ������ �����Ͻÿ�.
// 4. list�� ������ ����� ���Ͻÿ�.
// 5. list���� �ְ������� ���������� ���Ͻÿ�.
// 6. list�� ������ 2���� ������� ����Ͻÿ�. (�⺻ for��, for-in��) 

public class ArrayListTest01 {
	public static void main(String[] args) {
		System.out.println("- 1. ������ �����ϴ� ArrayList ���� -");
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		System.out.println("- 2. ����Ʈ�� �迭�� ������ �߰� -");
		int[] score = {95, 88, 75, 63, 52, 77, 47, 48, 93, 91};
		
		for(int i=0; i<score.length; i++) {
			list.add(score[i]);
		}
		System.out.println(list);
		
		System.out.println("-3. 60�� �̸��� ������ ���� -");
		// ������) �������� ���� ū ������ ����, 60������ ���� ������ �����ϸ� ���� �����Ͱ� ������ ������鼭 1���� �������� �˻縦 �ǳʶٰ� ��.
//		for(int i=0; i<list.size(); i++) {
//			if(list.get(i) < 60) {
//				list.remove(i);
//			}
//		}
		
		// �ذ�å) �ڿ��� �˻��ϸ� ��, �����Ǵ� ������ ����.
		for(int i=list.size()-1; i>=0; i--) {
			if(list.get(i) < 60) {
				list.remove(i);
			}
		}		
		System.out.println(list);
		
		System.out.println("- 4. ����Ʈ�� ������ ��� ��� -");
		int sum = 0;
		for(int i=0; i<list.size(); i++) {
			sum += list.get(i);
		}
		System.out.printf("����: %d\n���: %.2f\n", sum, (double)sum/list.size());
		
		
		System.out.println("- 5. ����Ʈ�� �ְ������� �������� ���ϱ� -");
		int max = list.get(0);
		int min = list.get(0);
		
		for(int i=1; i<list.size(); i++) {
			if(list.get(i) > max) {
				max = list.get(i);
			}
			if(list.get(i) < min) {
				min = list.get(i);
			}
		}
		System.out.println("�ְ�����: " + max);
		System.out.println("��������: " + min);
		
		System.out.println("- 6-1. ���(�⺻ for��) -");
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) + ", ");
		}
		System.out.println();
		
		System.out.println("- 6-2. for-in�� -");
		for(int i : list) {
			System.out.print(i + ", ");
		}
		System.out.println();
		
		
		// end
	}

}
