package com.ezen.ex11;

class Box<T>{
	protected T ob;
	public T getOb() {	return ob;	}
	public void setOb(T ob) {	this.ob = ob;	}
	
	@Override
	public String toString() {
		return ob.toString();
	}
}
class Toy{
	@Override
	public String toString() {
		return "I am Toy";
	}
}
class BoxHandler{
	public static void outBox(Box<? extends Toy>box) { //box에는 전달 가능 인스턴스가 Toy 또는 Toy를 상속한 아이들
		Toy t = box.getOb();
		System.out.println(t);
//		box.setOb(t);
	}
	public static void inBox(Box<Toy>box, Toy t) {
		box.setOb(t);
//		Toy t2 = box.getOb();
//		System.out.println(t2);
	}
}
public class BoundedWildcardBsse {

	public static void main(String[] args) {
		Box<Toy> box = new Box<>();
		BoxHandler.inBox(box, new Toy());
		BoxHandler.outBox(box);
	}

}
