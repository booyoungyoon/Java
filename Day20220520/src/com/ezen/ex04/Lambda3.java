package com.ezen.ex04;

interface Printable3{ void print(String s); }//람다

public class Lambda3 {

	public static void main(String[] args) {
		Printable3 prn = (s) -> System.out.println(s);
		prn.print("java is lambda5!!");
	}
}
