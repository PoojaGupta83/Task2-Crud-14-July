package Task3;

import java.util.*;

import Task3.Service;

@SuppressWarnings("unused")
public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Employee Details");
		System.out.println("1. Print Employee List");
		System.out.println("2. Print Employee List in Sorting Order");
		System.out.println("3. Print all the unique Employee");
		System.out.println("4. Print all the unique Employee By Sorting");
		System.out.println("5. Print Employee details by EmpId ");
		System.out.println("6. Print Employee List by Salary ");
		System.out.println("7. Insert New  Employee");
		System.out.println("8. Retrieve and Update Employee Details ");
		System.out.println("9. Delete Employee Details");
		System.out.println("10. Exit");

		Service service = new Service();
		System.out.println("Enter the option");

		while (true) {
			int option = sc.nextInt();
			switch (option) {
			case 1:
				service.showList();
				break;
			case 2:
				service.SortedEmployeeList();

			case 3:
				System.out.println(service.UniqueDetail());
				break;

			case 4:
				service.UniqueSorted();
				break;

			case 5:
				System.out.println("Enter employee id");
				Integer o = sc.nextInt();
				service.DetailByID(o);
				break;

			case 6:
				service.EmployeeDetailsBySalary();
				break;

			case 7:
				System.out.println("Enter New Employee Id:");
				int empId = sc.nextInt();
				System.out.println("Enter New Employee Name:");
				String empName = sc.next();
				System.out.println("Enter Employee Salary");
				int salary = sc.nextInt();
				Employee employee = new Employee(empId, empName, salary);
				service.addEmployee(employee);
				break;

			case 8:
				List<Employee> emp = service.getEmployeeDetail();
				System.out.println(emp);
				break;

			case 9:
				System.out.println("Enter Employee Id");
				Integer empId1 = sc.nextInt();
				boolean check = service.deleteEmployee(empId1);
				if (!check) {
					System.out.println("Employee not exist");
				}

				break;
			case 10:
				System.out.println("Exit");
				break;

			default:
				System.out.println("Option not found");
			}
		}
	}
}
