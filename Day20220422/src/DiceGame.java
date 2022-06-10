
public class DiceGame {

	public static void main(String[] args) {
		
		int dice1=0;
		int dice2=0;
		
			while(true) {
			dice1 = (int)(Math.random()*6)+1;
			dice2 = (int)(Math.random()*6)+1;
			System.out.printf("(%d,%d)\n", dice1, dice2);
			if(dice1+dice2 == 5) {
				System.out.println("합이 5가 되어 종료합니다.");
			break;
			}
		}
	}
}