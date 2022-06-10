package com.ezen;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Exercise7_19 {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		
		b.summary();
	}

}
class Buyer{
	int money = 1000;
	Product[] cart = new Product[3];
	int i=0;
	
	void buy(Product p) {
		if(money>p.price) {
			money = money-p.price;
			add(p);
		}else
			System.out.println("잔액이 부족하여 " + p + "을/를 살수 없습니다.");
	}
	void add(Product p) {
		if(i>=cart.length) {
			Product[] cart2 = new Product[cart.length*2];
//			System.arraycopy(cart, 0, cart2, 0, cart.length);
			cart2 = Arrays.copyOf(cart, cart2.length);
			cart=cart2;
		}
			cart[i++]=p;
		}
	void summary() {
		int sum=0;
		System.out.println(Arrays.toString(cart));
		for(int i=0;i<cart.length;i++) {
			sum += cart[i].price;
		}
		System.out.println("구입한 물건 : " + cart[0] + "," + cart[1] + ","+cart[2]+","+cart[3]+
				","+cart[4]+","+cart[5]);
		System.out.println("사용한 금액 : " + sum);
		System.out.println("남은 금액 : " + money);
	}
}
class Product{
	int price;
	
	Product(int price) {
		this.price = price;
	}
}
class Tv extends Product {
	Tv() { super(100); }
	
	public String toString() { return "Tv"; }
}
class Computer extends Product{
	Computer() { super(200); }
	
	public String toString() {return"Computer";}
}
class Audio extends Product {
	Audio() { super(50); }
	
	public String toString() { return "Audio"; }
}