package Day3;

import java.util.Arrays;

public class Foodorder {
	private int orderid;
	private int totalprice=0;
	private Food[] orderedFoods;
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public int getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(int totalprice) {
		this.totalprice = totalprice;
	}
	public Food[] getOrderedFoods() {
		return orderedFoods;
	}
	public void setOrderedFoods(Food[] orderedFoods) {
		this.orderedFoods = orderedFoods;
	}
	public Foodorder(int orderid, Food[] orderedFoods) {
		super();
		this.orderid = orderid;
		this.orderedFoods = orderedFoods;
	}
	public void calcuatePrice(String ptype) {
		for(int i=0;i<orderedFoods.length;i++) {
			totalprice=totalprice+orderedFoods[i].getPrice();
			
		}
		if(ptype=="cash"){
		}else if(ptype=="card") {
			totalprice=totalprice+20;
		}else if(ptype=="upi") {
			totalprice=totalprice+10;
		}
		System.out.println(this);
		
		}
	@Override
	public String toString() {
		return "hey your total price is ₹ "+ totalprice +"/- pls pay the bill and enjoy your food ";
	}
	
	
	

}
