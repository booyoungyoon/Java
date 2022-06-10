import java.util.Arrays;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		
		//두 배열이 같으면 true, 틀리면 false
		int[] nArr1 = {10, 20, 30, 40, 50};
		int[] nArr2 = {10, 20, 30, 40, 50};
		boolean result = ArrayEqual(nArr1, nArr2);
		System.out.println(result);
	}
		
		//두 배열 비교는 여기서
		static boolean ArrayEqual(int nArr1[], int nArr2[]) {
			System.out.println(Arrays.toString(nArr1));
			System.out.println(Arrays.toString(nArr2));

			if(Arrays.equals(nArr1,nArr2)) {
				return true;
			}else
				return false;
			
	}
}