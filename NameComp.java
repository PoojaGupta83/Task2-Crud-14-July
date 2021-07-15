package Task3;

import java.util.Comparator;

import Task3.Employee;

@SuppressWarnings("unused")
public class NameComp implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {

		return e1.empName.compareTo(e2.empName);
	}

}
