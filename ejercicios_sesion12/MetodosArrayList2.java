import java.util.ArrayList;

public class MetodosArrayList2{

	public static void main (String[] args){
		ArrayList<String> nombres = new ArrayList<>();
		nombres.add("Juan");	
		nombres.add("Roberto");
		nombres.add("Pedro");

		System.out.println("--- set method --");
		System.out.println(nombres.set(0,"Maria"));
		//System.out.println(nombres.set(3,"Maria"));
		System.out.println(nombres);

		System.out.println("--- lecturas --");
		System.out.println(nombres.contains("Maria"));
		System.out.println(nombres.isEmpty());
		System.out.println(nombres.size());

		System.out.println("--- clear and contains --");
		System.out.println(nombres.contains("Maria"));
		nombres.clear();
		System.out.println(nombres.isEmpty());
		System.out.println(nombres.size());
	}
}
