package lesson140401.localinner;

public class C implements X {
	
	public static class StaticInner implements I {

		@Override
		public void doIt() {
			System.out.println("I did it from static inner");
		}

	}

	public Object getI() {
		return new StaticInner();
	}

	@Override
	public void doIt() {
		// TODO Auto-generated method stub
		
	}
}
