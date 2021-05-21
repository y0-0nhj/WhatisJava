import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// ���� ����� ��Ʈ��
public class FileWriterTest01 {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader("c:/temp/test02.txt");
			fw = new FileWriter("c:/temp/test02_copy.txt");
			
			int data = 0;
			while((data=fr.read()) != -1) {
				fw.write(data);
			}
			System.out.println("������ ������ �о �ٸ� ���Ͽ� ����ϴ�...");
			fr.close();
			fw.close();
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
