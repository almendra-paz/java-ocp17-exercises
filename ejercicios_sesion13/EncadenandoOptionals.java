import java.util.stream.Stream;
import java.util.Optional;
import java.util.List;
import java.util.function.Predicate;

public class EncadenandoOptionals{

	public static void main(String args[]){
		Optional<Integer> opt = Optional.of(523);
		Optional<String> opt2 = Optional.ofNullable(null);
		threeDigit(opt);	//523
		printString(opt2);	//
		
		//map plano
		opt.flatMap(EncadenandoOptionals::calculate)
			.ifPresent(System.out::println);
	}

	private static void threeDigit(Optional<Integer> optional){		
		optional.map(n-> ""+n)
			.filter(s-> s.length() == 3)
			.ifPresent(System.out::println);
	}
	
	private static void printString(Optional<String> optional){
		optional
			.filter(s-> s.length() == 3)
			.ifPresent(System.out::println);
	}

	private static Optional<Integer> calculate(Integer val){
		return Optional.of(val*2);		
	}


}