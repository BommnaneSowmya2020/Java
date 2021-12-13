
public class ChildDemo<S, R> extends Demo<S> {
	private R temp;

	public ChildDemo(S data , R temp) {
		super(data);
		this.temp = temp;
		
	}
	

	public R getTemp() {
		return temp;
	}


	public void setTemp(R temp) {
		this.temp = temp;
	}


	public static void main(String[] args) {
     ChildDemo<String, Integer> cd1 = new ChildDemo<String , Integer>("Warangal", 123);
	System.out.println(cd1.getData() + "=" + cd1.getTemp());
	}
	

}
