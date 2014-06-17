package lesson140408.classwork;

import lesson140408.exceptions.List;

public class Queue extends List {

	public static class QueueOverflow extends Exception {

		private Object _item;

		public QueueOverflow(Object item) {
			_item = item;
		}

		public Object getItem() {
			return _item;
		}

	}

	public static class QueueUnderflow extends Exception {

	}

	int count;
	private int _maxsize;

	public Queue(int maxsize) {
		_maxsize = maxsize;
	}

	public void put(Object item) throws QueueOverflow {
		if (count == _maxsize) {
			throw new QueueOverflow(item);
		}
		super.add(item);
		count++;
	}

	@Override
	public void add(Object item) {
		throw new UnsupportedOperationException();
	}

	public Object take() throws QueueUnderflow {

		// взять первый элемент
		// если пустой, то exception
		// иначе
		// сделать первым следующий
		// скорректировать размер
		// вернуть данные из бывшего первого

		if (first == null) {
			throw new QueueUnderflow();
		}

		Node n = first;
		first = n.next;
		count--;
		return n.data;

	}

	public Object head() {
		return first.data;
	}

	public Object tail() throws QueueUnderflow {
		if (last == null) {
			throw new QueueUnderflow();
		}
		return last.data;
	}

	public boolean isEmpty() {
		return first == null;
	}

	public int size() {
		return 0;
	}

	public static void main(String[] args) {
		Queue queue = new Queue(1);
		// queue.head();
		try {
			queue.put("one");
			queue.put("two");
		} catch (QueueOverflow e) {
			System.out.println("Queue is full, cant put " + e.getItem());
		}
	}

}
