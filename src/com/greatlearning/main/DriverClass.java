package com.greatlearning.main;

import com.greatlearning.department.AdminDepartment;
import com.greatlearning.department.HrDepartment;
import com.greatlearning.department.TechDepartment;

public class DriverClass {

	// starting point of department application
	public static void main(String[] args) {

		HrDepartment hrDepartment = new HrDepartment();

		TechDepartment techDepartment = new TechDepartment();

		AdminDepartment adminDepartment = new AdminDepartment();

		// Admin Department
		System.out.println("Welcome to " + adminDepartment.departmentName());

		System.out.println(adminDepartment.getTodaysWork());

		System.out.println(adminDepartment.getWorkDeadline());

		System.out.println(adminDepartment.isTodayAHoliday());

		System.out.println();

		// HR Department
		System.out.println("Welcome to " + hrDepartment.departmentName());

		System.out.println(hrDepartment.doActivity());

		System.out.println(hrDepartment.getTodaysWork());

		System.out.println(hrDepartment.getWorkDeadline());

		System.out.println(hrDepartment.isTodayAHoliday());

		System.out.println();

		// Tech Department
		System.out.println("Welcome to " + techDepartment.departmentName());

		System.out.println(techDepartment.getTodaysWork());

		System.out.println(techDepartment.getWorkDeadline());

		System.out.println(techDepartment.getTechStackInformation());

		System.out.println(techDepartment.isTodayAHoliday());

	}

}
