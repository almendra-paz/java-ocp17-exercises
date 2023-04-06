import java.util.Map;
import java.util.HashMap;

public class MapMethods{

	public static void main(String args[]){
		Map<String,String> map1 = 
		Map.of("key1","val1","key2","val2");
		//map1.put("key3","val3");
		System.out.println(map1);

		Map<String,String> map2= 
		Map.ofEntries
			(Map.entry("key1","val1"),
			Map.entry("key2","val2"));
		System.out.println(map2);

		Map<String,String> map3 = 
		Map.copyOf(map2);
		System.out.println(map3);		
	}
}

