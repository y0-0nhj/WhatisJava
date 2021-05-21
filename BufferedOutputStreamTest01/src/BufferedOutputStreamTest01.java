import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamTest01 {
	public static void main(String[] args) {
		// ���� ����� ��Ʈ��
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		// ���� ��Ʈ��
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			fis = new FileInputStream("c:/temp/test03.txt");
			bis = new BufferedInputStream(fis, 5);
			
			fos = new FileOutputStream("c:/temp/test03_copy.txt");
			bos = new BufferedOutputStream(fos, 5);
			
			int data = 0;
			while((data=bis.read()) != -1) {
				bos.write(data);
			}
			System.out.println("���Ϻ��簡 �������ϴ�.");
			//bos.flush();
			
			// ���� ��Ʈ���� ������, ��� ��Ʈ���� ���� �� ���� ��Ʈ���� �ݰ� �ȴ�.
			// ButteredOutputStream��  ���� �� flush ��ɵ� ȣ���ϰ� �ȴ�.
			bis.close();
			bos.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
