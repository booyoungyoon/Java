package com.ezen01;

final class Card {
	String kind;
	int num;
	
	Card(){
		this("SPADE", 1);
	}
	Card(String kind, int num){
		this.kind = kind;
		this.num = num;
	}
	public String toString() {
		return kind + ":" + num;
	}
}
public class ClassEx01 {

	public static void main(String[] args) throws Exception {
		Card c = new Card("HEART", 3);
		Card c2 = Card.class.newInstance();
		Class c0bj = c.getClass();
		
		System.out.println(c);
		System.out.println(c2);
		System.out.println(c0bj.getName());
		System.out.println(c0bj.toGenericString());
		System.out.println(c0bj.toString());
	}

}
