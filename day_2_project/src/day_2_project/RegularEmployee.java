package day_2_project;

public class RegularEmployee extends Employee{
	private double salary;

	
	public RegularEmployee() {
		super();
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return super.getDetails()+" salary is:"+salary;
	}
	
	
	
}
