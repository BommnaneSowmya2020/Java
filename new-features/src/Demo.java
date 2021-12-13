
public class Demo<S> {
	private S data;
	
	public Demo(S data) {
		this.data = data;
	}

public S getData() {
		return data;
	}

public void setData(S data) {
		this.data = data;
	}



	public static void main(String[] args) {
		Demo<String> d1 = new Demo<String>("Hello");
//         d1.setData(3.14);
		System.out.println(d1.getData());
		
		Demo<Integer> d2= new Demo<Integer>(1000);
//	d2.setData("aaa");
		System.out.println(d2.getData());

	}

}
