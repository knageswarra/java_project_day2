package day_2;

public class CD {
	private int cdid;
	private String cdName;
	private double price;
	public int getCdid() {
		return cdid;
	}
	public void setCdid(int cdid) {
		this.cdid = cdid;
	}
	public String getCdName() {
		return cdName;
	}
	public void setCdName(String cdName) {
		this.cdName = cdName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDetails() {
		return "CD [cdid=" + cdid + ", cdName=" + cdName + ", price=" + price + "]";
	}
	

}
