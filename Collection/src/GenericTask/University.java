package GenericTask;

import java.util.Iterator;
import java.util.List;


public class University {
	public static void main(String[] args) {
		
		College c=new College();
		List <Student>details=c.m1();
		
		Iterator<Student> itr=details.iterator();//s
		
		while(itr.hasNext())//true false
		{
			Student s=itr.next();//s
			System.out.println(s.getName());//xyz
			System.out.println(s.getRollno());//1
		
		}
	}

}
