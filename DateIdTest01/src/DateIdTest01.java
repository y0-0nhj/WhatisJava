import java.util.Calendar;

class DateId {
	private static long count = 0;
	private long id;
	
	// Ŭ���� �ʱ���, ���� �ʱ���
	// - ���ʷ� ������ ȣ��Ǳ� ������ �� �ѹ��� ȣ��Ǿ� ���, ��ü Ŭ�������� �ʱ�ȭ�ϴ� ������ ���� ����
	static  {
		Calendar c = Calendar.getInstance();
		long year = c.get(Calendar.YEAR);
		long month = c.get(Calendar.MONTH) + 1; // 0~11
		long date = c.get(Calendar.DATE);
		
		count = year*10000000 + month*100000 + date*1000;
		//System.out.printf("%4d�� %2d�� %2d��\n", year, month, date);
	}
	
	// ������
	public DateId() {
		id = ++count;
	}
	
	// getter
	public long getId() {
		return id;
	}
}

public class DateIdTest01 {
	public static void main(String[] args) {
		DateId a = new DateId();
		DateId b = new DateId();
		DateId c = new DateId();
		
		System.out.println("a�� id = " + a.getId());
		System.out.println("b�� id = " + b.getId());
		System.out.println("c�� id = " + c.getId());
	}

}
