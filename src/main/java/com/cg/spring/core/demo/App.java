package com.cg.spring.core.demo;

import com.cg.spring.core.demo.model.Employee;

/**
 * 
 * @author Vaman Deshmukh Spring core demo project for CG trainees
 *
 */

public class App {
	public static void main(String[] args) {
		System.out.println("Start");

		Employee emp = new Employee(101, "Sonu", 10.6);
		System.out.println(emp.toString());

		System.out.println("End");
	}
}
