
public class Passport extends Person {
	 private int passportNo;
	 private String Country;
	 
	 
	public Passport(String string) {
		// TODO Auto-generated constructor stub
	}

	public Passport(String Name,int Age,int passportNo, String country) {
		super(Name, Age);
		this.passportNo = passportNo;
		this.Country = country;
	}

	@Override
	public void print() {
		
		super.print();
		System.out.println("PassportNo:" + passportNo);
		System.out.println("Country: " + Country);
		
	}

	
	
	

}
