package day_2_project;

public class Employee {
   private int id;
   private String name;
   
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDetails()
{
	return "name is:"+name+" id is:"+id;
}
public void setSalary(int salary)
{
	
}
   
}
