package CoolectionDay2;
import java.util.*;
public class D {
	public static void main(String[] args) {
		List l=new ArrayList();
		
		l.add(34);
		l.add("abc");
		l.add('m');
		l.add("xyx");
		l.add(45);
		l.add('A');
		
		Iterator itr=l.iterator();
		while(itr.hasNext())
		{
			int x=(int)itr.next();
			System.out.println(x);
			
			String s=(String)itr.next();
			System.out.println(s);
			
			
			char c=(char)itr.next();
			System.out.println(c);
			
			
					
		}
		
		
	}

}
