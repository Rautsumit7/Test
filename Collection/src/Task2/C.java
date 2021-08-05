package Task2;
import java.util.*;
public class C {
	public static void main(String[] args) {
		List al=new ArrayList();
		al.add('a');
		al.add('b');
		al.add('c');
		al.add('d');
		
		
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			char c=(char)itr.next();
			System.out.println(c);
		}

		
	}

}
