import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		int x = 11;
		System.out.println("1 : " + (x > 10 && x < 20));
		
		char ch1 = '\t';
		System.out.println("2 : " + (ch1 != ' ' && ch1 != '\t'));
		
		char ch2 = 'x';
		System.out.println("3 : " + (ch2 == 'x' || ch2 == 'X'));
		
		char ch3 = '9';
		System.out.println("4 : " + (ch3 >='0' || ch3<='9'));
		
		char ch4 = 'a';
		System.out.println("5 : " + (ch4 >= 'a' && ch4 <='z' || 
				ch4 >='A' && ch4 <= 'Z'));
		
		int year = 2022;
		System.out.println("6 : " + ((year % 400 ==0) || (year % 4 ==0) && (year % 100 != 0)));
		
		boolean powerOn = false;
		System.out.println(!powerOn);
		
		String str = "yes";
		System.out.println(str.equals("yes"));
	}

}