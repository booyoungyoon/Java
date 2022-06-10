package com.ezen.ex04;

interface Printable4{ void print(String s); }//람다

interface Calculate {
	void cal(int n1, int n2);
}
class Cal implements Calculate{

	@Override
	public void cal(int n1, int n2) {
		System.out.println(n1+n2);
	}
	
} //ctrl+shift+{ 화면 분할해서 2개로 보기
public class Lambda4 {
	public static void main(String[] args) {
		Printable4 prn;
		
		prn = (String s) -> { System.out.println(s); };
		prn.print("java is lambda1!!");
		
		prn = (String s) -> System.out.println(s);
		prn.print("java is lambda2!!");
		
		prn = (s) -> System.out.println(s);
		prn.print("java is lambda3!!");
		
		prn = s -> System.out.println(s);
		prn.print("java is lambda4!!");
		
		Calculate c = new Cal();
		c.cal(10, 10);
		
		c = (int n1, int n2) -> { System.out.println(n1+n2); };
		c.cal(5, 2);
		
		c = (n1, n2) -> { System.out.println(n1*n2); };
		c.cal(5, 4);
		
		c = (n1, n2) -> System.out.println(n1-n2);
		c.cal(7, 4);
	}
}
