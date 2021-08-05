package ComparatorTask;

import java.util.Comparator;

public class EsalarySort implements Comparator<Employee>{

	@Override
	public int compare(Employee emp1, Employee emp2) {
		// TODO Auto-generated method stub
		return (int) (emp1.getEsalary()-emp2.getEsalary());
	}

}
