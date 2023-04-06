import java.util.List;
import java.util.LinkedList;
import java.util.Arrays;
import java.util.Iterator;

public class ListMethods{

	public static void main(String args[]){
		
		//ReplaceAll
		List<Integer> numbers = Arrays.asList(1,2,3);
		numbers.replaceAll(x->x*2);	//unaryOperator(x->x*2)
		System.out.println(numbers); //2, 4, 6			

		List<Integer> list1 = new LinkedList<>();
		list1.add(2); 
		System.out.println(list1.addAll(numbers));
		System.out.println("lista despues de addAll: "+list1);

		//RemoveIf
		list1.removeIf(x->x>4);
		System.out.println("lista despues de removeIf: "+list1);

		System.out.println("---ForEach---");
		list1.forEach(x-> System.out.println(x));

		System.out.println("--- for mejorado ---");
		for(Integer a: list1){
			System.out.println(a);
		}

		System.out.println("--- iterator ---");
		Iterator<Integer> iter = list1.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
	}
}

