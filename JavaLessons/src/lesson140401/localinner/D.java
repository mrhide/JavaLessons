package lesson140401.localinner;

public class D {
	
	int state;

	public class Inner implements I {

		@Override
		public void doIt() {
			System.out.println("I did it from inside! " + state);
		}

	}

	public I getI() {
		return new Inner();
	}
	
}
