import java.io.File;

public class FileTest01 {
	public static void main(String[] args) {
		File file = new File("c:/temp/image.jpg");
		
		String fileName = file.getName();
		int pos = fileName.lastIndexOf(".");
		
		System.out.println("경로를 제외한 파일 이름 : " + fileName);
		//System.out.println(pos);
		System.out.println("확장자를 제외한 파일 이름 : " + fileName.substring(0, 5));
		System.out.println("파일의 종류(확장자) : " + fileName.substring(5+1));
		
		System.out.println("전체 경로를 포함한 파일 이름 : " + file.getPath());
		System.out.println("파일이 있는 디렉토리(폴더) 이름 : " + file.getParent());
	}

}
