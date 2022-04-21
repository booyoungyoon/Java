import java.util.Arrays;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		
		int[] num = {9, 6, 7, 3, 5};

		for(int i=0;i<=num.length-1;i++) {
			int index=i;
			for(int j=i;j<num.length;j++) {
				
				if (num[index]>num[j])index=j;
			}
			if(index!=i) {
				int tmp=num[index];
				num[index]=num[i];
				num[i]=tmp;
			}
			System.out.println(i+1+"회전 " + Arrays.toString(num));
		}
		
			System.out.println(Arrays.toString(num));
		
	}
}