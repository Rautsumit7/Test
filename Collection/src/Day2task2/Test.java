package Day2task2;

import java.util.*;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter data of Student1");
		Student s1=new Student();
		System.out.println("Roll no");
		int r1=sc.nextInt();
		s1.setRollno(r1);
		System.out.println("name");
		String n1=sc.next();
		s1.setName(n1);
		
		System.out.println("Student2");
		Student s2=new Student();
		System.out.println("Roll no");
		int r2=sc.nextInt();
		s2.setRollno(r2);
		System.out.println("name");
		String n2=sc.next();
		s2.setName(n2);
		
		System.out.println("Student3");
		Student s3=new Student();
		System.out.println("Roll no");
		int r3=sc.nextInt();
		s3.setRollno(r3);
		System.out.println("name");
		String n3=sc.next();
		s3.setName(n3);
		
		
		List al=new ArrayList();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			Student s=(Student)itr.next();
			System.out.println(s.getRollno());
			System.out.println(s.getName());
		
	}
	}
}
