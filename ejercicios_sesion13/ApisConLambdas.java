import java.util.List;
import java.util.ArrayList;

public class ApisConLambdas{

	public static void main(String args[]){
		List<String> pets = new ArrayList<>();
		pets.add("perro");
		pets.add("gato");
		pets.add("gallina");
		pets.add("peces");

		//pets.removeIf(p -> p.startsWith("g"));
		//System.out.println(pets);

		//pets.sort((p1,p2) -> p1.compareTo(p2));
		//System.out.println(pets);

		pets.forEach(b->System.out.println("elem: "+b));
	}

}