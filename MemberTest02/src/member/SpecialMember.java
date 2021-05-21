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
	
	// ���1
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("Ư������ : " +  privilege);
	}
	
	// ���2
	@Override
	public String toString() {
		return super.toString() + ", Ư������ : " + privilege;
	}

}
