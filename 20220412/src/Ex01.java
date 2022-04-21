
public class Ex01 {

	public static void main(String[] args) {
		
		int num1 = 5;
		int num2 = 10;
		
		System.out.println("main() 함수!!");
		
		int result = sub(num1, num2);
		
		System.out.println("결과 값은 " + result);
	}

	public static int sub(int num1, int num2) {
		
		int result=num1 * num2;
		
		System.out.println("sub()함수...");
		
		return result;
	}
}