import com.ibm.se.Broker;
import com.ibm.se.Exchange;
import com.ibm.se.Holder1;
import com.ibm.se.Stock1;

public class TestStock1 {

	public static void main(String[] args) {
		
		Stock1 ril = new Stock1();
		Holder1 h = ril;
		Broker b = ril;
		Exchange e = ril;
	}

}
