import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;

// ����ȭ�� Ŭ���� - ��Ʈ���� ��ü�� ������ �� �ִ� Ŭ����
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
	
	// ���
	public String toString() {
		return id + "(" + pwd + ") : " + name;
	}
}

// ����ȭ�� ����� ��ü�� �о����
public class SerializationTest02 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream("c:/temp/member.dat");
			bis = new BufferedInputStream(fis);
			ois = new ObjectInputStream(bis);
			
			// ��Ʈ���� ���ؼ� ��ü�� ����, ������ ������ ������ ��ġ
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
