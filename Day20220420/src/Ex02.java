import java.util.Arrays;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		
		int cnt=0;
		int sum=0;
		for(int i=1;i<=100;i++) {
			sum+=i;
			cnt++;
		}
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + sum/cnt);
		
		int sum1=0;
		int cnt1=0;
		for(int i=1;i<=100;i++) {
			if(i%2==0&&i%7==0) {
					sum1+=i;
					cnt1++;
					}
			}
		int[] arr = new int[cnt1];
		int j=0;
		for(int i=1;i<=100;i++) {
			if(i%2==0&&i%7==0) {
				sum+=i;
				arr[j++]=i;
			}
			
		}
		
		
		System.out.println("2의 배수이면서 7의 배수의 갯수 : " + cnt1);
		System.out.println("2의 배수이면서 7의 배수의 총합 : " + sum1);
		System.out.println();
		System.out.println(Arrays.toString(arr));
	}
}