package com.ezen.ex10;

class Box<T>{
	protected T ob;
	public T getOb() {	return ob;	}
	public void setOb(T ob) {	this.ob = ob;	}
	
	@Override
	public String toString() {
		return ob.toString();
	}
}

class Unboxer{
	public static <T> void peekBox(Box<? super Integer> box) {//Integer, Number, Object
		System.out.println(box);
	}
}
public class LowerBoundedWildcard {

	public static void main(String[] args) {
		Box<Integer> box = new Box<>();
		box.setOb(123);
		System.out.println(box.getOb());
//		Unboxer.peekBox(box);
	}

}
