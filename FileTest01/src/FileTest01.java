import java.io.File;

public class FileTest01 {
	public static void main(String[] args) {
		File file = new File("c:/temp/image.jpg");
		
		String fileName = file.getName();
		int pos = fileName.lastIndexOf(".");
		
		System.out.println("��θ� ������ ���� �̸� : " + fileName);
		//System.out.println(pos);
		System.out.println("Ȯ���ڸ� ������ ���� �̸� : " + fileName.substring(0, 5));
		System.out.println("������ ����(Ȯ����) : " + fileName.substring(5+1));
		
		System.out.println("��ü ��θ� ������ ���� �̸� : " + file.getPath());
		System.out.println("������ �ִ� ���丮(����) �̸� : " + file.getParent());
	}

}
