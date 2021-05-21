import java.util.LinkedList;

public class LinkedListTest01 {
	public static void main(String[] args) {
		// LinkedList 생성
		LinkedList<String> list = new LinkedList<String>();
		
		// 1. 리스트 맨 뒤에 데이터 추가 
		list.add("이익준"); list.add("김준완"); list.add("양석형"); list.add("안정원"); list.add("채송화");
		System.out.println(list);
		
		// 2. 리스트 중간에 데이터 추가 - 안정원 뒤에 장겨울 데이터 추가
		list.add(4, "장겨울");
		System.out.println(list);
		
		// 3. 리스트에서 데이터 삭제 - 김준완 데이터를 삭제
		//list.remove(1);
		list.remove("김준완");
		System.out.println(list);
		
		// 4. 리스트의 데이터 변경 - 양석형을 추민하로 변경
		list.set(1, "추민하");
		System.out.println(list);
		
		// LinkedList 클래스에 추가된 기능
		System.out.println("----------");
		// 5. 리스트의 첫번째에 데이터 추가 - 안치홍 추가
		//list.add(0, "안치홍");
		list.addFirst("안치홍");
		System.out.println(list);
		
		// 6. 리스트의 마지막에 데이터 추가 - 도재학 추가
		//list.add("도재학");
		list.addLast("도재학");
		System.out.println(list);
		
		// 7. 리스트의 첫번째 데이터를 삭제 - 안치홍 삭제
		//list.remove(0);
		//list.remove("안치홍");
		list.removeFirst();
		System.out.println(list);
		
		// 8. 리스트의 마지막 데이터를 삭제 - 도재학 삭제
		//list.remove(list.size()-1);
		//list.remove("도재학");
		list.removeLast();
		System.out.println(list);
		
		// 9. 리스트의 첫번째 데이터를 확인
		//System.out.println(list.get(0));
		System.out.println(list.getFirst());
		
		// 10. 리스트의 마지막 데이터를 확인
		//System.out.println(list.get(list.size()-1));
		System.out.println(list.getLast());
		
		
		// end
	}

}
