import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		      Scanner sc=new Scanner(System.in);
		      int max=0;
		      int tmp=0;
		      
		      
		      for(int i=0; i<5; i++) {
		      System.out.println("입력하세요 :");
		      tmp = sc.nextInt();
		      
		      if(max<tmp)
		         max=tmp;
		      System.out.println("큰수"+max);
		      }
		      
		      
		      
		      System.out.println("최종 큰 수:"+max);

		   }

		

	}


