package day02;

public class Book {
	/*Write a program to create a class Book with the following 
- field:
      -bno, title, author, price
  - methods :

       i. displayDetails() to display the details of the book
       ii. discountedPrice(int discount) : pass the discount percent, calculate the discount on price and 
       find the amount to be paid after discount
  - task : 
     Create an object book, initialize the book and display the details along with the discounted price

 

               Book b = new Book(121,"Java","Bala",5000);
              b.displayDetails();
             b.discountdPrice(5); 
                                     5000-250
              o/p 4750*/
	private int bno;
	private String title;
	private String author;
	private int price;
	public Book(int bno, String title, String author, int price) {
		this.bno = bno;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public void displayDetails() {
		System.out.println("\n Book No:-" +bno);
		System.out.println("\n Title:-" +title);
		System.out.println("\n Author:-" +author);
		System.out.println("\n Price:-" +price);
		
	}
	
	public void discountedprice (int discount) {
		System.out.println("\n After discount price= "  + ((100-discount)*price)/100);
		
	}

}
