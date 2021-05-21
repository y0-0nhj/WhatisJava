import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
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

// ����ȭ(Selialization) : ��ü(�ν��Ͻ�)�� ��Ʈ���� ���ؼ� �����ϴ� ��.
// ������ȭ(Deserialization) : ����� ��ü�� ��Ʈ���� ���� �о���� ��.

// ��ü�� ���Ͻ�Ʈ���� ���� ����
public class SerializationTest01 {
	public static void main(String[] args) {
		Member m1 = new Member("aaa1111", "1111", "������");
		Member m2 = new Member("aaa2222", "2222", "���ؿ�");
		Member m3 = new Member("aaa3333", "3333", "ä��ȭ");
		
		ArrayList<Member> list = new ArrayList<Member>();
		list.add(m1); list.add(m2); list.add(m2);
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream("c:/temp/member.dat");
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);
			
			// ��Ʈ���� ���� ��ü�� ����
			oos.writeObject(m1);
			oos.writeObject(m2);
			oos.writeObject(m3);
			
			// ��ü�� ��Ʈ���� ���ؼ� ������ ���� ����Ʈ�� ��� �����ϸ� ���� ���� ������ �Ű澵 �ʿ䰡 ������.
			oos.writeObject(list);
			
			oos.close();
			System.out.println("����ȭ�� ���� ��ü�� �� ����Ǿ����ϴ�.");
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
