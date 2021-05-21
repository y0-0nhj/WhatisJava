import java.util.Calendar;

public class CalendarTest03 {
	public static void main(String[] args) {
		Calendar c1 = Calendar.getInstance(); // ���� �ý����� ��¥
		Calendar c2 = Calendar.getInstance(); 
		//c2.set(2020, 0, 8); // 2020�� 1�� 8�� ���� - �ڷγ� ���� �߻���, ���� 1�� ���� ����
		c2.set(2020, Calendar.JANUARY, 8); // 2020�� 1�� 8�� ����
		
		// �� ���� ��¥�� ����
		long difference = c1.getTimeInMillis() - c2.getTimeInMillis(); // 1000���� 1��
		System.out.println("�� ��¥�� ���� : " + difference + " ms"); // 1000���� 1��
		System.out.println("�� ��¥�� ���� : " + difference/1000 + " ��"); 
		System.out.println("�� ��¥�� ���� : " + difference/1000/60 + "��");
		System.out.println("�� ��¥�� ���� : " + difference/1000/60/60 + " �ð�");
		System.out.println("�� ��¥�� ���� : " + difference/1000/60/60/24 + " ��");
	} 

}
