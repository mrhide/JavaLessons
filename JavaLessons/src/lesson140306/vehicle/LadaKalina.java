package lesson140306.vehicle;

public class LadaKalina extends Car {

	public LadaKalina() {
		super(new Vaz14(), new Wheel[4]);
	}

	@Override
	protected Wheel createWheel() {
		return new Pirelli();
	}
	
}
