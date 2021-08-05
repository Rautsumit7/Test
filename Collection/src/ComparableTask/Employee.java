package ComparableTask;

public class Employee implements Comparable<Employee>{
	private int eid;
	 private String ename;
	 private double esalary;

	public void setEid(int eid)
	{
	  this.eid=eid;
	}
	 public void setEname(String ename)
	{
	   this.ename=ename;
	}
	public void setEsalary(double esalary)
	{
	   this.esalary=esalary;
	}
	
	public int getEid()
	{
	  return eid;
	}
	 public String getEname()
	{
	 return ename;
	}
	public double getEsalary()
	{
	  return esalary;
	}
	@Override
	public int compareTo(Employee emp) {
		// TODO Auto-generated method stub
		//return this.eid-emp.eid;
		//return this.ename.compareTo(emp.ename);
		return(int)(this.esalary-emp.getEsalary());
	}
	

}
