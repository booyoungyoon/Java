import java.util.Arrays;

public class Ex4 {

	public static void main(String[] args) {
		
		int[] coinUnit = {500, 100, 50, 10};
		int money = 2680;
		System.out.println("money = " + money);
		
//		int num500 = money / coinUnit[0];
//		System.out.println("500원 : " + num500);
//		int mon = money%coinUnit[0];
//		System.out.println("나머지 : " + mon);

		for(int i=0;i<coinUnit.length; i++) {
			 
			int num = money/coinUnit[i];
			money%=coinUnit[i];
			System.out.println(coinUnit[i] + "원 " + num + "개");
			
		}
		
	}
}