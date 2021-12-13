import com.ibm.lib.Book;
import com.ibm.lib.Member;

public class TestLibrary {

	public static void main(String[] args) {
	Book b1 = new Book("The Abcde");
	Member m1 = new Member("Jack");
	Book b2 = new Book("Time Machine");
	
	b1.status();
	m1.status();
	
	b1.issueBook(m1);
	
	b1.status();
	m1.status();
	
	b1.issueBook(m1);
	b2.issueBook(m1);
	
	b2.returnBook(m1);
	}

}
