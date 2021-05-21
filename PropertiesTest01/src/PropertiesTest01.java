import java.util.Enumeration;
import java.util.Properties;

// Properties 
// 1. ���������� Hashtable ������ ���� ����. Map �迭
// 2. Ű�� ���� String���θ� ����ϵ��� ����, String ���� Map
// 3. <> ������� ����
// 4. ���ڿ��� Ű�� ���� �����ͷ� ������ �� ���� ���.

public class PropertiesTest01 {
	public static void main(String[] args) {
		// Properties ����
		Properties pro = new Properties();
		
		// ������ �߰�
		pro.setProperty("������", "������ܰ�");
		pro.setProperty("���ؿ�", "��οܰ�");
		pro.setProperty("ä��ȭ", "�Ű�ܰ�");
		pro.setProperty("�缮��", "����ΰ�");
		pro.setProperty("������", "�Ҿƿܰ�");
		
		// ������ Ȯ�� 1
		System.out.println(pro);
		System.out.println("----------");
		
		// ������ Ȯ�� 2
		pro.list(System.out);
		System.out.println("----------");
		
		// ���
		Enumeration e = pro.propertyNames();
		while(e.hasMoreElements()) {
			String name = (String)e.nextElement();   // Ű: �̸�
			String major = pro.getProperty(name);    // ��: ����
			System.out.println("�̸�: " + name + ", ����: " + major);
		}
		
		
	}

}
