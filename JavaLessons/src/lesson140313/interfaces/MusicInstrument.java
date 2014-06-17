package lesson140313.interfaces;

public abstract class MusicInstrument implements Cleanable {
	
	abstract public void play();
	abstract public void crash();
	
	@Override
	public void clean() {
		System.out.println("clean "+getClass().getSimpleName());
	}
	
}
