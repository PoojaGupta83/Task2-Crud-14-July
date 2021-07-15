package Task3;

import java.util.*;
import Task3.Employee;

@SuppressWarnings("unused")
public class Service {

	private Repository repo;

	public Service() {
		repo = new Repository();

	}

	/* "1. Print Employee List" */
	public void showList() {

		List<Employee> empl = repo.getEmployeeList();
		for (Employee emp2 : empl) {
			System.out.println(emp2);
		}
	}

	/* "2. Print Employee List in Sorting Order" */

	public void SortedEmployeeList() {

		List<Employee> emp = repo.getEmployeeList();
		Collections.sort(emp);
		for (Employee emp1 : emp) {
			System.out.println(emp1);
		}
	}

	/* "3. Print all the unique Employee" */

	public Map<Integer, Employee> UniqueDetail() {

		List<Employee> empl = repo.getEmployeeList();
		Map<Integer, Employee> map = new HashMap<>();

		for (Employee e1 : empl) {
			map.put(e1.empId, e1);
		}
		return map;
	}

	/* 4. Print all the unique Employee By Sorting */

	public void UniqueSorted() {
		Service eService = new Service();
		Map<Integer, Employee> map = eService.UniqueDetail();
		List<Employee> emps = new ArrayList<>(map.values());
		Collections.sort(emps, new NameComp());
		for (Employee employee : emps) {
			System.out.println(employee);
		}
	}

	/* 5. Print Employee details by EmpId " */

	public boolean DetailByID(Integer empId) {

		List<Employee> empl = repo.getEmployeeList();
		Employee employee = new Employee();
		boolean check = false;
		for (Employee e1 : empl) {
			if (e1.getEmpId().equals(empId)) {
				check = true;
				System.out.println(e1.getEmpId() + " , " + e1.getEmpName() + " , " + e1.getSalary());
			}
		}
		return check;
	}

	/* 6. Print Employee details by Salary */

	public void EmployeeDetailsBySalary() {

		List<Employee> empList = repo.getEmployeeList();
		Collections.sort(empList, new SalaryComp());
		System.out.println("Sorted List Entries by Salary");
		for (Employee e : empList) {
			System.out.println(e.empId + " " + e.empName + " " + e.salary);
		}
	}

	/* 7. Insert New Employee*/
	
	public void addEmployee(Employee employee) {
		repo.insertData(employee);
	}

	/*8 Retrieve and Update Employee Detail*/

	public List<Employee> getEmployeeDetail() {
		List<Employee> empl = repo.getEmployeeList();
		return empl;
	}

	/*9 Delete Employee by Id*/
	
	public boolean deleteEmployee(int empId) {
		boolean check = false;
		List<Employee> list = repo.deleteEmployee();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getEmpId().equals(empId)) {
				check = true;
				list.remove(i);

			}
		}
		return check;

	}

}
