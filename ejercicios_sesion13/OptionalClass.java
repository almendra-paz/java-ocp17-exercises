import java.util.Optional;

public class OptionalClass{

	public static void main(String args[]){
		System.out.println(promedio(20,18,17,12));
		System.out.println(promedio());

		Optional<Double> opt1 = promedio(20,18,17,12);
		if(opt1.isPresent()){
			System.out.println(opt1.get());
		}
		
		Optional<Double> opt2 = promedio();
		if(opt2.isPresent())
			System.out.println(opt2.get());
		else
			System.out.println("No value present");	
	}

	public static Optional<Double> promedio(int... scores){
		if(scores.length == 0) return Optional.empty();

		int suma = 0;
		for(int nota: scores)
			suma += nota;
		return Optional.of((double) suma/scores.length);
	}

}