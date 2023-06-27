package demo_package;

//import day_2_project.Employee;
//import day_2_project.RegularEmployee;
import day_2_project.StreamedStudent;
import day_2_project.Student;
public class Tester {
   
	public static void main(String args[])
	{
	//Employee emp=new RegularEmployee();
	//emp.setSalary(522);
	//emp.setId(123);
	//emp.setName("Nagu");
	//System.out.println(emp.getDetails());
	
	
	Student s2 = new StreamedStudent();
    s2.setId(1);
    s2.setSname("John");
    System.out.println(s2.getDetails());
    
    StreamedStudent s3 = (StreamedStudent) s2;
    s3.setStream("Maths", "Science", "English");
    System.out.println(s3.getDetails());

    Student[] students = s3.createStudent("John", "Jane", "Jack");
    for (Student s : students) {
    	System.out.println(s.getDetails());
    }
	
	}
}
