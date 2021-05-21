
// Wrapper Ŭ����
// 1. Boolean, Character, Byte, Short, Integer, Long, Float, Double 
// 8���� �⺻���� ���ؼ� Ŭ������ ������ 8���� Ŭ������ ��Ī�ؼ� Wrapper Ŭ������� �θ�.
// 2. ����1 : �⺻���� ��ü������ ���� �ڹ��� ����(����, Ŭ������ ����)���� ����ϱ� ����.
// 3. ����2 : ���ڿ��� �⺻������ �����ϱ� ����.

// �ڽ�(Boxing) : �⺻���� ��ü������ ����� �ִ� ��.
// ��ڽ�(Unboxing) : ��ü���� �⺻������ ����� �ִ� ��.
// �ڵ��ڽ�(Auto-Boxing) : �ڵ����� �⺻���� ��ü������ ����� �ִ� ��.
// �ڵ���ڽ�(Auto-Unboxing) : �ڵ����� ��ü���� �⺻������ ����� �ִ� ��.
public class WrapperTest01 {
	public static void main(String[] args) {
		System.out.println("1. -----");
		int i = 10; 				 // �⺻��
		Integer ii = new Integer(i); // ��ü��, �ڽ�(Boxing)
		
		int i2 = ii.intValue();      // �⺻��, ��ڽ�(Unboxing)
		i2 += 20;
		System.out.println(i2);
		
		System.out.println("2. -----");
		int j = 10;		// �⺻��
		Integer jj = j; // ��ü��, �ڵ��ڽ�(Auto-Boxing)
		
		int j2 = jj + 20; // �⺻��, �ڵ���ڽ�(Auto-Unboxing)
		System.out.println(j2);
		
		System.out.println("3. ----------");
		String s1 = "10";
		int a = Integer.parseInt(s1) + 20;
		System.out.println("a = " + a);
		
		String s2 = "3.14";
		double area = 5.5 * 5.5 * Double.parseDouble(s2);
		System.out.println("area = " + area);
		// end
	}

}
