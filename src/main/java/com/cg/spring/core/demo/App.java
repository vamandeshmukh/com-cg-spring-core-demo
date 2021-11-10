package com.cg.spring.core.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.spring.core.demo.model.Employee;

/**
 * 
 * @author Vaman Deshmukh Spring core demo project for CG trainees
 *
 */

public class App {

	public static void main(String[] args) {

		System.out.println("Start");

		ApplicationContext ctx = new ClassPathXmlApplicationContext("SpringConfig.xml");

//		Employee emp = new Employee(101, "Sonu", 10.6);

		Employee emp = ctx.getBean(Employee.class);

		System.out.println(emp.toString());

		((AbstractApplicationContext) ctx).close();

		System.out.println("End");

	}
}
