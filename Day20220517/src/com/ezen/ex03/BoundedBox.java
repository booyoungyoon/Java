package com.ezen.ex03;

class Box<T extends Number> {
	private T ob;
	
	public void set(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
}
public class BoundedBox {

	public static void main(String[] args) {
		Box<Double> aBox = new Box<>();
//		Box<String> aBox = new Box<>();
		aBox.set(new Double(10.5));
		
		System.out.println(aBox.get());
	}
}
