package lesson140513.generics;

import lesson140513.generics.GenericExample.Box;

public class TwoTypeParameters {

	interface Pair<K, V> {
		K getKey();

		V getValue();
	}

	static class ConcretePair<K, V> implements Pair<K, V> {

		private K key;
		private V value;

		@Override
		public K getKey() {
			return key;
		}

		@Override
		public V getValue() {
			return value;
		}

	}
	
	static class IntegerStringPair implements Pair<Integer, String> {

		@Override
		public Integer getKey() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String getValue() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
	
	static class IntegerSomethingPair<Value> implements Pair<Integer, Value> {

		@Override
		public Integer getKey() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Value getValue() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
	
	public static void main(String[] args) {
		
		ConcretePair<Integer, Float> p1 = new ConcretePair<>();
		
		IntegerStringPair p2 = new IntegerStringPair();
		
		IntegerSomethingPair<Runnable> p3 = new IntegerSomethingPair<>();
		
		IntegerSomethingPair<String> p4 = new IntegerSomethingPair<>();
		
		ConcretePair<Integer, Box<String>> p5 = new ConcretePair<>();
		
		
		Box<String> b = new Box<>();
		
		b.set("hello");
		
		p5.key = 10;
		p5.value = b;
		
	}

}
