public class StringMethods{

	public static void main(String args[]){
				
		//length
		System.out.println("ABCDEFG".length()); //7
		
		//charAt
		System.out.println("ABCDEFG".charAt(3)); //D
		System.out.println("ABCDEFG".charAt(5)); //F
		//System.out.println("ABCDEFG".charAt(-1));
		//System.out.println("ABCDEFG".charAt(7));
		//IndexOutOfBoundsException		
		//StringIndexOutOfBoundsException
		
		//IndexOf
		System.out.println("ABCDEFGA".indexOf('A')); //0
		System.out.println("ABCDEFGA".indexOf('Z')); //-1
				
		System.out.println("ABCDEFG".indexOf('C',0)); //2
		System.out.println("ABCDEFG".indexOf('D',0)); //3
		System.out.println("ABCDEFGA".indexOf('A',2)); //7

		// Substring
		System.out.println("hello".substring(2,4)); // "ll"
		System.out.println("hello".substring(2)); // "llo"
		//System.out.println("hello".substring(-1)); 
		//System.out.println("world22".substring(10)); 

		//replace
		System.out.println("aabbccddbb".replace("bb","22")); 
		System.out.println("abcdabcdd".replace("d","e")); //

		// strip and trim
		System.out.println(" 1 2 3 ".strip()); //1 2 3
		System.out.println(" 1 2 3 ".trim()); //1 2 3

		//Concat y Uppercase
		System.out.println("hello".concat(" world"));
		System.out.println("lima".toUpperCase());
		
		//equals
		String str1 = new String("hello");
		String str2 = new String("hello");
		String str3 = "Hello";
		System.out.println("== >>" + (str1 == str2)); //false
		System.out.println("equals >>" + 
		(str1.equals(str2)));	//true
		System.out.println("equals >>" + 
		(str1.equalsIgnoreCase(str3)));	//true
		
	}

}





