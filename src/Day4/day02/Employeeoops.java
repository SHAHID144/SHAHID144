package day02;

import java.util.Scanner;

public class Employeeoops {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Employee Id:-");
		int EmpId=sc.nextInt();
		
		System.out.println("Enter Employee Name:-");
		String EmpName=sc.next();
		
		System.out.println("Enter BAsic Pay:-");
		int BasicPay=sc.nextInt();
		
		System.out.println("Enter value of bonus,da,hra,tax,loan,pf:-");
		int bonus=sc.nextInt();
		int da=sc.nextInt();
		int hra=sc.nextInt();
		int tax=sc.nextInt();
		int loan=sc.nextInt();
		int pf=sc.nextInt();
		
		Employee em=new Employee(EmpId,EmpName,BasicPay);
		em.displayDetails();
		em.generateSalary(bonus,da,hra,tax,loan,pf);

	}

}
