import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.Random;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;

public class MetodoReferencia2{

	public static void main(String args[]){
		//---- metodos estáticos
		Consumer<List<Integer>> methodRefEst = 
			x -> Collections.sort(x);
		Consumer<List<Integer>> methodRefEst2 = 					Collections::sort;

		List<Integer> list = Arrays.asList(5,4,3);
		methodRefEst2.accept(list);
		System.out.println(list);

		//---- metodos de instancia de un objeto
		var str = "hello";
		Predicate<String> lambda = s -> str.startsWith(s);
		Predicate<String> methodRef = str::startsWith;

		System.out.println(methodRef.test("he")); //true
		//"he"-> str.startsWith("he");

		var random = new Random();
		Supplier<Integer> lambda1 = ()->random.nextInt();
		Supplier<Integer> methodRef1 = random::nextInt;

		System.out.println(methodRef1.get());
		
	}


}

