package com.credentials.main;

import java.util.Scanner;

import com.credentials.model.Employee;
import com.credentials.service.Credential;

public class DriverClass {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Hi Employee,Welcome to credential generation system.");

		System.out.println("Enter Your First Name.");
		String firstName = scan.nextLine();

		System.out.println("Enter your Last Name.");
		String lastName = scan.nextLine();

		Employee e1 = new Employee(firstName, lastName);
		String deptName = null;
		do {
			System.out.println("Please Enter the Department from the following ");
			System.out.println("1. Technical \n2. Admin \n3. Humal Resource \n4. Legal");

			int dept = scan.nextInt();
			Credential cred = new Credential();
			switch (dept) {
			case (1): {
				cred.showCredentials(e1, "Technical");
				break;
			}
			case (2): {
				cred.showCredentials(e1, "Admin");
				break;
			}
			case (3): {
				cred.showCredentials(e1, "HumanResource");
				break;
			}
			case (4): {
				cred.showCredentials(e1, "Legal");
				break;
			}
			default: {
				System.out.println("Dear " + e1.getFirstName() + " please provide valid Department ID");
				deptName = "invalid";
				break;
			}
			}
			if (dept > 0 && dept < 5)
				deptName = "valid";
		} while (deptName.equals("invalid"));

	}

}
