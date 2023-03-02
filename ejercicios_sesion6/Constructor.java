public class Constructor{
	{
		System.out.println("Inicializador 1");		
	}
	
	{
		System.out.println("Inicializador 2");
		int a = Integer.parseInt("ss");
	}
	
	public Constructor (){		
		this("clase");
		System.out.println("constructor");		
	}
	
	public Constructor(String str){
		System.out.println("constructor: "+ str);
	}
	
	public static void main(String arg[]){
		Constructor c = new Constructor();
	}
}
