package Day3;
import java.util.*;

public class First {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String [][]data= {

				   {"Strno","Stname","Marks"},
				   {"1","Rahul","90"},
				   {"2","Prajwal","80"},
				   {"3","Bharat","70"},
				   {"4","Moin","75"},
				   {"5","chandu","85"}


		   };
				System.out.println("Enter the Student Rollno");
				int rno=sc.nextInt();
				
				if(rno>data.length) {
					System.out.print("Rollno is not registered");
				}else {
				
				for(int i=0;i<data.length;i++) {
					for(int j=0;j<data[i].length;j++) {
						if(i==rno) {
							System.out.print("  "+data[i][j]);
						}
					  }
				    }
					System.out.println();
				}


	}

}
