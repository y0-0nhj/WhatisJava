import java.text.SimpleDateFormat;
import java.util.Date;

// SimpleDateFormat : ��¥�� �پ��� �������� ����ϵ��� ���ִ� Ŭ����
public class SimpleDateFormatTest01 {
	public static void main(String[] args) {
		Date d = new Date(); // �ý������κ��� ���� ��¥
		
		// yyyy:�⵵4�ڸ�, yy:�⵵ 2�ڸ�, MM:��2�ڸ�, M:��1�ڸ�, dd:��2�ڸ�, d:��1�ڸ� 
		// hh:12�ð�, HH:24�ð�, mm:��2�ڸ�, ss��2�ڸ�, SSS:1000���� 1�� 
		// a: ���� �Ǵ� ����, E:����
		SimpleDateFormat sdf1 = new SimpleDateFormat("yy�� M�� dd��");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss"); // 24�ð����� ǥ��
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy/MM/dd a hh:mm:ss.SSS E"); // 24�ð����� ǥ��
		
		System.out.println(sdf1.format(d));
		System.out.println(sdf2.format(d));
		System.out.println(sdf3.format(d));
		System.out.println(sdf4.format(d));

	}

}
