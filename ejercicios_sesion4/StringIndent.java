public class StringIndent{

	public static void main(String args[]){
				
		//indent
		String textBlock = """
		"El valor de una idea radica en el uso de la misma". 
			Tomas A. Edinson
		""";
		String original = "\"El valor de una idea radica en el uso de la misma\". \n	Tomas A. Edinson";
		
		System.out.println(textBlock); 
		System.out.println(original); 
		
		System.out.println(textBlock.length()); 
		System.out.println(original.length()); 
		
		textBlock = textBlock.indent(2);
		original = original.indent(2);
		
		System.out.println(textBlock); 
		System.out.println(original); 
		
		System.out.println(textBlock.length()); 
		System.out.println(original.length()); 
		
		String spaces = " a\n"+
						"  b\n" +
						" c";
		
		
		System.out.println(spaces); 			
		//System.out.println(spaces.stripIndent().length()); 
		System.out.println(spaces.stripIndent()); 
		
	
	}

}





