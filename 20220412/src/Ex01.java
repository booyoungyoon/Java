
public class Ex01 {

	public static void main(String[] args) {
		
		int num1 = 5;
		int num2 = 10;
		
		System.out.println("main() �Լ�!!");
		
		int result = sub(num1, num2);
		
		System.out.println("��� ���� " + result);
	}

	public static int sub(int num1, int num2) {
		
		int result=num1 * num2;
		
		System.out.println("sub()�Լ�...");
		
		return result;
	}
}