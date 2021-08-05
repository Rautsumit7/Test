package ComparatorTask;

import java.util.Comparator;

public class EnameSort implements Comparator<Employee>{

	@Override
	public int compare(Employee emp1, Employee emp2) {
		// TODO Auto-generated method stub
		return emp1.getEname().compareTo(emp2.getEname());
	}

}
