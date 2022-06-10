interface Printable{
	void print();
}

class Papers{
	private String con;
	public Papers(String s) { con = s; }
	public Printable getPrinter(){return new Printer();}
	
	private class Printer implements Printable{
		
		@Override
		public void print() {
			System.out.println(con);
		}
	}
}
public class UsememberEx1 {

	public static void main(String[] args) {
		Papers p = new Papers("message java!!");
		Printable prn = p.getPrinter();
		prn.print();
	}

}
