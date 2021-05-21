import java.util.Vector;

// ����)
// 1. ���ڿ��� ��� ���� v�� �����Ͻÿ�.
// 2. ���� v�� 5���� ���ڿ��� �߰��Ͻÿ�. ex) �迬��, ����ȣ, �̽¿�, �迬��, ������
// 3. ���� v���� �̽¿� ������ ������� �߰��Ͻÿ�.
// 4. ���� v���� ����ȣ�� �����Ͻÿ�.
// 5. ���� v���� �迬���� �̴ٿ����� �����Ͻÿ�.
// 6. ���� v�� ������ 2���� ������� ����Ͻÿ�. (�⺻ for��, for-in��)

public class VectorTest06 {
	public static void main(String[] args) {
		System.out.println("- 1. ���ڿ� ���� ���� -");
		Vector<String> v = new Vector<String>();
		
		System.out.println("- 2. ���Ϳ� ���ڿ� ������ �߰� -");
		String[] name = {"�迬��", "����ȣ", "�̽¿�", "�迬��", "������"};
		
		for(int i=0; i<name.length; i++) {
			v.add(name[i]);
		}
		System.out.println(v);
		
		int idx;
		System.out.println("- 3. �̽¿� ������ ����� �߰� -");
		//v.add(3, "�����");
		idx = v.indexOf("�̽¿�"); // 2
		v.add(idx+1, "�����");
		System.out.println(v);
		
		System.out.println("- 4. ����ȣ ���� -");
		//v.remove(1);    // �ε����� ���� ����
		//v.remove("����ȣ"); // ���ڿ��� ���� ���� ���� ���� ����
		idx = v.indexOf("����ȣ"); // 1
		v.remove(idx);
		System.out.println(v);
		
		System.out.println("- 5. �迬���� �̴ٿ����� ���� -");
		//v.set(3, "�̴ٿ�");
		idx = v.indexOf("�迬��"); // 3
		v.set(idx, "�̴ٿ�");
		System.out.println(v);
		
		System.out.println("- 6-1. ��� (�⺻ for��) -");
		for(int i=0; i<v.size(); i++) {
			System.out.print(v.get(i) + ", ");
		}
		System.out.println();
		
		System.out.println("- 6-2. ��� (for-in��) -");
		for(String s : v) {
			System.out.print(s + ", ");
		}
		System.out.println();
				
		// end
	}

}