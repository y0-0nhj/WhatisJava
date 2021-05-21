import java.util.TreeSet;

// Set 계열
// 1. 순서가 없음
// 2. 중복 데이터를 허용하지 않음.

// HashSet
// 1. Hashing 데이터 저장 방법을 활용
// 2. Hashing : 배열과 링크드리스트의 방법을 활용하여 검색속도 아주 빠름.

// TreeSet
// 1. Tree 데이터 저장 방법을 활용
// 2. Tree : 데이터를 저장할 때 정렬하면서 저장, 검색을 할때 효율이 높음, 저장과 삭제 시간이 아주 많이 걸림.

public class TreeSetTest01 {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		//HashSet<Integer> set = new HashSet<Integer>();
		
		// 데이터 추가 - 오름차순으로 정렬되어 출력
		set.add(82); set.add(63); set.add(58); set.add(97); set.add(76);
		System.out.println(set);
		System.out.println("크기 : " + set.size());
		
		// 중복되지 않은 데이터 추가 : 허용
		set.add(88);
		System.out.println(set);
		System.out.println("크기 : " + set.size());
		
		// 중복된 데이터 추가 : 중복 데이터는 허용 불가
		set.add(63);
		System.out.println(set);
		System.out.println("크기 : " + set.size());
		
		// 데이터 삭제
		set.remove(97);
		System.out.println(set);
		System.out.println("크기 : " + set.size());
		
		// 모든 데이터 삭제
		set.clear();
		System.out.println(set);
		System.out.println("크기 : " + set.size());
		
		
	}

}
