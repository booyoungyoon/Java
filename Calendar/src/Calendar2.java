import java.util.Scanner;

public class Calendar2 {

   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      
      int year, month, week; //year는 입력받을 년도, month는 입력받을 월
      int[] lastDay = {31,28,31,30,31,30,31,31,30,31,30,31}; //1월부터 12월의 마지막날짜를 배열에 넣음.
      
      System.out.println("년도");
      year = sc.nextInt();
      System.out.println("월");
      month = sc.nextInt();
      System.out.println(year + "년도 " + month + "월");  //년도와 월을 입력받고 출력해줌
      
      
      // 1년 1월부터 입력받은 년도까지 계산 (2022년 입력하면 2021년 12월 31일 까지 계산)
      int total = (year-1)*365 //1년 지날때마다 365 곱해줌
    		  + (year-1)/4 //입력한 년도가 4로 나누어 떨어지면 윤년이라서 +, 
    		  - (year-1)/100  // 4로 나누어떨어지는 년도 중에서 100으로 나누어 떨어지면 평년이라서 -,
    		  + (year-1)/400; // 그중에서 400으로 떨어지면 윤달이라서 +.
      
      if(year%4==0 && year%100!=0 || year%400==0) {
         lastDay[1] = 29;// 만약에 입력한 년도가 윤년이면 2월의 마지막 날짜가 29일로 변경.
      }
      for(int i=0;i<month-1;i++) {
         total += lastDay[i];//입력한 달까지의 날수를 total에 추가로 더해줌
      }
      total ++; // total에 1을 더해서 2022년 1월로 맞춰줌
      
      
      week = total%7; //total을 7로 나눠서 나머지값으로 요일을 구함.(0이면 일요일~6이면 토요일)
//      System.out.println(total); // 확인용
//      System.out.println(week); // 확인용
      System.out.println("일\t" + "월\t" + "화\t" + "수\t" + "목\t" + "금\t" + "토\t");
      
      for(int i=0;i<week;i++)
         System.out.print("\t"); //total을 7로 나눈 나머지값만큼(week) 시작 전에 공백으로 채워줌
      							//(0일때 일요일이었으니까 공백 없음, 1이면 월요일이니까 공백 한칸줘서 월요일부터 시작)

      for(int i=1; i<=lastDay[month-1];i++) {
         System.out.printf("%2d\t", i); //날짜 출력
         week++;
         if(week%7==0)
            System.out.println();//week이 7의배수가 될때마다 아래칸으로 줄바꿈
      }
   }
}