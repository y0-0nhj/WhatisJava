import java.text.DecimalFormat;

// DecimalFormat : 숫자를 다양한 형식으로  출력하도록 해주는 클래스
public class DecimalFormatTest01 {
	public static void main(String[] args) {
		double number = 1234567.89;
		
		// # : 의미없는 숫자는 생략
		// 0 : 의미없는 숫자는 0으로 표시
		DecimalFormat df1 = new DecimalFormat("#,###.####");
		DecimalFormat df2 = new DecimalFormat("0,000.0000");
		DecimalFormat df3 = new DecimalFormat("###,###,###.####");
		DecimalFormat df4 = new DecimalFormat("000,000,000.0000");
		DecimalFormat df5 = new DecimalFormat("#.#E0"); // 지수승, 1.2E6
		DecimalFormat df6 = new DecimalFormat("0.0E0"); // 지수승, 1.2E6
		DecimalFormat df7 = new DecimalFormat("#E0");   // 지수승, .1E7
		DecimalFormat df8 = new DecimalFormat("0E0");   // 지수승, 1E6
		
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
