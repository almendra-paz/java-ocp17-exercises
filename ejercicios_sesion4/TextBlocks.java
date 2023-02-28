public class TextBlocks{
	
	public static void main(String args[]){		
				
		/** 
			"El valor de una idea radica en el uso de la misma". 
				Tomas A. Edinson
		**/
		String textBlock = """
		"El valor de una idea radica en el uso de la misma". 
			Tomas A. Edinson
		""";
		String original = "\"El valor de una idea radica en el uso de la misma\". \n	Tomas A. Edinson";
		
		System.out.println(textBlock);
		System.out.println(original);		
						
	}
	
}