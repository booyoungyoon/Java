import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("배열 갯수 입력 : ");
		int n = sc.nextInt();
		int[] nArr = new int[n];
		
		for(int i=0; i<nArr.length;i++) {
			int j;
			do {
				j=0;
				nArr[i] = rand.nextInt(10)+1;
				
				for(;j<i;j++)
					if(nArr[j] == nArr[i])
						break;
				}while(j<i);
		}
		System.out.println(Arrays.toString(nArr));
	}
}