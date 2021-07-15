package Task3;

import java.util.*;

public class Employee implements Comparable<Employee> {
	Integer empId;
	String empName;
	Integer salary;

	public Employee(Integer empId, String empName, Integer salary) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}

	public Integer getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public Integer getSalary() {
		return salary;
	}

	public Employee() {
	}

	@Override
	public String toString() {
		return "{" + empId + ", " + "'" + empName + "'" + "," + salary + "}";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null)
			return false;
		Employee employee = (Employee) o;
		if ((employee.empId == this.empId) && (employee.empName == this.empName) && (employee.salary == this.salary))
			;
		return true;
	}

	@Override
	public int hashCode() {
		return Objects.hash(empId, empName, salary);
	}

	@Override
	public int compareTo(Employee employee) {
		return this.empId - employee.empId;
	}

}
