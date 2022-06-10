
public class TestVariables {

	public static void main(String[] args) {
		
		Variables var = new Variables();
		var.iv++;
		Variables.cv++;
		System.out.println(var.iv);
		System.out.println();
		Variables var2 = new Variables();
		
		var2.iv++;
		System.out.println(var2.iv);
		
	}

}

class Variables{
	int iv; //인스턴스변수, 멤버변수
	static int cv;//클래스변수, 정적변수
	
	void method() {
		int lv=0;//지역변수
	}
}