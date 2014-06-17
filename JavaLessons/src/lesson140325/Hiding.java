package lesson140325;

public class Hiding {

	public static void main(String[] args) {
		H h = new H();
		System.out.println(h.state);
		h.changeState();
		System.out.println(h.state);
	}
	
}
