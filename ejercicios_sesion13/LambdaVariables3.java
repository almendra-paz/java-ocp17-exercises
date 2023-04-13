import java.util.function.Consumer;
import java.util.List;

public class LambdaVariables3{
	private String color;

	public void caw(String name){

		String volume = "loudly";
		name = "Caty";			
		color = "black";
/*
		Consumer<String> consumer = s -> 					System.out.println("name: "+ name + 
			", volume: "+volume+", color: "+color);*/
	}
	
	public void count(List<Integer> list){
		list.sort((var a, var b)-> a.compareTo(b));

		list.sort((a,b)-> a.compareTo(b));	
		//Comparato<Integer> c = (a,b)-> a.compareTo(b);
		//BiFunction<Integer, Integer, Integer> c = (a,b)-> a.compareTo(b);
	}
}