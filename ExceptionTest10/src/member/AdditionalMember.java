package member;

public class AdditionalMember extends Member {
	private int bonus;
	
	public AdditionalMember(int no, String name, int bonus) {
		super(no, name);
		this.bonus = bonus;
	}
	
	public int getBonus() {
		return bonus;
	}
	
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return super.toString() + " | " + bonus;
	}
}
