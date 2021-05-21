import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;

// 직렬화된 클래스 - 스트림을 객체를 저장할 수 있는 클래스
class Member implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String pwd;
	private String name;
	
	public Member(String id, String pwd, String name) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
	}
	
	// 출력
	public String toString() {
		return id + "(" + pwd + ") : " + name;
	}
}

// 직렬화된 저장된 객체를 읽어오기
public class SerializationTest02 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream("c:/temp/member.dat");
			bis = new BufferedInputStream(fis);
			ois = new ObjectInputStream(bis);
			
			// 스트림을 통해서 객체를 읽음, 순서가 저장한 순서와 일치
			Member m1 = (Member)ois.readObject();
			Member m2 = (Member)ois.readObject();
			Member m3 = (Member)ois.readObject();
			
			@SuppressWarnings("unchecked")
			ArrayList<Member> list = (ArrayList<Member>)ois.readObject();
			
			ois.close();
			
			System.out.println(m1);
			System.out.println(m2);
			System.out.println(m3);
			System.out.println();
			System.out.println(list);
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
