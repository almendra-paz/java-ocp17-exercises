import java.util.ArrayList;

public class ForEachLoop{

	public static void main(String[] args){
		String[] values = {"a", "b", "c"};
		
		//for(String e: values)
		//	System.out.println(e);
		
		
		System.out.println("--- Loop with break");
		for(String e: values) {
			if(e.equals("a")){
				System.out.println(e);
				break;	// termina loop
			}
			//break;
			System.out.println(e);
		}

		System.out.println("--- Loop with continue");
		for(String e: values) {
			if(e.equals("a")){
				continue;
			}			
			System.out.println(e);
			//continue;
		}

	}
}