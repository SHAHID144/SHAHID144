package Day6;

public class Sumofdigits {

	public static void main(String[] args) {
		String str="1234";
		int sum=0;
	for(int i=0;i<str.length();i++) {
		char c=str.charAt(i);
		String str1=""+c;
		int num=Integer.parseInt(str1);
		sum=sum+num;
	
		}
	System.out.println("sum of all the digits:- "+ sum);

	}

}
