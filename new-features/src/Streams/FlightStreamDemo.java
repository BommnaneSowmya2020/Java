package Streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlightStreamDemo {

	public static void main(String[] args) throws Exception {
		List<Flights> flights = null;
		
		Stream<String> lines = Files.lines(Paths.get("src/flights.txt"));
		flights = lines.map(l -> {
			String[] a =l.split(",");
			return new Flights(Integer.parseInt(a[0]), a[1], a[2],a[3]);
		}).collect(Collectors.toList());
		flights.forEach(System.out::println);
		
		//print details of flight no 123
		
		flights.forEach(k -> {
			if(k.getCode()==123) {
				System.out.println(k);}});
		
		//print all flights of jet carrier
		flights.forEach(k -> {
			if(k.getCarrier().equals("Jet")) {
				System.out.println(k);}}); 
		
		//print flight by their route
		
		flights.forEach(k -> {
			if(k.getSource().equals("Hyderabad")) {
				System.out.println(k);}});
			
			
			
		
	}
}

			
			
		
		
	


