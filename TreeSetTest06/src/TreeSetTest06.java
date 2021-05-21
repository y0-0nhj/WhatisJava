import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest06 {
	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> set2 = new TreeSet<Integer>();
		
		int n;
		// 문제) 로또번호 6개 생성 (1 ~ 45) - 중복되지 않고 생성
		
		// 1. HashSet을 사용
		for(int i=0; set1.size()<6; i++) { 
			n = (int)(Math.random() * 45) + 1;
			set1.add(n);
		}
		System.out.println(set1);
	
		// 2. TreeSet을 사용
		for(int i=0; set2.size()<6; i++) {
			n = (int)(Math.random() * 45) + 1;
			set2.add(n);
		}
		System.out.println(set2);
	}

}
