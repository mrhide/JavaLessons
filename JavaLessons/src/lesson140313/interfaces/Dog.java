package lesson140313.interfaces;

public class Dog implements Comparable<Dog> {

	String name;
	int speed;
	int furQuality;
	int weight;
	
	public Dog(String name, int speed, int furQuality, int weight) {
		super();
		this.name = name;
		this.speed = speed;
		this.furQuality = furQuality;
		this.weight = weight;
	}

	@Override
	public int compareTo(Dog o) {
		if (furQuality > o.furQuality) {
			return -1;
		}
		if (furQuality < o.furQuality) {
			return 1;
		}
		
		if (speed < o.speed) {
			return 1;
		}
		if (speed > o.speed) {
			return -1;
		}
		
		if(weight > o.weight) {
			return -1;			
		}
		if(weight < o.weight) {
			return 1;			
		}
		
		return 0;
	}
	
	
	
}
