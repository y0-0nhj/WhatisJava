import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
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

// 직렬화(Selialization) : 객체(인스턴스)를 스트림을 통해서 저장하는 것.
// 역직렬화(Deserialization) : 저장된 객체를 스트림을 통해 읽어오는 것.

// 객체를 파일스트림을 통해 저장
public class SerializationTest01 {
	public static void main(String[] args) {
		Member m1 = new Member("aaa1111", "1111", "이익준");
		Member m2 = new Member("aaa2222", "2222", "김준완");
		Member m3 = new Member("aaa3333", "3333", "채송화");
		
		ArrayList<Member> list = new ArrayList<Member>();
		list.add(m1); list.add(m2); list.add(m2);
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream("c:/temp/member.dat");
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);
			
			// 스트림을 통해 객체를 저장
			oos.writeObject(m1);
			oos.writeObject(m2);
			oos.writeObject(m3);
			
			// 객체를 스트림을 통해서 저장할 때는 리스트에 담아 저장하면 읽을 때도 순서를 신경쓸 필요가 없어짐.
			oos.writeObject(list);
			
			oos.close();
			System.out.println("직렬화를 통해 객체가 잘 저장되었습니다.");
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
