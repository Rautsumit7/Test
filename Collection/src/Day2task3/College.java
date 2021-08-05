package Day2task3;

import java.util.*;

public class College {
	public List m1()
	{
		List list=new ArrayList();
		Student s=new Student();
		s.setRollno(1);
		s.setName("xyz");
		
		Student s1=new Student();
		s1.setRollno(2);
		s1.setName("aaa");
		
		Student s2=new Student();
		s2.setRollno(3);
		s2.setName("abc");
		
		list.add(s);
		list.add(s1);
		list.add(s2);
		return list;
	}
	
	

}
