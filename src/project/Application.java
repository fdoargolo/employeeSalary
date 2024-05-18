package project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		List<Employee> employees = new ArrayList<>();
		
		System.out.print("Enter the number of employees:");
		int numberEmployees = scanner.nextInt();
		scanner.nextLine();
		
		for(int i = 1; i <= numberEmployees; i++) {
			System.out.println("Employee #" + i + " data:");
			System.out.print("Outsourced (y/n)?");
			String answer = scanner.next();
			scanner.nextLine();
			System.out.print("Name: ");
			String employeeName = scanner.nextLine();
			System.out.print("Hours:");
			int employeeHours = scanner.nextInt();
			scanner.nextLine();
			System.out.print("Value per hour:");
			double valueHour = scanner.nextDouble();
			
			if(answer.equals("y")) {
				System.out.print("Additional charge:");
				double additionalCharge = scanner.nextDouble();
				Employee employee = new OutsourcedEmployee(employeeName, employeeHours, valueHour, additionalCharge);
				employees.add(employee);
			}else {
				Employee employee = new Employee(employeeName, employeeHours, valueHour);
				employees.add(employee);
			}
	
		}
		
		scanner.close();
		System.out.println("\nPAYMENTS:");
		
		for(Employee x: employees) {
			System.out.println(x);
		}
		
	}

}
