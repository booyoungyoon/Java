package com.ezen.ex01;
class Card{
	String kind;
	int number;
	
	Card(){
		this("SPADE", 1);
	}
	Card(String kind, int number){
		this.kind = kind;
		this.number = number;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "kind : "+kind+", number : "+number;
	}
}
public class CardToString {

	public static void main(String[] args) {
		Card c1 = new Card("red", 10);
		Card c2 = new Card();
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}

}
