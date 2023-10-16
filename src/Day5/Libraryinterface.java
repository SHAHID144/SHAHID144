package Day5;

public class Libraryinterface {
	public static void main(String[]  args) {
		kidsUser ks=new kidsUser();
		ks.registerAccount(9);
		ks.requestBook("Fiction");
		
		
		AdultUser at=new AdultUser();
		at.registerAccount(18);
		at.requestBook("kids");
	
	}

}
