import java.util.Scanner;

public class Ex01 {
//요금계산
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int money = 2500;
		int age = 0;
		double rate=0;
		System.out.print("나이를 입력하세요.>");
		age = sc.nextInt();
		
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
		
			System.out.println("요금 : " + (int)(money * rate) + "원");
	}
}