package Day4;

public class Permanent extends Employee {

		private String designation;
		private int hikePercent;
		public String getDesignation() {
			return designation;
		}
		public void setDesignation(String designation) {
			this.designation = designation;
		}
		public int getHikePercent() {
			return hikePercent;
		}
		public void setHikePercent(int hikePercent) {
			this.hikePercent = hikePercent;
		}
		public Permanent(int employeeId, String employeeName, double baseSalary, String designation, int hikePercent) {
			super(employeeId, employeeName, baseSalary);
			this.designation = designation;
			this.hikePercent = hikePercent;
		}
		public void calculatesalaryHike()  {
			double basesalary=super.getBaseSalary();
			System.out.println("permanent Employee Salary :- " +(basesalary+(hikePercent*basesalary/100)));
			
		}

}

