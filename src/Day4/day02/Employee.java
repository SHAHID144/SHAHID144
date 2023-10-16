package day02;

public class Employee {

		/* . Implement a class Employee with appropriate state and behavior. Write Demo java program to test 
  Employee object behavior.
- attributes :
   EmpId, EmpName, BasicPay
- methods :

   i. display method to display the details of the Employee
   ii. generateSalary method to display the bonus,da,hra,tax,loan,pf,gross,ded & NetSal( any Percentage on BasicPay)
                   gross= basic+bonus+da+hra
                   ded= loan+pf+tax
                    netsal= gross-ded*/
		private int EmpId;
		private String EmpName;
		private int Basicpay;
		public Employee(int empId, String empName, int basicpay) {
			super();
			EmpId = empId;
			EmpName = empName;
			Basicpay = basicpay;
		}
		
		public void displayDetails() {
		System.out.println("/n EmpId:- " +EmpId);
		System.out.println("/n EmpName:- " +EmpName);
		System.out.println("/n Basicpay:- " +Basicpay);
		
		}
		
		public void generateSalary(int bonus,int da,int hra,int tax,int loan,int pf) {
		int gross= (Basicpay+((bonus)*Basicpay/100)+((da)*Basicpay/100)+((hra)*Basicpay/100));
		int ded= (((loan)*Basicpay/100)+((pf)*Basicpay/100)+((tax)*Basicpay/100));
		int netsal=gross-ded;
		System.out.println("/n Employee net salary:- " +netsal);
		
		}
		
		
		
		

	}


