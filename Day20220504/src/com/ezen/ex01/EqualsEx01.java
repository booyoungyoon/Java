package com.ezen.ex01;

public class EqualsEx01 {

	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		if(v1.equals(v2))
			System.out.println("같음");
		else
			System.out.println("다름");
		
		v2=v1;
		if(v1.equals(v2))
			System.out.println("같음");
		else
			System.out.println("다름");
	}

}

class Value{
	int value;
	
	Value(int value){
		this.value = value;
	}
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Value) {
			return value == ((Value)obj).value;
		}
		return false;
	}
}