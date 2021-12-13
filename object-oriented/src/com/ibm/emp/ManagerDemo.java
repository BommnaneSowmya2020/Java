package com.ibm.emp;
public class ManagerDemo extends EmployeeDemo {
	private double commission;

	public ManagerDemo() {
		// TODO Auto-generated constructor stub
		super();
	}

	public ManagerDemo(String empName, double salary, double commission) {
		super(empName, salary);
		// TODO Auto-generated constructor stub
		this.commission = commission;
	}

	@Override
	public void payslip() {
		// TODO Auto-generated method stub
		super.payslip();
		System.out.println("commission: " + commission);
	}
	
	
	
	
	
	

	
	

}
