package lesson140227;

public class UseGH {
	public static void main(String[] args) {
		G g = new G();
		H h = new H();
		
		g.h = h;
		g.doIt();
		
	}
}
