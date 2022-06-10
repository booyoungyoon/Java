package com.ezen.ex02;

import com.ezen.ex02.Box;

class Box<T> {
	private T ob;
	
	public void set(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
}

public class BoxInBox {
	

	public static void main(String[] args) {
	Box<String> sBox = new Box<>();
		
		sBox.set("Apple");
		
		Box<Box<String>> wBox = new Box<>();
		wBox.set(sBox);
		
		Box<Box<Box<String>>> zBox = new Box<>();
		
		zBox.set(wBox);
		
		System.out.println(zBox.get().get().get());
	}
}