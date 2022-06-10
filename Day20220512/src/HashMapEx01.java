import java.util.*;

public class HashMapEx01 {

	public static void main(String[] args) {
//		HashMap<Integer, String> map = new HashMap<Integer, String>();
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		
		map.put(3, "kim");
		map.put(4, "hong");
		map.put(4, "Lee");
		map.put(5, "park");
		map.put(6, "kim");
		
		System.out.println(map);
		System.out.println(map.get(5));
		
		Set<Integer> set = map.keySet();
		for(Integer n : set) //key 출력
			System.out.print(n + "\t");
		
		System.out.println();
		
		for(Integer n : set) // value
			System.out.print(map.get(n) + "\t");
		
		System.out.println();
		
		Iterator<Integer> itr = set.iterator();
		while(itr.hasNext())
			System.out.print(map.get(itr.next())+"\t");
	}

}
