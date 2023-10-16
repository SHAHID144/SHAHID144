package Day3;

public class main {

	public static void main(String[] args) {
		
		Food f1=new Food(101,"Pizza","Italian","Veg",100);
		Food f2=new Food(101,"noodles","chinese","Veg",100);
		Food f3=new Food(101,"Biryanis","chinese","Veg",200);
		
		Food []f= {f1,f2,f3};
		Foodorder o=new Foodorder(111,f);
		o.calcuatePrice("upi");

	}

}
