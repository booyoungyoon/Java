import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		Person[] p = new Person[3];
		p[0]=new Person("윤부영", 31);
		p[1]=new Person("김정민김정민", 24);
		p[2]=new Person("김대철김대", 35);
		
		Arrays.sort(p);
		
		for(Person per : p)
			System.out.println(per);
	}

}

class Person implements Comparable{
	private String name;
	private int age;
	
	public Person() {}
	
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "name=" + name + ", age=" + age ;
	}

	@Override
	public int compareTo(Object o) {
		Person p=(Person)o;
		
//		if(this.age > p.age) return 1;
//		else if(this.age<p.age) return-1;
//		else return 0;
//		return this.name.length()-p.name.length();
		return p.name.length()-this.name.length();
	}
	
	
}