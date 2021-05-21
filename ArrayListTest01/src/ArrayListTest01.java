import java.util.ArrayList;

// ArrayList
// 1. Vector와 기능과 사용법이 동일
// 2. Vector는 쓰레드의 동기화 기능이 있어 성능의 저하가 발생
// -> ArrayList는 Vector의 쓰레드 동기화 기능을 제거하여 성능을 개선함.
// 3. Vector의 capacity() 메소드가 없음.

// 문제)
// 1. 정수를 담는 ArrayList인 list를 생성하시오.
// 2. 정수배열 score의 내용을 list에 추가하시오.
// ex) score의 값 : 95, 88, 75, 63, 52, 77, 47, 48, 93, 91
// 3. 리스트에서 60점 미만의 점수는 삭제하시오.
// 4. list의 총점과 평균을 구하시오.
// 5. list에서 최고점수와 최저점수를 구하시오.
// 6. list의 내용을 2가지 방법으로 출력하시오. (기본 for문, for-in문) 

public class ArrayListTest01 {
	public static void main(String[] args) {
		System.out.println("- 1. 정수를 저장하는 ArrayList 생성 -");
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		System.out.println("- 2. 리스트에 배열의 데이터 추가 -");
		int[] score = {95, 88, 75, 63, 52, 77, 47, 48, 93, 91};
		
		for(int i=0; i<score.length; i++) {
			list.add(score[i]);
		}
		System.out.println(list);
		
		System.out.println("-3. 60점 미만의 데이터 삭제 -");
		// 문제점) 논리적으로 아주 큰 오류가 있음, 60점보다 작은 점수를 삭제하면 뒤의 데이터가 앞으로 당겨지면서 1개의 데이터의 검사를 건너뛰게 됨.
//		for(int i=0; i<list.size(); i++) {
//			if(list.get(i) < 60) {
//				list.remove(i);
//			}
//		}
		
		// 해결책) 뒤에서 검사하면 됨, 누락되는 점수가 없음.
		for(int i=list.size()-1; i>=0; i--) {
			if(list.get(i) < 60) {
				list.remove(i);
			}
		}		
		System.out.println(list);
		
		System.out.println("- 4. 리스트의 총점과 평균 계산 -");
		int sum = 0;
		for(int i=0; i<list.size(); i++) {
			sum += list.get(i);
		}
		System.out.printf("총점: %d\n평균: %.2f\n", sum, (double)sum/list.size());
		
		
		System.out.println("- 5. 리스트의 최고점수와 최저점수 구하기 -");
		int max = list.get(0);
		int min = list.get(0);
		
		for(int i=1; i<list.size(); i++) {
			if(list.get(i) > max) {
				max = list.get(i);
			}
			if(list.get(i) < min) {
				min = list.get(i);
			}
		}
		System.out.println("최고점수: " + max);
		System.out.println("최저점수: " + min);
		
		System.out.println("- 6-1. 출력(기본 for문) -");
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) + ", ");
		}
		System.out.println();
		
		System.out.println("- 6-2. for-in문 -");
		for(int i : list) {
			System.out.print(i + ", ");
		}
		System.out.println();
		
		
		// end
	}

}
