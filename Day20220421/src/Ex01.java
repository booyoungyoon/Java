import java.util.Scanner;

public class Ex01 {

	static int num1, num2, num3;

	public static void main(String[] args) {
		//세 정수를 입력받아서 최대값 출력 (배열x)
		
		input();
		int max = calu();
		output(max);
		
	}
	static void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 3개 입력");
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			num3 = sc.nextInt();
	}
	static int calu() {
		int max=num1;
		if(num1>max){
			max=num1;
		}
		if(num2>max) {
			max=num2;
		}
		if(num3>max){
			max=num3;
		}
	return max;
	}
	static void output(int num) {
		System.out.println("max : " + num);

		
			
			
		
		//세 정수를 큰 순서대로 출력
	}
	
}
