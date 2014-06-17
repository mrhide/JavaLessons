package lesson140327.inner;

public class D {
	
	int state;
	
	public Printer getPrinter() {
		return new Printer() {

			@Override
			public void PrintState() {
				System.out.println(state);
			}
			
		};
	}
	
}
