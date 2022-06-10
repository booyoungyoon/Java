public class Exercise6_4_1 {

	public static void main(String[] args) {
			
		Student s = new Student();
	
	}

}

// private < default < protected < public
class Student2{
	//변수>> 인스턴스변수, 클래스변수, 지역변수
	
	private String name;
	private int ban;
	private int no;
	private int kor;
	private int eng;
	private int math;
	
	public Student2() {
		System.out.println("생성자 호출");
	}
	//함수 --> 인스턴스메소드, 클래스메소드

	int getTotal() {
		int sum = kor+eng+math;
		return sum;
	}
	
	double getAverage() {
		return getTotal()/3.0;
	}
}