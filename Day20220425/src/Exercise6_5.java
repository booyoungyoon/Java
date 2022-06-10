
public class Exercise6_5 {

	public static void main(String[] args) {
		
		Student s = new Student();
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("이름 : " + s.name);
		System.out.println("총점 : " + s.getTotal());
		System.out.println("평균 : " + s.getAverage());

	}

}

class Student2 {

	private int math;
	private int eng;
	private int kor;
	private int no;
	private int ban;
	private String name;
	
	
	public void setMath(int math) {
		this.math = math;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public void setBan(int ban) {
		this.ban = ban;
	}
	public void setName(String name) {
		this.name = name;
	}
	int getTotal() {
		return kor + eng + math;
	}
	double getAverage() {
		return (int)((getTotal()/3.0+0.05)*10)/10.0;
	}
	
}