import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("두 자리 정수를 입력하세요!!");
		int num=0;
//		while(true) {
//			num=sc.nextInt();
//			if(num<10||num>99) {
//				continue;
//			}else break;
//		}
//		System.out.println("종료되었습니다.");
		
		do {
			System.out.println("입력 >>");
			num = sc.nextInt();
		}while(num<10||num>99);
		System.out.println(num + ". 종료");
	}
	
}
