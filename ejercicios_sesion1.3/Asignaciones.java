/**************************************************
3 tipos de asginaciones:
-----------------
 - Ensanchamiento implícito
 - Estrechamiento implicito: 
	- requiere que se usan constantes
	- solo entre int short char byte
 - Estrechamiento explícito
***************************************************/
public class Asignaciones{

	public static void main(String arg[]){		
		System.out.println("---Ensanchamiento implicito--");
		byte $byte1= 10; 		int $int1 = 20; 
		long $long1= 30; 		double $double1;
		
		$int1 = $byte1; // byte -> int
		$long1 = $int1; // int -> long		
		$double1 = $long1; // long -> double
		
		System.out.println($double1+" "+$long1+" "+$int1);

		System.out.println("---Estrechamiento implicito--");
		char $char1; 			
		char $char3 = 200;
		final short $short1 = 100; 
		final int $int2 = 20; 
				
		$byte1 = $short1; // short -> byte
		$char1 = $int2; // int -> char
		System.out.println($byte1+" "+$char1);

		System.out.println("---Estrechamiento explicito--");
		byte $byte3= 10; 
		int $int3 = 128; 
		long $long3= 30L; 
		double $double3 = 40.00;	
		
		$byte3 = (byte) $int3;	// int -> byte
		$int3 = (int) $long3; // long -> int
		$long3 = (long) $double3; //double -> long
		
		System.out.println($byte3+" "+$int3+" "+$long3);
		
		//Asignaciones Especiales
		long $long4 = 200; float $float4=200;
		System.out.println($float4);
		$float4 = $long4;
		$long4 = (long) $float4;
		

	}

}