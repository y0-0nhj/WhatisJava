import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamTest01 {
	public static void main(String[] args) {
		// 파일 입출력 스트림
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		// 보조 스트림
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
			System.out.println("파일복사가 끝났습니다.");
			//bos.flush();
			
			// 보조 스트림을 닫으면, 기반 스트림을 닫으 후 보조 스트림을 닫게 된다.
			// ButteredOutputStream은  닫을 때 flush 기능도 호출하게 된다.
			bis.close();
			bos.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
