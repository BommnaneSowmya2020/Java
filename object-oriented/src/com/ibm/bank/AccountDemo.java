package com.ibm.bank;

public abstract class AccountDemo implements Bank{
	private int actNo;
	private String name;
	protected double balance;
	
	private static int autogen = INIT_ACCOUNT_NO;
	
	public AccountDemo() {
}

	public AccountDemo(String name, double balance) {
		super();
		this.actNo = autogen ++;
		this.name = name;
		this.balance= balance;
	}
	public void summary() {
		System.out.println("actNo: " + actNo);
		System.out.println("name: " + name);
		System.out.println("balance: " + balance);
		
	}
	public void deposit(double amount) {
		balance += amount;
	}
		
		public void withdraw(double amount) throws BalanceException {
		}

		public double getBalance() {
			return balance;
		}

}
