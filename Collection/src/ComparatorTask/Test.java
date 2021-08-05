package ComparatorTask;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;



public class Test {
	
		public static void main(String[] args) {
			Employee e1=new Employee();
			e1.setEid(1);
			e1.setEname("SR");
			e1.setEsalary(50000.11);
			
			Employee e2=new Employee();
			e2.setEid(2);
			e2.setEname("SRT");
			e2.setEsalary(60000.22);
			
			Employee e3=new Employee();
			e3.setEid(2);
			e3.setEname("SRTV");
			e3.setEsalary(70000.33);
			
			Set<Employee>e=null;
			
			System.out.println("---Select---\n"
					+"1.Eid.Sort\n"
					+"2.Ename.Sort\n"
					+"3.Esalary.Sort\n");
			Scanner sc=new Scanner(System.in);
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:
			{
			e=new TreeSet<Employee>(new EidSort());
			break;
			}
			case 2:
			{
			e=new TreeSet<Employee>(new EidSort());
			break;
			}
			}
			e.add(e1);
			e.add(e2);
			e.add(e3);
			
			for(Employee emp:e)
			{
				System.out.println(emp.getEid());
				System.out.println(emp.getEname());
				System.out.println(emp.getEsalary());
			}
			}
	}


