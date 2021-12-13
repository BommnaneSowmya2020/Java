package com.ibm.bank;
public class SavingDemo extends AccountDemo {

	public SavingDemo() {

	}

	public SavingDemo(String name) {
		super(name, MIN_SAVINGS_BAL);
		
	}

	@Override
	public void withdraw(double amount) throws BalanceException {
		if(amount <= getBalance() -  MIN_SAVINGS_BAL)
			balance -= amount;
		else
			throw new BalanceException("Insufficent balance!");
	}

	
 
	
	

	
	
	
	
}
