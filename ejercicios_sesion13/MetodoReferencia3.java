import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.BiPredicate;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Supplier;
import java.util.function.Function;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class MetodoReferencia3{

	public static void main(String args[]){
		//---- metodos instancia
		Predicate<String> methodRef = String::isEmpty;
		Predicate<String> lambda = s-> s.isEmpty();
		System.out.println(methodRef.test(""));		

		BiPredicate<String, String> methodRef1 = 
					String::startsWith;
		BiPredicate<String, String> lambda1 = 
			(s,p)->s.startsWith(p);
			
		BiFunction<String, String, Boolean> lambdaFunction1 = 
			(s,p)->s.startsWith(p);
		BiFunction<String, String, Boolean> methodFunction1 = 
			String::startsWith;
							
			
		System.out.println(methodRef1.test("hello", "h"));

		//---- constructores
		Supplier<List<String>> methodRef2 = ArrayList::new;
		Supplier<List<String>> lambda2 = 
				()-> new ArrayList();
		System.out.println("const1: "+methodRef2.get());
		
		Function<List<String>,List<String>> methodRef3 = 				ArrayList::new;
		Function<List<String>,List<String>> lambda3 = 
				x-> new ArrayList(x);
		System.out.println("const2: "+
			methodRef3.apply(List.of("a","b")));				
			
		//
		BiConsumer<String, String> concat = 
		(a,b)-> concatenar(a,b);
		
		BiConsumer<String, String> methodConcat = 
		MetodoReferencia3::concatenar;

	}
	
	public static void concatenar(String a, String b){ 
		System.out.println( a + b);
	}

		
}