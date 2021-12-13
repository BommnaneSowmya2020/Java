import com.ibm.xe.CurrencyConverter;
import com.ibm.xe.Dollar;
import com.ibm.xe.Rupees;

public class TestCurrency {

	public static void main(String[] args) {
		
		Dollar usd = new Dollar();
		Rupees inr =new Rupees();
		CurrencyConverter cc = new CurrencyConverter();
		
		System.out.println(cc.converter(100, usd, inr));
		System.out.println(cc.converter(4000, usd, inr));
		


	}

}
