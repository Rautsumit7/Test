package CoolectionDay2;
import java.util.*;
public class Test {
	public static void main(String[] args) {
		
		Student s1=new Student();
		s1.setRollno(1);
		s1.setName("xyz");
		
		Student s2=new Student();
		s2.setRollno(2);
		s2.setName("aaa");
		
		Student s3=new Student();
		s3.setRollno(3);
		s3.setName("ccc");
		
		List lstu=new ArrayList();
		lstu.add(s1);
		lstu.add(s2);
		lstu.add(s3);
		
		Iterator itr=lstu.iterator();
		
		while(itr.hasNext())                     //true  true  true false
		{
			Student stu=(Student)itr.next();     //s1    s2    s3
			System.out.println(stu.getRollno()); //1     2      3
			System.out.println(stu.getName());   //xyz   aaa   ccc
		}
		
	}

}
