import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String tmp;
		int year;
		int month;
		int lastDay[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int week;
		int day;
		
		System.out.println("년도 입력 : ");
		tmp=sc.nextLine();
		year = Integer.parseInt(tmp);

		System.out.println("월 입력 : ");
		tmp=sc.nextLine();
		month = Integer.parseInt(tmp);
		
		System.out.println(year + "년도 " + month + "월");
		System.out.println("일\t" + "월\t"+ "화\t"+ "수\t"+ "목\t"+ "금\t"+ "토\t");
		
		//윤년
		if(year%4==0 && year%100!=0 || year%400==0) {
			lastDay[1] = 29;
		}
		
		day = (year-1)*365 + (year-1)/4 - (year-1)/100 + (year-1)/400;
		
		for(int i=0;i<month-1;i++) {
		 	day+=lastDay[i];
		}
		day++;
		
		week = day%7;
		
		for(int i=0;i<week;i++) {
			System.out.print("\t");
		}
		for(int i=1;i<=lastDay[month-1];i++) {
			System.out.printf("%2d\t", i);
			week++;
			if(week%7==0)
				System.out.println("");
		}
	}
}
