import java.io.File;

public class FileTest02 {
	public static void main(String[] args) {
		File f1 = new File("c:/temp/image.jpg"); // 파일
		File f2 = new File("c:/temp/sample");    // 디렉토리 -> 존재하지 않음
		File f3 = new File("c:/temp");           // 디렉토리 -> 존재함
		
		String result = null;
		if(f1.isFile()) {
			result = "파일";
		} else {
			result = "디렉토리";
		}
		System.out.println(f1.getName() + "은(는) " + result + "입니다.");
		
		if(f3.isDirectory()) {
			result = "디렉토리";
		} else {
			result = "파일";
		}
		System.out.println(f3.getName() + "은(는) " + result + "입니다.");
		
		// f2은 존재하지 않으니까 생성 후 확인
		// exists() : 존재하면 true, 존재하지 않으면 false
		if(!f2.exists()) { // 존재하지 않으면 생성하도록 함.
			f2.mkdir();
			System.out.println(f2.getName() + " 디렉토리를 생성하였습니다.");
		} else {
			System.out.println(f2.getName() + " 디렉토리는 이미 있습니다.");
		}
		
		// 파일 삭제
		File f4 =  new File("c:/temp/test01.txt");
		if(f4.delete()) {
			System.out.println(f4.getName() + " 파일 삭제에 성공하였습니다.");
		} else {
			System.out.println(f4.getName() + " 파일 삭제에 실패하였습니다.");
		}
		
		// 파일 이름 변경
		File f5 = new File("c:/temp/test02.txt");  // 이전 이름
		File f6 = new File("c:/temp/hello02.txt"); // 바뀐 이름
		if(f5.renameTo(f6)) {
			System.out.println("파일 이름 변경에 성공하였습니다.");
		} else {
			System.out.println("파일 이름 변경에 실패하였습니다.");
		}
		
		// 디렉토리의 목록 확인, 크기, 수정시간
		System.out.println("--------------------");
		String[] fileList = f3.list();
		for(String s : fileList) {
			File f = new File(f3, s);
			long t = f.lastModified();
			System.out.print(s + "\t");
			System.out.print("크기: " + f.length() + "\t");
			System.out.printf("수정시간: %tb %td일 %ta요일 %tT\n", t, t, t, t);
		}
		
	}

}
