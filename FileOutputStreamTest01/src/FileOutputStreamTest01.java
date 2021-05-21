import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// ����Ʈ ����� ��Ʈ��
public class FileOutputStreamTest01 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("c:/temp/bb.zip");
			fos = new FileOutputStream("c:/temp/bb_copy.zip");
			
			int data = 0;
			System.out.println("���� �ð� ������ �����մϴ�.");
			System.out.println("--------------------");
			long start = System.currentTimeMillis();
			while((data=fis.read()) != -1) {
				fos.write(data);
			}
			long end = System.currentTimeMillis();
			System.out.println("--------------------");
			System.out.println("���� �ð� ������ �������ϴ�.");
			System.out.println("���� �ð� : " + (end - start)/1000.0 + "��");
			fis.close();
			fos.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
