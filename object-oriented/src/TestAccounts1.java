

import com.ibm.bank.BalanceException;
import com.ibm.bank.Bank;
import com.ibm.bank.CurrentDemo;
import com.ibm.bank.SavingDemo;

public class TestAccounts1 {

	public static void main(String[] args) {
		SavingDemo sd = new SavingDemo("Priya");
		try {
			sd.withdraw(-2000);
		} catch (BalanceException e) {
			//e.printStackTrace();// to troubleshoot the error
			System.out.println(e); // for system problems to audit
			System.out.println(e.getMessage());// to end users
			
		}
		System.out.println(sd.getBalance());
	}

}
