package goods;

public class ExportGoods {
	private String country;
	private int seq;
	private String goods;
	
	public ExportGoods(String country, int seq, String goods) {
		this.country = country;
		this.seq = seq;
		this.goods = goods;
	}

	public String getCountry() {
		return country;
	}

	public int getSeq() {
		return seq;
	}

	public String getGoods() {
		return goods;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public void setGoods(String goods) {
		this.goods = goods;
	}

	@Override
	public String toString() {
		return "ExportGoods [country=" + country + ", seq=" + seq + ", goods=" + goods + "]";
	}
}
