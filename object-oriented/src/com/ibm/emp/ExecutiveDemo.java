package com.ibm.emp;
public class ExecutiveDemo extends EmployeeDemo {
 private double incentives;

public ExecutiveDemo() {
	super();
}

public ExecutiveDemo(String empName, double salary, double incentives) {
	super(empName, salary);
	this.incentives = incentives;
	
}

@Override
public void payslip() {
	// TODO Auto-generated method stub
	super.payslip();
	System.out.println("incentives: " + incentives);
}

@Override
public double getSalary() {
	// TODO Auto-generated method stub
	return super.getSalary() + incentives;
}
 

}
