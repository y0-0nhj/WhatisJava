import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamTest03 {
	public static void main(String[] args) {
		// try-with-resource -- 1.7 부터 추가된 기능
		// - try() 안에서 예외처리 실행하게됨. FileNotFoundException에 대한 예외도 생략함.
		// - 자동으로 스트림을 닫으므로 close()를 생략함.
		try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream("c:/temp/bb.zip"));
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("c:/temp/bb_copy.zip"));) {
			
			int data = 0;
			System.out.println("- 파일 복사를 시작합니다.");
			long start = System.currentTimeMillis();
			while((data=bis.read()) != -1) {
				bos.write(data);
			}
			long end = System.currentTimeMillis();
			System.out.println("- 파일 복사를 완료하였습니다.");
			System.out.println("복사 시간 : " + (end-start)/1000.0 + "초");
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
