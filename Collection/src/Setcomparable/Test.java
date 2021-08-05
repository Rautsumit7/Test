package Setcomparable;

import java.util.*;

public class Test {
	public static void main(String[] args) {
		Student s1=new Student();
		s1.setName("aaa");
		s1.setRollno(1);
		
		Student s2=new Student();
		s2.setName("bbb");
		s2.setRollno(2);
		
		Student s3=new Student();
		s1.setName("ccc");
		s1.setRollno(3);
		
		Set<Student>s=new TreeSet<Student>();
		
		s.add(s1);
		s.add(s2);
		s.add(s3);
		
		for(Student stu:s)
		{
			System.out.println(stu.getName());
			System.out.println(stu.getName());
		}
		
	}

}
