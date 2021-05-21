import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetTest05 {
	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<String>();
		
		// ������ �켱����
		// ��ȣ > ����빮�� > ����ҹ��� > �ѱ�
		set.add("abc"); set.add("alien"); set.add("bat"); set.add("car"); 
		set.add("Car"); set.add("disco"); set.add("dance"); set.add("dZZZZ"); 
		set.add("dzzzz"); set.add("elephant"); set.add("elevator"); set.add("fan"); 
		set.add("flower");  set.add("a"); set.add("d");
		set.add("�ٴ�"); set.add("�ϴ�"); set.add("����"); set.add("��"); set.add("�ٶ���");
		set.add("��"); set.add("���");
		set.add("*"); set.add("?");
		
		System.out.println(set);
		
		// 1. a���� d�ձ���(d ������)
		SortedSet<String> set2 = set.subSet("a", "d");
		System.out.println(set2);
		
		// 2. a���� e�ձ���(a���� d����, d ����)
		//SortedSet<String> set3 = set.subSet("a", "e");
		SortedSet<String> set3 = set.subSet("a", "dzzzzzzzzzz");
		System.out.println(set3);
		
		// 3. a���� d����(d ����)
		SortedSet<String> set4 = set.subSet("a", true, "d", false);
		System.out.println(set4);
		
		// 4. ������ ��ձ���
		SortedSet<String> set5 = set.subSet("��", true, "���", true);
		System.out.println(set5);
		
	}

}
