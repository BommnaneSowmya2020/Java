package com.ibm.emp;

public abstract class EmployeeDemo {
private int empNo;
private String empName;
private double salary;

private static int counter;

static {
	System.out.println("Employee class loaded...");
	counter=1001;
}

public EmployeeDemo() {
	
}

public EmployeeDemo(String empName, double salary) {
	super();
	this.empNo = counter ++;
	this.empName = empName;
	this.salary = salary;
}
public void payslip() {
	System.out.println("EmpNo: " + empNo);
	System.out.println("EmpName: " + empName);
	System.out.println("Salary: " + salary);
}

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}


}

