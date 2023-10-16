package Day6;

public class sumexist2 {

	public static void main(String[] args) {
		String str="30;32;50;26;70";
		String arr[]=str.split(";");
		int sum=0;
	for(int i=0;i<arr.length;i++) {
		if (arr[i].contains("3")) {
		int num=Integer.parseInt(arr[i]);
		sum=sum+num;
		}
		
	}
	System.out.println("Sum of all the digits where 2 exists :- "+    sum);  
		

	}

}
