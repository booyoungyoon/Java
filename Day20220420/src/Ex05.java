import java.util.Arrays;
import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		int fee=2500;
		int age = input();
		double rate = feeCalcRate(age);
		output(age, fee, rate);

	}
	
	static int input() {
		int age=0;
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();
		return age;
		
	}
	
	static double feeCalcRate(int age) {
		double rate = 0;
		if(age>=65)
			rate = 0;
		else if(20<=age)
			rate = 1;
		else if(14<=age)
			rate = 0.75;
		else if(4<=age)
			rate = 0.5;
		else 
			System.out.println("정확한 값을 입력하세요.");

		return rate;
		
	}
	
		static void output(int age, int fee, double rate) {
			System.out.println(age + "세 요금은 " + (int)(fee*rate) + "원");
		}
	}