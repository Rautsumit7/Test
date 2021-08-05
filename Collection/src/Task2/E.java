package Task2;
import java.util.*;
public class E {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		List al=new ArrayList();
		
		System.out.println("Enter the list:");
		
		al.add(sc.next());
		al.add(sc.next());
		al.add(sc.next());
		al.add(sc.next());
		al.add(sc.next());
		
		al.addAll(al);
		
		
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			String s=(String)itr.next();
			System.out.println(s);
		}
	}
}
