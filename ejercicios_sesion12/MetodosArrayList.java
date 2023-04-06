import java.util.ArrayList;

public class MetodosArrayList{

	public static void main (String[] args){
		
		//ADD
		System.out.println("--- add method --");
		ArrayList list = new ArrayList(); //arraylist de objetos
		list.add("hello");
		list.add(Boolean.TRUE);
		//de Strings
		ArrayList<String> safer = new ArrayList<>();
		safer.add("string");
		//safer.add(Boolean.TRUE);

		ArrayList<String> nombres = new ArrayList<>();
		nombres.add("Juan"); 	//[Juan]
		nombres.add("Roberto");	//[Juan, Roberto]
		nombres.add(1, "Maria"); //[Juan, Maria, Roberto]
		nombres.add(3, "Pedro"); //[Juan, Maria, Roberto, Pedro]

		//[Juan, Maria, Ignacio, Roberto, Pedro]
		nombres.add(2, "Ignacio"); //IndexOutOfBou...
		System.out.println(nombres);
		
		//SET
		System.out.println("--- set method --");
		System.out.println(nombres.set(2,"Maria")); //Ignacio
		//nombres.set(2, nombres.set(2,"maria"));
		System.out.println(nombres);
		//[Juan, Maria, Maria, Roberto, Pedro]

		System.out.println("--- remove method --");
		System.out.println(nombres.remove(0));	
		//[Maria, Maria, Roberto, Pedro]
		System.out.println(nombres.remove("Maria")); 
		//[Maria, Roberto, Pedro]
		System.out.println(nombres);


	}
}
