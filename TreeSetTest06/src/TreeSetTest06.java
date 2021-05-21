import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest06 {
	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> set2 = new TreeSet<Integer>();
		
		int n;
		// ����) �ζǹ�ȣ 6�� ���� (1 ~ 45) - �ߺ����� �ʰ� ����
		
		// 1. HashSet�� ���
		for(int i=0; set1.size()<6; i++) { 
			n = (int)(Math.random() * 45) + 1;
			set1.add(n);
		}
		System.out.println(set1);
	
		// 2. TreeSet�� ���
		for(int i=0; set2.size()<6; i++) {
			n = (int)(Math.random() * 45) + 1;
			set2.add(n);
		}
		System.out.println(set2);
	}

}
