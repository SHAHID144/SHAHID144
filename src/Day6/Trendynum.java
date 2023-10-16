package Day6;

public class Trendynum {

	public static void main(String[] args) {
		int n=379;
		String str=Integer.toString(n);
		str.charAt(1);
		String b=""+str.charAt(1);
		int num=Integer.parseInt(b);
		
		if(str.length()==3 && num%3==0)  {
			System.out.println("it is a trendy number :- " +n);
		}else {
			System.out.println("it is not a trendy number :- " +n);
			
			
		}
		
		
		}

}
