package Task2;
import java.util.*;

public class D {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		List al=new ArrayList();
		
		System.out.println("How many values you want to add:");
		int num=sc.nextInt();
		System.out.println("enter number to add into list:");
		for(int i=1;i<=num;i++)
		{
			al.add(sc.next());
		}
		
		
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			int f=(int)itr.next();
			System.out.println(f);
		}
		
	}

}
