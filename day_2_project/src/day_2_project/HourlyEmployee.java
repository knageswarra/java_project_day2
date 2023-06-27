package day_2_project;

public class HourlyEmployee extends Employee{
  private double hourlyrate;

public HourlyEmployee() {
	super();
	// TODO Auto-generated constructor stub
}

public double getHourlyrate() {
	return hourlyrate;
}

public void setHourlyrate(double hourlyrate) {
	this.hourlyrate = hourlyrate;
}

@Override
public void setSalary(int salary) {
	this.hourlyrate = salary / (8 * 20);
}

@Override
public String getDetails() {
	// TODO Auto-generated method stub
	return super.getDetails()+"hourly rate is :"+hourlyrate;
}


  
}
