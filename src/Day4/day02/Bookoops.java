package day02;

import java.util.Scanner;

public class Bookoops {
	
	public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter Book No:-");
	int bookno=sc.nextInt();
	
	System.out.println("Enter Title:-");
	String title=sc.next();
	
	System.out.println("Enter Author name:-");
	String author=sc.next();
	
	System.out.println("Enter price:-");
	int price=sc.nextInt();
	
	
	System.out.println("Enter Discount:-");
	int discount=sc.nextInt();
	
	Book b=new Book(bookno,title,author,price);
	
	b.displayDetails();
	b.discountedprice(discount);
	
	}	
	
}



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
             o/p 4750 */
 

 