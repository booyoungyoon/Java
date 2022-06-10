import java.util.Scanner;

//해당 월의 영어 단어를 입력하는 프로그램
public class DayCal2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] dayString = {
									"sunday", "monday", "tuesday", "wednesday",
									"thursday", "friday", "saturday"
							};
		String[] dayKor = { 
							"일", "월", "화", "수", "목", "금", "토"
						};
		
		System.out.println("해당 요일의 영어 단어를 소문자로 입력하세요.");
		int retry = 0;
		int last = -1;
		int suc=0;
		int fail=0;
		do{
			int day;
			do {
				day = (int)(Math.random()*7);
			}while(day == last);
			last = day;
			
			while(true) {
				System.out.println((dayKor[day]) + "요일");
				String qus = sc.nextLine();
				if(qus.equals(dayString[day])) {
					suc++;
					break;
				}
					System.out.println("오답입니다.");
					fail++;
			}
				
				System.out.println("정답입니다. 재도전(1) : 그만(0)");
				retry = sc.nextInt();
				sc.nextLine();
			
		}while(retry == 1);
		System.out.println("성공/실패 : " + suc + "/" + fail);
		System.out.println("종료!!");


	}

}
