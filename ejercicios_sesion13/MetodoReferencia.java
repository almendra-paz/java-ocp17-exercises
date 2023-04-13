import java.util.function.Consumer;

public class MetodoReferencia{

	public static void main(String args[]){
		Consumer<String> c1 = c -> System.out.println(c);
		Consumer<String> c2 = System.out::println;
		transformar("Rosa", c2);
		
	}

	public static void transformar(String name, Consumer<String> action){
		action.accept(name);
	}

}

