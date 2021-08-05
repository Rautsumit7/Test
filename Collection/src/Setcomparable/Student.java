package Setcomparable;

public class Student implements Comparable<Student>{
	
	private int rollno;
	  private String name;
	public void setRollno(int rollno)
	{
	  this.rollno=rollno;
	}
	public void setName(String name)
	{
	  this.name=name;
	}
	public int getRollno()
	{
	  return rollno;
	}
	public String getName()
	{
	  return name;
	}
	@Override
	public int compareTo(Student stu) {
		// TODO Auto-generated method stub
		//return this.rollno-stu.rollno;
		return this.name.compareTo(stu.name);
		
	}
	
	

}
