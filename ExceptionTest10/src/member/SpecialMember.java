 package member;

public class SpecialMember extends Member {
	private String privilege; // Æ¯º° ÇýÅÃ
	
	public SpecialMember(int no, String name, String privilege) {
		super(no, name);
		this.privilege = privilege;
	}
	
	public String getPrivilege() {
		return privilege;
	}
	
	public void setPrivilege(String privilege) {
		this.privilege = privilege;
	}
	
	@Override
	public String toString() {
		return super.toString() + " | " + privilege;
	}

}
