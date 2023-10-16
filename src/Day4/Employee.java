package Day4;

public class Employee {
	private int employeeId;
	private String employeeName;
	private double baseSalary;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	public Employee(int employeeId, String employeeName, double baseSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.baseSalary = baseSalary;
	}
	public Employee() {
		super();
	}
	

	

}
