import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		//������ �迭 5�� ����
		//�ʱ�ȭ�� �����Լ� ���ؼ� 1~100 ���̰��� ���� �� ���
		int[] arr = new int[10];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = (int) (Math.random()*100)+1;
		}
		System.out.println(Arrays.toString(arr));
		//�ִ밪 �� �ּҰ� ��� �� ���
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
		
		//����
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

		//����
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println("���� : " + sum);
		
		//���
		double avg;
		avg = (double)sum/arr.length;
		System.out.println("��� : " + avg);
	}
}