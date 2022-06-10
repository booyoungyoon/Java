import lombok.Getter;
import lombok.Setter;

public class Exam01 {

	public static void main(String[] args) {
		
		Student s = new Student();
		s.setName("홍길동");
		s.setBan(1);
		s.setNo(1);
		s.setKor(100);
		s.setEng(60);
		s.setMath(76);
		
		System.out.println("이름 : " + s.getName());
		System.out.println("총점 : " + s.getTotal());
		System.out.println("평균 : " + s.getAverage());
	}
}
@Getter
@Setter
class Student{
	private String name;
	private int ban;
	private int no;
	private int kor;
	private int eng;
	private int math;
	
	
	int getTotal(){
		return kor + eng + math;
	}
	float getAverage() {
		return getTotal()/3.0f;
	}
}