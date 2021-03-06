/*
 * Nested클래스 와 Inner클래스
 * Nested ==> static
 * 
 * Inner--> static xx //스태틱 없음
 * Member inner class //멤버클래스
 * Local inner class //이너클래스
 * Anonymous inner class //익명클래스
 */

class Outer{
	private static int num=0;
	static class Nested1{
		void add(int n) { num += n; }
	}
	
	static class Nested2{
		int get() { return num; }
	}
}
public class StaticNested {

	public static void main(String[] args) {
		Outer.Nested1 nst1 = new Outer.Nested1();
		nst1.add(10);
		Outer.Nested2 nst2 = new Outer.Nested2();
		System.out.println(nst2.get());
	}

}