package Task2;
import java.util.*;

public class A {
	public static void main(String[] args) {
		List al=new ArrayList();
		al.add(11f);
		al.add(12.34f);
		al.add(13.34f);
		al.add(14.11f);
		al.add(15.8f);
		al.add(16f);
		
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			float f=(float)itr.next();
			System.out.println(f);
		}
	}

}
