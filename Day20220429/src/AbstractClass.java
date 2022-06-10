
public class AbstractClass {

	public static void main(String[] args) {
		Product pro = new Audio();
		System.out.println(pro.price);
		pro.test();
	}

}

abstract class Product{
	int price;
	
	Product(int price) {
		this.price = price;
	}
	void test() {
		System.out.println("Product");
	}
	abstract void func(); // 추상메소드
}
class Tv extends Product {
	Tv() { super(100); }
	
	public String toString() { return "Tv"; }

	@Override
	void func() {
	}
}
class Computer extends Product{
	Computer() { super(200); }
	
	public String toString() {return"Computer";}

	@Override
	void func() {
	}
}
class Audio extends Product {
	Audio() { super(50); }
	
	public String toString() { return "Audio"; }

	@Override
	void func() {
	}
}