import java.text.DecimalFormat;

// DecimalFormat : ���ڸ� �پ��� ��������  ����ϵ��� ���ִ� Ŭ����
public class DecimalFormatTest01 {
	public static void main(String[] args) {
		double number = 1234567.89;
		
		// # : �ǹ̾��� ���ڴ� ����
		// 0 : �ǹ̾��� ���ڴ� 0���� ǥ��
		DecimalFormat df1 = new DecimalFormat("#,###.####");
		DecimalFormat df2 = new DecimalFormat("0,000.0000");
		DecimalFormat df3 = new DecimalFormat("###,###,###.####");
		DecimalFormat df4 = new DecimalFormat("000,000,000.0000");
		DecimalFormat df5 = new DecimalFormat("#.#E0"); // ������, 1.2E6
		DecimalFormat df6 = new DecimalFormat("0.0E0"); // ������, 1.2E6
		DecimalFormat df7 = new DecimalFormat("#E0");   // ������, .1E7
		DecimalFormat df8 = new DecimalFormat("0E0");   // ������, 1E6
		
		System.out.println(df1.format(number));
		System.out.println(df2.format(number));
		System.out.println(df3.format(number));
		System.out.println(df4.format(number));
		System.out.println(df5.format(number));
		System.out.println(df6.format(number));
		System.out.println(df7.format(number));
		System.out.println(df8.format(number));
	}

}
