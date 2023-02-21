public class Ternary{

	public static void main(String args[]){
		//--- Operandos numéricos
		
		//primitivos numericos (amplitud)
		int a = 1, b=2;
		double double1 = a == b? 5: 10.0; //int, double
		var int0 = a == b? 5: 10.0;  // var infiere double
		
		//primitivo numericos y wrapper	
		int intPrim1 = 6; double doubPrim1 = 60.0;
		Double double2 = 10.0, double3; 
		Byte byte1=1, byte2;
		Integer integer1 = 1000;
		
		//primitivo y wrapper
		
		a = false?intPrim1:byte1; //int:Byte ==> int
		integer1 = false?intPrim1:byte1; 
		//int:Byte ==> Integer
		
		double2 = false?intPrim1:doubPrim1; //int, double
		//==> Double
		
		//wraper y wraper
		Integer integer2 = false?integer1:byte1;
		//Integer, Byte ==> Integer
		
		Number number1 = false?integer1:byte1;
		
		//Double double4 = false?integer1:byte1;		
		double double5 = false?integer1:byte1; //Integer, Byte ==> double
		
		//Asociación derecha
		int a2 = true?false?0:1:2;
		System.out.println(a2); //1
		
		int a1 = true?(false?0:1):2;
		System.out.println(a1);	//1
		
		System.out.println(true ? 10: "hello");
		System.out.println(false ? 10: "hello");
			
	}
}