import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// �����б�
public class FileInputStreamTest01 {
	public static void main(String[] args) {
		FileInputStream fis = null; // ���̳ʸ� �Է� ��Ʈ��
		FileReader fr = null;		// ���� �Է� ��Ʈ��
		
		try {
			// ���̳ʸ� �Է�
			fis = new FileInputStream("c:/temp/test01.txt");
			
			int data = 0;
			System.out.println("--- ����Ʈ �Է� ---");
			while((data=fis.read()) != -1) { // -1 : EOF(End Of File)
				System.out.print((char)data);
			}
			System.out.println();
			
			// ���� �Է� 
			// ������ : �ѱ� ���� ���� ���� -> ���ڵ��� �ٲ㼭 ������ �ذ�
			System.out.println("--- ���� �Է� ---");
			fr = new FileReader("c:/temp/test01.txt");
			
			while((data=fr.read()) != -1) {
				System.out.print((char)data);
			}
			System.out.println();
			
			// ��Ʈ�� �ݱ�
			fis.close();
			fr.close();			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
