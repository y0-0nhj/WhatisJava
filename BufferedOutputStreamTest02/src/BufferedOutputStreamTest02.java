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
			//bis = new BufferedInputStream(fis); // 기본 크기 : 8Byte
			bis = new BufferedInputStream(new FileInputStream("c:/temp/cc.zip"));
			
			//fos = new FileOutputStream("c:/temp/cc_copy.zip");
			//bos = new BufferedOutputStream(fos); // 기본 크기 : 8Byte
			bos = new BufferedOutputStream(new FileOutputStream("c:/temp/cc_copy.zip"));
			
			int data = 0;
			System.out.println("- 파일 복사를 시작합니다.");
			long start = System.currentTimeMillis();
			while((data=bis.read()) != -1) {
				bos.write(data);
			}
			long end = System.currentTimeMillis();
			System.out.println("- 파일 복사를 완료하였습니다.");
			System.out.println("복사 시간 : " + (end-start)/1000.0 + "초");
			
			// 보조 스트림을 닫으면, 기반 스트림도 닫는다.
			bis.close();
			bos.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
