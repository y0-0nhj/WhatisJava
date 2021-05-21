import java.util.HashSet;
import java.util.Iterator;

// Set 계열의 특징
// 1. 순서가 없음.(인덱스가 없음)
// 2. 중복 데이터를 허용하지 않음.
// 3. HashSet, TreeSet ...

public class HashSetTest01 {
	public static void main(String[] args) {
		// HashSet 생성
		HashSet<Integer> set = new HashSet<Integer>();
		
		// 데이터 추가
		set.add(66);
		set.add(75);
		set.add(57);
		set.add(96);
		set.add(45);
		
		// 데이터를 넣은 순서대로 나오는 것이 아님. -> 순서가 없음.
		// hashing 기법을 이용한 데이터 저장 방법을 사용.
		System.out.println(set);
		System.out.println("크기 : " + set.size());
		
		// 중복된 데이터는 허용 불가
		set.add(57);
		System.out.println(set);
		System.out.println("크기 : " + set.size());
		
		// 중복되지 않은 데이터는 허용
		set.add(83);
		System.out.println(set);
		System.out.println("크기 : " + set.size());
		
		// 데이터 삭제 - 존재하는 데이터 삭제
		set.remove(96);
		System.out.println(set);
		System.out.println("크기 : " + set.size());
		
		// 데이터 삭제 - 존재하지 않는 데이터를 삭제 : 에러가 발생하지 않고 정상적으로 작동 (예외처리가 되어있음)
		set.remove(88);
		System.out.println(set);
		System.out.println("크기 : " + set.size());
		
		// 출력 1 - for-in문은 사용가능, 기본 for문은 사용불가(인덱스가 없으므로)
		int sum = 0;
		for(int i : set) {
			sum += i;
			System.out.println(i);
		}
		System.out.println("총점 : " + sum);
		
		// 출력 2 - Iterator 사용
		sum = 0;
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			int i = it.next();
			sum += i;
			System.out.println(i);
		}
		System.out.println("총점 : " + sum);
		
	}

}
