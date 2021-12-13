import com.ibm.emp.EmployeeDemo;
import com.ibm.emp.ExecutiveDemo;
import com.ibm.emp.ManagerDemo;

public class TestEmployeeDemo {

	public static void main(String[] args) {
		
            
            ManagerDemo md = new ManagerDemo("hira", 7000,5000);
            ExecutiveDemo ed1 = new ExecutiveDemo("hari", 3000, 1000);
             
            showSalary(md);
            showSalary(ed1);
            }
	
	// polymorphism
	private static void showSalary(EmployeeDemo ed) {
		if(ed instanceof ManagerDemo)
		System.out.println("ManagerDemo Salary :" + ed.getSalary());
		else
			System.out.println("EXecutiveDemo Salary: "+ ed.getSalary());
	}
            
	}
	
	     //Method overloading
	//private static void showSalary(ExecutiveDemo ed1) {
	//	System.out.println("Executive Salary: " + ed1.getSalary());
	//} //using abstract

	//private static void showSalary(ManagerDemo md) {
	//	System.out.println("ManagerDemo Salary: " + md.getSalary());
		
	
	
            
            
            
            
           
	


