import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

public class MapMethods2{

	public static void main(String args[]){
		Map<String,String> map1= new HashMap<>();
		map1.put("cod1","Juan");
		map1.put("cod2","Carlos");
		map1.put("cod3","Karla");

		//GET
		String alumno = map1.get("cod1"); //"Juan"
		System.out.println(alumno);

		// KEYSET
		for(String key: map1.keySet())
			System.out.println(key + ",");

		Map<String,String> map2= new TreeMap<>();
		map2.put("cod1","Juan");
		map2.put("cod2","Carlos");
		map2.put("cod3","Karla");

		String alumno2 = map2.get("cod1");

		for(String key: map2.keySet())
			System.out.println(key + ",");

		System.out.println("---- lecturas ----");
		//System.out.println(map2.contains("cod1")); //
		System.out.println(map2.containsKey("cod1"));
		System.out.println(map2.containsValue("cod1"));
		System.out.println(map2.size());

		map2.clear();
		System.out.println(map2.size());
		System.out.println(map2.isEmpty());
	}
}

