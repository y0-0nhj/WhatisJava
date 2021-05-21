import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

// FileReader : ���� ���� �д� Ŭ����, ���ڵ� ������ �ذ��� �� ����
// FileInputStream, InputStreamReader : �ѱ� ���ڵ� ������ �ذ���.

// ���� �Է� 
// ������ : �ѱ� ���� ���� ���� -> ���ڵ��� �ٲ㼭 ������ �ذ�
public class FileInputStreamTest02 {
	public static void main(String[] args) {
		FileInputStream fis = null;   // ������ �д� Ŭ����
		InputStreamReader isr = null; // ���ڵ� ����� ��ȯ�ϱ� ���� Ŭ����
		BufferedReader br = null;     // ���� Ŭ����
		
		try {
			fis = new FileInputStream("c:/temp/test01.txt");
			isr = new InputStreamReader(fis, "utf-8");
			br = new BufferedReader(isr);
			
			int data = 0;
			while((data=br.read()) != -1) {
				System.out.print((char)data);
			}
			
			fis.close();
			isr.close();
			br.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
