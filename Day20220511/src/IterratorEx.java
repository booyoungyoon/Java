import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IterratorEx {

	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		
		list.add("toy");
		list.add("box");
		list.add("robot");
		list.add("toy");
		
		for(String e : list)
		System.out.print(e+'\t');
		System.out.println("\n----------------------------");
		Iterator<String> it=list.iterator();
		
		while(it.hasNext()) {
			String str = it.next();
			if(str.equals("toy")) it.remove();
			System.out.print(str+'\t');
		}
		
		Iterator<String> it2=list.iterator();
		System.out.println("\n---------------------");
		while(it2.hasNext()) {
			String str2 = it2.next();
			System.out.print(str2+'\t');
		}
	}

}
