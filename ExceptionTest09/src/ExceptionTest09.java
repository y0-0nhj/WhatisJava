
class Member {
	private int no;      // 회원번호
	private String name; // 회원이름
	
	public Member(int no, String name) {
		this.no = no;
		this.name = name;
	}
	
	public int getNo() {
		return no;
	}
	
	public String getName() {
		return name;
	}
	
	public void setNo(int no) {
		this.no = no;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return no + "(" + name + ")";
	}
	
}

public class ExceptionTest09 {
	public static void main(String[] args) {
		/*
		// 1. 예외 발생 상황
		Member[] members = new Member[] {
			new Member(123456, "이익준"),
			new Member(123457, "김준완"),
			new Member(123458, "채송화"),
			new Member(123459, "양석형"),
			new Member(123460, "안정원"),
		};
		
		try {
			// 예외 발생 - 배열의 인덱스를 넘는 예외
			for(int i=0; i<=members.length; i++) {
				System.out.println(members[i].toString());
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("배열의 인덱스가 범위를 벗어났습니다.");
		}
		*/
		
		Member[] members = new Member[5];
		int[] no = {123456, 123457, 123458, 123459};
		String[] names = {"이익준", "김준완", "채송화", "양석형"};
		
		for(int i=0; i<names.length; i++) {
			members[i] = new Member(no[i], names[i]);
		}
		
		// 예외 발생 - member[4]이 참조하는 데이터는 존재하지 않음. 
		try {
			for(int i=0; i<members.length; i++) { 
				System.out.println(members[i].toString());
			}
		} catch(NullPointerException e) {
			System.err.println("참조할 객체가 존재하지 않습니다.");
		}
		
		
		System.out.println("--- Part 2 ---");
		System.out.println("회원에 대한 처리를 하고 있습니다.");
		
	
	}

}
