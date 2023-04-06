import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class MapMerge{

	public static void main(String args[]){
		//toma la cadena más larga
		// ("aa", "aaa") -> "aaa"
		BiFunction<String, String, String> mapper = 
(v1,v2) -> v1.length()>v2.length()?v1:v2;
		
		Map<String,String> map= new HashMap<>();
		map.put("cod1","Juan");
		map.put("cod2","Carlos");
		map.put("cod3","Karla");
		map.put("cod4",null);

		//evaluacion para actualizar
		map.merge("cod1","Roberto", mapper); //Roberto
		map.merge("cod2","Carlos", mapper); //Carlos
		map.merge("cod3","Karl", mapper);  //Karla

		System.out.println(map);

		//no se llama a mapper
		map.merge("cod4","Jesus", mapper); //Jesus
		map.merge("cod5","Maria", mapper); //Maria
		System.out.println(map);	

		//cuando la funcion da null
		BiFunction<String, String, String> mapper2 = 
		(v1,v2) -> null;
		map.merge("cod1","Juan", mapper2);	//
		System.out.println(map);

		//{cod4=Jesus, cod5=Maria, cod2=Carlos, cod3=Karla}
		map.merge("cod5","Marta", mapper2);	//elimina cod5
		//{cod4=Jesus, cod2=Carlos, cod3=Karla}
		map.merge("cod6", "Marta", mapper2); 
		System.out.println(map);
	}

}




