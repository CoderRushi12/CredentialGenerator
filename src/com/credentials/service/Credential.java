package com.credentials.service;

import java.util.Random;

import com.credentials.model.Employee;

public class Credential {

	private static final String companyName = "MyCompany";

	private String generatePassword() {
		Random r1 = new Random();
		String password = "";

		for (int i = 0; i < 8; i++) {
			password = password + (char) (r1.nextInt((127 - 33) + 1) + 33);
		}
		return password;
	}

	private String generateEmailAddress(Employee e1, String dept) {
		return e1.getFirstName().toLowerCase() + e1.getLastName().toLowerCase() + "@" + dept.trim().toLowerCase() + "." + companyName
				+ ".com";
	}

	public void showCredentials(Employee e1, String dept) {
		System.out.println("Dear " + e1.getFirstName() + " your generated credentials are as follows");
		System.out.println("Email    --->" + this.generateEmailAddress(e1, dept));
		System.out.println("Password --->" + this.generatePassword());
	}
}
