@FunctionalInterface
public interface HelloDemo {
	String sayHello();
	
	default void sayBye( ) {
		System.out.println("Good bye!");
	}
static int random() {
	return(int)(Math.random() * 100);
}
}
