package Day3;

public class Food {
	
	public static void main(String[] args) {
		
	}
	private int fid;
	private String fname;
	private String cuisine;
	private String type;
	private int price;
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getCuisine() {
		return cuisine;
	}
	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Food(int fid, String fname, String cuisine, String type, int price) {
		super();
		this.fid = fid;
		this.fname = fname;
		this.cuisine = cuisine;
		this.type = type;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Food [fid=" + fid + ", fname=" + fname + ", cuisine=" + cuisine + ", type=" + type + ", price=" + price
				+ "]";
	}
	
	
}

