import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// 문자 입출력 스트림
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
			System.out.println("파일의 내용을 읽어서 다른 파일에 썼습니다...");
			fr.close();
			fw.close();
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
