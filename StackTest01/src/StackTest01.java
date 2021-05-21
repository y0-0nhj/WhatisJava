import java.util.Stack;

// Stack(스택) : 밑이 막혀있는 통처럼 생긴 데이터 저장 구조, push(데이터 삽입), pop(데이터 꺼냄)
// - 선입후출 : FILO(First In Last Out), 후입선출 : LIFO(Last In First Out)
public class StackTest01 {
	public static void main(String[] args) {
		Stack<Integer> st1 = new Stack<Integer>();
		
		st1.push(10);
		st1.push(20);
		st1.push(30);
		System.out.println(st1);
		
		while(!st1.isEmpty()) {
			System.out.println(st1.pop()); // 데이터를 꺼내서 삭제
		}
		System.out.println(st1);
		
		System.out.println("----------");
		
		Stack<String> st2 = new Stack<String>();
		
		st2.add("이익준");
		st2.add("김준완");
		st2.add("양석형");
		st2.add("안정원");
		st2.add("채송화");
		System.out.println(st2);
		
		while(!st2.isEmpty()) {
			System.out.println(st2.pop());
		}
		System.out.println(st2);
		
	}

}
