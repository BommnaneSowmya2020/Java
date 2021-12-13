

import com.ibm.shop.Product;
import com.ibm.shop.ShoppingCart;

public class Testproduct {

	public static void main(String[] args) {
		
		ShoppingCart cart = new ShoppingCart();
		Product prod1 = new Product("iphone",56000);
		Product prod2 = new Product("ipad" , 30500);
		
		cart.addItem(prod1);
		cart.addItem(prod2);
		cart.addItem(new Product("iwatch",21500));
		
		cart.checkout();
		
		
		

	}

}
