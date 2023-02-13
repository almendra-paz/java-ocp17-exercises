/**************************************************
Creación de wrapper:
-------------------
 - Mediante constructor: deprecada
 - Mediante método valueOf: parámetro primitivo o String
 - Autoboxing
***************************************************/
public class Wrapper{

	public static void main(String args[]){
		System.out.println("---- 1. Constructor ------");
		Long l2 = new Long(10);
		Long l3 = new Long("10");	// deprecada

		System.out.println("---- 2. ValueOf ------");
		Long l4 = Long.valueOf(10);
		Long l5 = Long.valueOf(10L);
		Long l6 = Long.valueOf("10");

		Boolean bo1 = Boolean.valueOf(true);
		Boolean bo2 = Boolean.valueOf("true");
		
		Double do1 = Double.valueOf(20.5);
		Double do2 = Double.valueOf(20.5F);
		
		Integer i1 = Integer.valueOf(12);
		Integer i2 = Integer.valueOf("12");		
		
		Integer i3 = Integer.valueOf(1200);
		Integer i4 = Integer.valueOf("1200");		
		
		//validando objetos en caché
		System.out.println(i1+" "+i2);
		System.out.println("i1 == i2:"+ (i1 == i2));
		System.out.println("i3 == i4: "+ (i3 == i4));
		
		System.out.println("---- 3. Autoboxing ----");
		Integer integer5 = 120;
		Integer integer6 = 120;
		System.out.println(integer5==integer6);
		
		//Excepciones
		//Long l7 = Long.valueOf("10.2");
		//Long l8 = Long.valueOf(null);
		Boolean b1 = Boolean.valueOf("valorNoDefined");
		System.out.println(b1);
		
		
	}

}