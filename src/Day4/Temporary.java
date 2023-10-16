package Day4;

public class Temporary extends Employee {
	private double servicePeriod;

	public double getServicePeriod() {
		return servicePeriod;
	}

	public void setServicePeriod(double servicePeriod) {
		this.servicePeriod = servicePeriod;
	}

	public Temporary(int employeeId, String employeeName, double baseSalary, double servicePeriod) {
		super(employeeId, employeeName, baseSalary);
		this.servicePeriod = servicePeriod;
	}

	public Temporary(double servicePeriod) {
		super();
		this.servicePeriod = servicePeriod;
	}
	public void calculatesalaryHike()  {
		double basesalary=super.getBaseSalary();
		System.out.println("TemporaryEmployee Salary Hike :-  " + servicePeriod*(basesalary+(5*basesalary/100)));
		
	}

	
	 
	
	
	

}
