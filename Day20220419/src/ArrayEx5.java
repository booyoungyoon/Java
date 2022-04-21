
public class ArrayEx5 {

	public static void main(String[] args) {
		
		int[] ball = new int[45];
		int temp=0;
		
		for(int i=0;i<ball.length;i++) {
			ball[i]+=i+1;
		}
		for(int i=0;i<6;i++) {
			int j=(int)(Math.random()*45);
			temp=ball[i];
			ball[i]=ball[j];
			ball[j]=temp;
		}
		for(int i=0;i<6;i++) {
			System.out.println(ball[i]);			
		}
	}

}
