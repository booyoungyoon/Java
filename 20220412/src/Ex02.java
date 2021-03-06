import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		//정수형 배열 5개 선언
		//초기화는 랜덤함수 통해서 1~100 사이값을 저장 및 출력
		int[] arr = new int[10];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = (int) (Math.random()*100)+1;
		}
		System.out.println(Arrays.toString(arr));
		//최대값 및 최소값 계산 및 출력
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(max < arr[i])
				max = arr[i];
		}
		System.out.println("max : " + max);
		
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i])
				min = arr[i];
		}
		System.out.println("min : " + min);
		
		//정렬
		int tmp;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					tmp=arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

		//총합
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println("총합 : " + sum);
		
		//평균
		double avg;
		avg = (double)sum/arr.length;
		System.out.println("평균 : " + avg);
	}
}