package Application;

import java.util.Scanner;

import entities.Address;
import entities.Department;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome do departamento: ");
		String departmentName = sc.next();
		System.out.print("Dia do pagamento: ");
		int payDay = sc.nextInt();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Telefone: ");
		String phone = sc.next();
		System.out.print("Quantos funcionários tem o departamento? ");
		int n = sc.nextInt();
		System.out.println();
		
		Department dept = new Department(departmentName, payDay, new Address(email, phone));
		
		for (int i=0; i<n; i++) {
			System.out.println("Dados do funcionário " + (i+1) + ": ");
			System.out.print("Nome: ");
			sc.nextLine();
			String employeeName = sc.nextLine();
			System.out.print("Salário: ");
			double salary  = sc.nextDouble();
			Employee employee = new Employee(employeeName, salary);
			dept.addEmployee(employee);
			System.out.println();
		}
		
		showReport(dept);
		
		sc.close();

	}
	
	private static void showReport(Department dept) {
		StringBuilder sb = new StringBuilder();
		sb.append("FOLHA DE PAGAMENTO: \n");
		sb.append("Departamento Vendas = R$ " + String.format("%.2f", dept.payroll()) + "\n");
		sb.append("Pagamento realizado no dia " + dept.getPayDay() + "\n");
		sb.append("Funcionários: \n");
		for (Employee e : dept.getEmployee()) {
			sb.append(e.getName() + "\n");
		}
		sb.append("Para dúvidas favor entrar em contato: vendas@lojatop.com \n");
		System.out.println(sb.toString());;
	}

}
