package goods;

public class ExpGoodsAsia {
	private String country;
	private int seq;
	private String goods;
	
	// 생성자
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
		return "수출국가: " + country + ", 통관번호: " + seq + ", 물품: " + goods;
	}
	
}
