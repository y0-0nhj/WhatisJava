import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// 파일읽기
public class FileInputStreamTest01 {
	public static void main(String[] args) {
		FileInputStream fis = null; // 바이너리 입력 스트림
		FileReader fr = null;		// 문자 입력 스트림
		
		try {
			// 바이너리 입력
			fis = new FileInputStream("c:/temp/test01.txt");
			
			int data = 0;
			System.out.println("--- 바이트 입력 ---");
			while((data=fis.read()) != -1) { // -1 : EOF(End Of File)
				System.out.print((char)data);
			}
			System.out.println();
			
			// 문자 입력 
			// 문제점 : 한글 깨짐 현상 발현 -> 인코딩을 바꿔서 문제를 해결
			System.out.println("--- 문자 입력 ---");
			fr = new FileReader("c:/temp/test01.txt");
			
			while((data=fr.read()) != -1) {
				System.out.print((char)data);
			}
			System.out.println();
			
			// 스트림 닫기
			fis.close();
			fr.close();			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
