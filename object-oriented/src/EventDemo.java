
class EventImpl implements Event {

	@Override
	public void doSomething() {
		System.out.println("Class level implementation");
	}
	}


	
	public class EventDemo{
	class InnerEventImpl implements Event{

		@Override
		public void doSomething() {
			System.out.println("Inner class implementation");
			
		}
	}
	
	public static class StaticInnerEventImpl implements Event{

		@Override
		public void doSomething() {
			System.out.println("Static inner class implements");
			
		}
		
	}
	
	public void nestedEvent( ) {
		class NestedEventImpl implements Event{

			@Override
			public void doSomething() {
				System.out.println("Nested Event Implementation");
				
			}
			
		};
		new NestedEventImpl().doSomething();
	}
	public void oneMoreEvent() {
		
	}
		public void oneLastEvent() {
			Event e = () ->System.out.println("Lambda event implementation");
			e.doSomething();
			
				
				
				
				
				
				
				
			
		
	}
	
public static void main(String[] args) {
	EventImpl ei = new EventImpl();
	ei.doSomething();
	
	EventDemo ed = new EventDemo();
	InnerEventImpl ie = ed.new InnerEventImpl();
	ie.doSomething();
	
	EventDemo.StaticInnerEventImpl si = new EventDemo.StaticInnerEventImpl();
	si.doSomething();
	ed.nestedEvent();
	ed.oneLastEvent();
	}
	}




