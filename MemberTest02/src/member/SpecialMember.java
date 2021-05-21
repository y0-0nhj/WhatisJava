package member;

public class SpecialMember extends Member {
	private String privilege;
	
	public SpecialMember(String name, String no, int age, String privilege) {
		super(name, no, age);
		this.privilege = privilege;
	}
	
	// getter 
	public String getPrivilege() {
		return privilege;
	}
	
	// setter
	public void setPrivilege(String privilege) {
		this.privilege = privilege;
	}
	
	// 출력1
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("특별권한 : " +  privilege);
	}
	
	// 출력2
	@Override
	public String toString() {
		return super.toString() + ", 특별권한 : " + privilege;
	}

}
