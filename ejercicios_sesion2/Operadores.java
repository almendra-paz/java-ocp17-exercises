public class Operadores{
	
	public static void main(String args[]){
		
		System.out.println("---- Operadores Unarios ----");
		
		//incremento/decremento post pre
		int a = +10;		
		int b = -10;
		a++;		// a incrementa de 10 a 11
		++a;		// a incrementa de 11 a 12
		System.out.println(a); //12
		b++;		// b incrementa de -10 a -9
		System.out.println(b);
		
		--a; // a--
		System.out.println(a); // de 12 a 11
		
		//complemento lógico
		boolean expr1 = false;
		boolean expr2 = !expr1; 
		System.out.println("---- Complemento logico ----"); 
		System.out.println(expr2); //true
		
		//Bitwise complement (~)
		System.out.println("---- Bitwise complement (~) ----");
		
		byte b1 = 1;	// 00000001
		byte b2 = (byte)~b1; 	// b2 es 11111110
		System.out.println(b2);
		System.out.println(Integer.toBinaryString(1));
		System.out.println(Integer.toBinaryString(5));
						
				
		System.out.println("---- Cast ----"); 
		int int1 = (int) 200.00;
		System.out.println("int: "+int1);
		
		//3. Operadores Aritméticos
		
			//Combinando Wrapper y primitivos
			Double da1 = 120.00;
			Integer ia1 = 10;
			double ra1 = da1 + ia1;
			System.out.println(ra1);
		
			//Concatenacion String
			System.out.println("---- Concatenacion String"); 
			String str1 = "hello";
			String str2 = " world";
			String s = str1 + str2;			
			System.out.println(s);
			
		//4. Relacionales
		
			//==
			Integer i = 10;		
			Double d = 10.0;
			double d2 = d;
			//System.out.println(i == d);	// referencias de distintos tipos
			
			System.out.println("equals:");
			System.out.println(i == d2);
			
			Integer integera = 1000;
			Integer integerb = 1000;			
			System.out.println("----Integers");
			System.out.println(integera == integerb);
			
			//instanceof
			System.out.println("--- instanceof");
			Object obj = "hello";
			boolean isString = (obj instanceof String);
			System.out.println(isString);

			boolean isNumber = (obj instanceof Number);
			System.out.println(isNumber);		
		
	}
	
}