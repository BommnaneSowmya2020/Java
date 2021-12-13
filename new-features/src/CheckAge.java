import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class CheckAge {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the data: ");
		String d = sc.next();
		
		LocalDate d1 = LocalDate.now();
		LocalDate d2 = LocalDate.parse(d);
		System.out.println(Period.between(d2, d1).getYears());
		
		
		

	}

}
