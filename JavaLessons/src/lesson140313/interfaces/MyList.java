package lesson140313.interfaces;

import java.util.Iterator;

public class MyList implements SimpleList {

	private static class Node {

		Object data;
		Node next;

		public Node(Object data, Node next) {
			this.data = data;
			this.next = next;
		}

	}

//	private static class ListIterator implements Iterator {
//
//		public ListIterator(Node first) {
//			nextElement = first;
//		}
//
//		private Node nextElement;
//
//		@Override
//		public boolean hasNext() {
//			return nextElement != null;
//		}
//
//		@Override
//		public Object next() {
//			Object data = nextElement.data;
//			nextElement = nextElement.next;
//			return data;
//		}
//
//		@Override
//		public void remove() {
//		}
//	}

	private Node first;
	private Node last;

	// @Override
	// public Node first() {
	// return null;
	// }

	@Override
	public void add(Object data) {
		Node node = new Node(data, null);
		if (first == null) {
			first = node;
		}
		if (last != null) {
			last.next = node;
		}
		last = node;
	}

	@Override
	public Iterator iterator() {
//		return new ListIterator(first);
		return new Iterator() {

			private Node nextElement;
			
			{
				nextElement = first;
			}

			@Override
			public boolean hasNext() {
				return nextElement != null;
			}

			@Override
			public Object next() {
				Object data = nextElement.data;
				nextElement = nextElement.next;
				return data;
			}

			@Override
			public void remove() {
			}
		};
	}

	public static void main(String[] args) {
		SimpleList list = new MyList();
		list.add("one");
		list.add(1);
		list.add("three");

		// Node current = list.first();
		// while (current != null) {
		// System.out.println(current.data);
		// current = current.next;
		// }

		for (Object object : list) {
			System.out.println(object);
		}

		Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
