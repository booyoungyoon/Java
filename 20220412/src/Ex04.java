import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		      Scanner sc=new Scanner(System.in);
		      int max=0;
		      int tmp=0;
		      
		      
		      for(int i=0; i<5; i++) {
		      System.out.println("�Է��ϼ��� :");
		      tmp = sc.nextInt();
		      
		      if(max<tmp)
		         max=tmp;
		      System.out.println("ū��"+max);
		      }
		      
		      
		      
		      System.out.println("���� ū ��:"+max);

		   }

		

	}

