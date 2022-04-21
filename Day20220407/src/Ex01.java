import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		int sum = 0;
		String cal;
		String tmp;
		
		for(;true;) {
			System.out.println("사칙연산을 입력하세요.>");
			cal = sc.nextLine();
			if(cal.equals("q"))
				break;
			
			System.out.println("숫자를 입력하세요.>");
			tmp = sc.nextLine();
			num = Integer.parseInt(tmp);
			if(cal.equals("+")) {
				sum+=num;
			}else if(cal.equals("-")) {
				sum-=num;
			}else if(cal.equals("*")) {
				sum*=num;
			}else if(cal.equals("/")) {
				sum/=num;
			}
			System.out.println(sum);
		}
		
	}
}
