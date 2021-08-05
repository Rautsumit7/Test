package Day2task3;
import java.util.*;
public class University {
	public static void main(String[] args) {
		
	
	
	College c=new College();
	List details=c.m1();
	
	Iterator itr=details.iterator();
	
	while(itr.hasNext())
	{
		Student s=(Student)itr.next();
		System.out.println(s.getRollno());
		System.out.println(s.getName());
	}
	}
}
