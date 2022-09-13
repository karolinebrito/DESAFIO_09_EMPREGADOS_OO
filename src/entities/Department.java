package entities;

import java.util.ArrayList;
import java.util.List;

public class Department {
	
	private String name;
	private int payDay;
	
	private Address adress;
	
	private List<Employee> employee = new ArrayList<>();
	
	public Department() {
	}

	public Department(String name, int payDay, Address adress) {
		this.name = name;
		this.payDay = payDay;
		this.adress = adress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPayDay() {
		return payDay;
	}

	public void setPayDay(int payDay) {
		this.payDay = payDay;
	}

	public Address getAdress() {
		return adress;
	}

	public void setAdress(Address adress) {
		this.adress = adress;
	}

	public List<Employee> getEmployee() {
		return employee;
	}
	
	public void addEmployee(Employee employee) {
		this.employee.add(employee);
	}
	
	public void removeEmployee(Employee employee) {
		this.employee.remove(employee);
	}
	
	public double payroll() {
		double sum = 0;
		for (Employee e : employee) {
			sum += e.getSalary();
		}
		return sum; 
	}

}
