import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamTest03 {
	public static void main(String[] args) {
		// try-with-resource -- 1.7 ���� �߰��� ���
		// - try() �ȿ��� ����ó�� �����ϰԵ�. FileNotFoundException�� ���� ���ܵ� ������.
		// - �ڵ����� ��Ʈ���� �����Ƿ� close()�� ������.
		try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream("c:/temp/bb.zip"));
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("c:/temp/bb_copy.zip"));) {
			
			int data = 0;
			System.out.println("- ���� ���縦 �����մϴ�.");
			long start = System.currentTimeMillis();
			while((data=bis.read()) != -1) {
				bos.write(data);
			}
			long end = System.currentTimeMillis();
			System.out.println("- ���� ���縦 �Ϸ��Ͽ����ϴ�.");
			System.out.println("���� �ð� : " + (end-start)/1000.0 + "��");
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
