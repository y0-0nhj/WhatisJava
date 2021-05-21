import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamTest02 {
	public static void main(String[] args) {
		//FileInputStream fis = null;
		//FileOutputStream fos = null;;
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			//fis = new FileInputStream("c:/temp/cc.zip");
			//bis = new BufferedInputStream(fis); // �⺻ ũ�� : 8Byte
			bis = new BufferedInputStream(new FileInputStream("c:/temp/cc.zip"));
			
			//fos = new FileOutputStream("c:/temp/cc_copy.zip");
			//bos = new BufferedOutputStream(fos); // �⺻ ũ�� : 8Byte
			bos = new BufferedOutputStream(new FileOutputStream("c:/temp/cc_copy.zip"));
			
			int data = 0;
			System.out.println("- ���� ���縦 �����մϴ�.");
			long start = System.currentTimeMillis();
			while((data=bis.read()) != -1) {
				bos.write(data);
			}
			long end = System.currentTimeMillis();
			System.out.println("- ���� ���縦 �Ϸ��Ͽ����ϴ�.");
			System.out.println("���� �ð� : " + (end-start)/1000.0 + "��");
			
			// ���� ��Ʈ���� ������, ��� ��Ʈ���� �ݴ´�.
			bis.close();
			bos.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
