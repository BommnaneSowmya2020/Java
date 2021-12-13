
public class HelloDemo1 {

	public static void main(String[] args) {
		
		HelloDemo hd = () -> "Hello World";
		System.out.println(hd.sayHello());
		
		HelloDemo hd2 =() -> {
		String msg = "Sowmya";
		return msg;
		
	};
	System.out.println(hd2.sayHello());
	hd2.sayBye();
	System.out.println(Math.random());

	}

}
