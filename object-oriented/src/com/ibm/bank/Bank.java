package com.ibm.bank;

public interface Bank {
	int INIT_ACCOUNT_NO = 12345;
	double MIN_SAVINGS_BAL =1000;
	 double INIT_CURRENT_BAL=50000;
	 double MIN_CURRENT_BAL = 100;
	 double OVERDRAFT_LIMIT = 10000;
	 
	 void summary();
	 
	 void deposit(double amount);
	 
	 void withdraw(double amount) throws BalanceException;
	 
	 double getBalance();

	
	

}
