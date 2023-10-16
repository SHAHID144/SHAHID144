package Day6;

public class Sumofnum {
	public static void main(String[] args) {
		String str="20;30;40;50";
		String add[]=str.split(";");
		int sum=0;
	for(int i=0;i<add.length;i++) {
		int num=Integer.parseInt(add[i]);
		
		sum=sum+num;
		
		
	}
	System.out.println("Sum of Number is:- "+ sum);
	}
	
		
	}
		
	


