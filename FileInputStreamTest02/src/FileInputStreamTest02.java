import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

// FileReader : 문자 파일 읽는 클래스, 인코딩 문제를 해결할 수 없음
// FileInputStream, InputStreamReader : 한글 인코딩 문제를 해결함.

// 문자 입력 
// 문제점 : 한글 깨짐 현상 발현 -> 인코딩을 바꿔서 문제를 해결
public class FileInputStreamTest02 {
	public static void main(String[] args) {
		FileInputStream fis = null;   // 파일을 읽는 클래스
		InputStreamReader isr = null; // 인코딩 방식을 변환하기 위한 클래스
		BufferedReader br = null;     // 버퍼 클래스
		
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
