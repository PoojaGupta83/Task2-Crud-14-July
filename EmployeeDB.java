package Task3;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDB {
	static List<Employee> eList;

	public EmployeeDB() {
		eList = new ArrayList<>();
		eList.add(new Employee(1001, "Raman", 10000));
		eList.add(new Employee(1002, "Rohit", 20000));
		eList.add(new Employee(1003, "Manoj", 12000));
		eList.add(new Employee(1004, "Amit", 12000));
		eList.add(new Employee(1005, "Kabit", 11500));
		eList.add(new Employee(1006, "Laxam", 11500));
		eList.add(new Employee(1007, "Dipesh", 10000));
		eList.add(new Employee(1008, "Amit", 10000));
		eList.add(new Employee(1009, "Manoj", 17500));
		eList.add(new Employee(1010, "Rohit", 21000));
		eList.add(new Employee(1003, "Manoj", 15000));
		eList.add(new Employee(1002, "Rohit", 20000));
	}

	public void addNewEmployeeDetails(Employee employee) {
		Employee e1 = new Employee(employee.getEmpId(), employee.getEmpName(), employee.getSalary());
		eList.add(e1);
	}

	public List<Employee> getEmployeesList() {
		return eList;
	}
}
