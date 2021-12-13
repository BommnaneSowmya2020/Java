
public class TestRays {

	public static void main(String[] args) {
		Alfa a = new Alfa();
		a.demo();
		
		

		Beta b = new Beta();
		b.show();
		b.demo();
		
		Alfa ab = b;
		ab.demo();
		ab.show();

		Beta ba = (Beta) ab;
		Gama g = new Gama();
		g.show();
		Beta bg = g;
		bg.show();

	}

}
