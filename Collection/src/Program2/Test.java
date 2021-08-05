package Program2;
import java.util.*;
public class Test {
	public static void main(String[] args) {
		
		List al=new ArrayList();
		 al.add(20);
		 al.add(40);
		 al.add(20);
		 al.add(40);
		 System.out.println(al);
		
		 Iterator itr=al.iterator();
		 while(itr.hasNext())
		 {
			 int x=(int)itr.next();
			 System.out.println(x);
		 }
		 
		
	}

}
