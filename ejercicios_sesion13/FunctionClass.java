import java.util.function.Function;
import java.util.function.BiFunction;

public class FunctionClass{
	public static void main(String args[]){
		Function<String, Integer> f1 = x->x.length();
		Function<String, Integer> f2 = x-> 200;
		System.out.println(f2.apply("cadena")); //200
	
		BiFunction<String, String, String> b1 = 
			(string, toAdd) -> string.concat(toAdd);

		System.out.println(b1.apply("cadena", " rota"));

		BiFunction<String, Integer, String> b2 = 
			(string, intval) -> string + intval;

		System.out.println(b2.apply("cadena", 123));
		//int result = b2.apply("cadena", 123);
	}
}