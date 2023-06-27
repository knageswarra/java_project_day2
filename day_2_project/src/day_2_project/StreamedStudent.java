package day_2_project;



public class StreamedStudent extends Student {
  private String[] stream;

public StreamedStudent() {
	super();
	// TODO Auto-generated constructor stub
}

public String[] getStream() {
	return stream;
}

public void setStream(String... subjects) {
	this.stream=subjects.clone();
}
public Student[] createStudent(String... names)
{
	Student[] students=new Student[names.length];
	for(int i=0;i<names.length;i++)
	{
		students[i]=new Student();
		students[i].setId(i+1);
		students[i].setSname(names[i]);
	}
	return students;
}

@Override
public String getDetails() {
	// TODO Auto-generated method stub
	System.out.println(super.getDetails());
	if (stream != null && stream.length > 0) 
		 return "Stream: " + String.join(", ", stream);
	else 
		return "Stream: None";
}
@Override
public String toString() {
	//return "StreamedStudent [stream=" + Arrays.toString(stream) + "]";
	return super.toString() + "StreamedStudent [stream=" + String.join(", ", stream) + "]";
}



  
}
