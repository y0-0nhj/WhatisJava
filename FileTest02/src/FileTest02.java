import java.io.File;

public class FileTest02 {
	public static void main(String[] args) {
		File f1 = new File("c:/temp/image.jpg"); // ����
		File f2 = new File("c:/temp/sample");    // ���丮 -> �������� ����
		File f3 = new File("c:/temp");           // ���丮 -> ������
		
		String result = null;
		if(f1.isFile()) {
			result = "����";
		} else {
			result = "���丮";
		}
		System.out.println(f1.getName() + "��(��) " + result + "�Դϴ�.");
		
		if(f3.isDirectory()) {
			result = "���丮";
		} else {
			result = "����";
		}
		System.out.println(f3.getName() + "��(��) " + result + "�Դϴ�.");
		
		// f2�� �������� �����ϱ� ���� �� Ȯ��
		// exists() : �����ϸ� true, �������� ������ false
		if(!f2.exists()) { // �������� ������ �����ϵ��� ��.
			f2.mkdir();
			System.out.println(f2.getName() + " ���丮�� �����Ͽ����ϴ�.");
		} else {
			System.out.println(f2.getName() + " ���丮�� �̹� �ֽ��ϴ�.");
		}
		
		// ���� ����
		File f4 =  new File("c:/temp/test01.txt");
		if(f4.delete()) {
			System.out.println(f4.getName() + " ���� ������ �����Ͽ����ϴ�.");
		} else {
			System.out.println(f4.getName() + " ���� ������ �����Ͽ����ϴ�.");
		}
		
		// ���� �̸� ����
		File f5 = new File("c:/temp/test02.txt");  // ���� �̸�
		File f6 = new File("c:/temp/hello02.txt"); // �ٲ� �̸�
		if(f5.renameTo(f6)) {
			System.out.println("���� �̸� ���濡 �����Ͽ����ϴ�.");
		} else {
			System.out.println("���� �̸� ���濡 �����Ͽ����ϴ�.");
		}
		
		// ���丮�� ��� Ȯ��, ũ��, �����ð�
		System.out.println("--------------------");
		String[] fileList = f3.list();
		for(String s : fileList) {
			File f = new File(f3, s);
			long t = f.lastModified();
			System.out.print(s + "\t");
			System.out.print("ũ��: " + f.length() + "\t");
			System.out.printf("�����ð�: %tb %td�� %ta���� %tT\n", t, t, t, t);
		}
		
	}

}
