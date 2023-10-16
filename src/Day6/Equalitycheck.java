package Day6;

public class Equalitycheck {

	public static void main(String[] args) {

		  Pizza p1 = new Pizza("Medium",20,3);

		    Pizza p2 = new Pizza("Small",18,4);

		    if(p1.equals(p2))

		    	System.out.println("Yes Identical");

		    else

		    	System.out.println("Not identical");

	}

}
