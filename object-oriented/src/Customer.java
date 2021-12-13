
public class Customer {
	private int custId;
	private String custName;
	private double creditLimit;
	
	private static int counter;
	static {
		System.out.println("Customer class loaded...");
		counter = 200;
	}
	
	public Customer() {
		
	}

	public Customer(int custId, String custName, double creditLimit) {
         this.custId = counter ++;
		this.custName = custName;
		this.creditLimit = creditLimit;
	
	}
	


	public void card() {
		 System.out.println("custId:" + custId);
		 System.out.println("custName:" +  custName);
		 System.out.println("creditLimit:" + creditLimit);
	 }

}
