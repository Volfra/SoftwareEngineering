package co.edu.poli.employee.view;

import java.util.Scanner;

import co.edu.poli.employee.controller.EmployeeController;

public class Cliente {
		
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

		System.out.println("Input id employee");
		String txtId = s.nextLine();
		System.out.println("Input name employee");
		String txtName = s.nextLine();
		System.out.println("Input address employee");
		String txtAddress = s.nextLine();
		
		EmployeeController ec = new EmployeeController(txtId, txtName, txtAddress);
		
		ec.eventAdd();	
		System.out.println(ec.eventReadAll());
		
		s.close();
	}

}
