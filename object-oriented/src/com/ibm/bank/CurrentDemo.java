package com.ibm.bank;
public  class CurrentDemo extends AccountDemo {
	private double overdraft;
	 public CurrentDemo() {
		// TODO Auto-generated constructor stub
	}
		
	
public CurrentDemo(String name) {
		super(name,INIT_CURRENT_BAL);
		
		overdraft = OVERDRAFT_LIMIT;
	}

@Override
	public void deposit(double amount) {
		overdraft += amount;
		if(overdraft > OVERDRAFT_LIMIT) {
			balance += overdraft -OVERDRAFT_LIMIT;
			overdraft = OVERDRAFT_LIMIT;
		}
		
	}

	@Override
	public void withdraw(double amount) throws BalanceException {
		if(amount <= (balance + overdraft)) {
			balance -=amount;
			if(balance < MIN_CURRENT_BAL) {
				overdraft += balance;
				balance = MIN_CURRENT_BAL;
			
			}
			else
				throw new BalanceException("Insuffient balance");
		}
			
		
	}
	
		
	}

	


