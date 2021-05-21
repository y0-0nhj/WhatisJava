import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// 바이트 입출력 스트림
public class FileOutputStreamTest01 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("c:/temp/bb.zip");
			fos = new FileOutputStream("c:/temp/bb_copy.zip");
			
			int data = 0;
			System.out.println("복사 시간 측정을 시작합니다.");
			System.out.println("--------------------");
			long start = System.currentTimeMillis();
			while((data=fis.read()) != -1) {
				fos.write(data);
			}
			long end = System.currentTimeMillis();
			System.out.println("--------------------");
			System.out.println("복사 시간 측정이 끝났습니다.");
			System.out.println("복사 시간 : " + (end - start)/1000.0 + "초");
			fis.close();
			fos.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
