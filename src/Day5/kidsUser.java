package Day5;

public class kidsUser implements Libraryuser {
	int age;
	
	public void registerAccount(int age) {
		
		if(age<12) {
			System.out.println("\nYou have successfully registered under a kids account");
		}else {
			System.out.println("\nSorry,Age must be less than 12 to register as a kid");
		}
		this.age=age;
	}
	public void requestBook(String bname) {
		if(bname=="kids" && age<12) {
			System.out.println("\nBook Issued successfully, Please return the book  within 10 days");
		}else {
			System.out.println("\nOops,You are allowed to take only kids books");
			
			
		}
	}
	
	
	
	

}
