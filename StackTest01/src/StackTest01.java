import java.util.Stack;

// Stack(����) : ���� �����ִ� ��ó�� ���� ������ ���� ����, push(������ ����), pop(������ ����)
// - �������� : FILO(First In Last Out), ���Լ��� : LIFO(Last In First Out)
public class StackTest01 {
	public static void main(String[] args) {
		Stack<Integer> st1 = new Stack<Integer>();
		
		st1.push(10);
		st1.push(20);
		st1.push(30);
		System.out.println(st1);
		
		while(!st1.isEmpty()) {
			System.out.println(st1.pop()); // �����͸� ������ ����
		}
		System.out.println(st1);
		
		System.out.println("----------");
		
		Stack<String> st2 = new Stack<String>();
		
		st2.add("������");
		st2.add("���ؿ�");
		st2.add("�缮��");
		st2.add("������");
		st2.add("ä��ȭ");
		System.out.println(st2);
		
		while(!st2.isEmpty()) {
			System.out.println(st2.pop());
		}
		System.out.println(st2);
		
	}

}
