package Day5;

public class AdultUser implements Libraryuser {
int age;
	
	public void registerAccount(int age) {
		
		if(age<12) {
			System.out.println("\nYou have successfully registered under a Adult account");
		}else {
			System.out.println("\nSorry,Age must be greater than 12 to register as a adult account");
		}
		this.age=age;
	}
	public void requestBook(String bname) {
		if(bname=="Fiction" && age>12) {
			System.out.println("\nBook Issued successfully, Please return the book  within 7 days");
		}else {
			System.out.println("\nOops,You are allowed to take only adult Fiction books");
			
			
		}
	}

}
