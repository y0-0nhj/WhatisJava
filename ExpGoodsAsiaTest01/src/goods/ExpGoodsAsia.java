package goods;

public class ExpGoodsAsia {
	private String country;
	private int seq;
	private String goods;
	
	// ������
	public ExpGoodsAsia(String country, int seq, String goods) {
		this.country = country;
		this.seq = seq;
		this.goods = goods;
	}
	
	// getter
	public String getCountry() { 
		return country;
	}
	
	public int getSeq() { 
		return seq;
	}
	
	public String getGoods() {
		return goods;
	}

	// setter
	public void setCountry(String country) {
		this.country = country;
	}
	
	public void setSeq(int seq) {
		this.seq = seq;
	}
	
	public void setGoods(String goods) {
		this.goods = goods;
	}
	
	// toString()
	public String toString() {
		return "���ⱹ��: " + country + ", �����ȣ: " + seq + ", ��ǰ: " + goods;
	}
	
}
