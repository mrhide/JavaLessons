package lesson140513.generics;

public class GenericExample {

	static class Box<E> {  // Generic class (type)
		
		/*
		 * E - element
		 * K - key
		 * N - number
		 * T - type
		 * V - value
		 * S, U, X ... - 
		 */
		
		private E object;

		public E get() {
			return object;
		}

		public void set(E object) {
			this.object = object;
		}		
	}
	
	static class BoxOfString extends Box<String> {
		
	}
	
	public static void main(String[] args) {
		Box<String> box = new Box<>(); // parameterized type
		
		box.set("hello");
		String s = box.get();
		System.out.println(s);
		
		BoxOfString bos = new BoxOfString();
		
		bos.set("hello");
		
		String s2 = bos.get();
	}
	
}
