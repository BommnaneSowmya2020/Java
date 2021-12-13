
public class CarDemo {
	private String model;
	private String[] features;
	public CarDemo(String model, String... features) { //arrays in the from of ....varargs
		this.model = model;
		this.features = features;
	}
	public void specs() {
		System.out.println("Features of " + model);
		for(String f : features)
			System.out.println(f);
	}
	
	public static void main(String[] args) {
		CarDemo cd = new CarDemo("Shift", "Big","Abs");
		cd.specs();
	}
	}


