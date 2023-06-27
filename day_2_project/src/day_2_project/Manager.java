package day_2_project;

public class Manager extends Employee {
   private String department;

public Manager() {
	super();
	// TODO Auto-generated constructor stub
}

public String getDepartment() {
	return department;
}

public void setDepartment(String department) {
	this.department = department;
}

@Override
public String getDetails() {
	// TODO Auto-generated method stub
	return super.getDetails()+"Department is :"+department;
}
   
}
