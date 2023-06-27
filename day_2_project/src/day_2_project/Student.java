package day_2_project;

public class Student {
	private String sname;
	private int id;
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
    public String getDetails()
    {
    	return "name is"+sname+" id is:"+id;
    }
}
