import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetTest05 {
	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<String>();
		
		// 정렬의 우선순의
		// 기호 > 영어대문자 > 영어소문자 > 한글
		set.add("abc"); set.add("alien"); set.add("bat"); set.add("car"); 
		set.add("Car"); set.add("disco"); set.add("dance"); set.add("dZZZZ"); 
		set.add("dzzzz"); set.add("elephant"); set.add("elevator"); set.add("fan"); 
		set.add("flower");  set.add("a"); set.add("d");
		set.add("바다"); set.add("하늘"); set.add("나무"); set.add("강"); set.add("다람쥐");
		set.add("라"); set.add("라면");
		set.add("*"); set.add("?");
		
		System.out.println(set);
		
		// 1. a부터 d앞까지(d 미포함)
		SortedSet<String> set2 = set.subSet("a", "d");
		System.out.println(set2);
		
		// 2. a부터 e앞까지(a부터 d까지, d 포함)
		//SortedSet<String> set3 = set.subSet("a", "e");
		SortedSet<String> set3 = set.subSet("a", "dzzzzzzzzzz");
		System.out.println(set3);
		
		// 3. a부터 d까지(d 포함)
		SortedSet<String> set4 = set.subSet("a", true, "d", false);
		System.out.println(set4);
		
		// 4. 가부터 라앞까지
		SortedSet<String> set5 = set.subSet("가", true, "라면", true);
		System.out.println(set5);
		
	}

}
