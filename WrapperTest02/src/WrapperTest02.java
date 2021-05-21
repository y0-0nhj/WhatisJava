import java.util.StringTokenizer;

// ����) 1. �л����� ���� ���ڿ� str�� �̿��Ͽ� �л����� ������ ����� ���Ͻÿ�.

public class WrapperTest02 {
	public static void main(String[] args) {
		String str = "85,88,72,91,56,73,66,87,68,95";
		int sum = 0;
		
		// 1�� ��� - String Ŭ������ split() �޼ҵ� Ȱ��
//		System.out.println("1. -----");
//		String[] scores = str.split(",");
//		for(String s : scores) {
//			sum += Integer.parseInt(s);
//		}
//		System.out.printf("����: %d\n���: %.2f\n", sum, (double)sum/scores.length);
				
		// 2�� ��� - StringTokenizer Ŭ���� Ȱ��
		sum = 0;
		System.out.println("2. -----");
		StringTokenizer st1 = new StringTokenizer(str, ",");
		int count = st1.countTokens(); // ��ū�� ����
		while(st1.hasMoreTokens()) {
			sum += Integer.parseInt(st1.nextToken());
		}
		System.out.printf("����: %d\n���: %.2f\n", sum, (double)sum/count);
		
		// end
	}

}
