package Setcomparator;
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
		
		Set<Student>s=null;
		
		System.out.println("---select---\n"
				+ "1.RollNo.sort\n"
				+"2.Name.sort\n");
		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();
		
		if(ch==1)
		{
			
		}
		
	}

}
