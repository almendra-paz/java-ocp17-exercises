public class InitHaciaAdelante{	
	private int MAX = 3;	
	
	{
		System.out.println("hello ");
	}
			
	{	
		//System.out.println(i);	// error de compilación
		i = 20;	
		//int k = i;
		imprimir();
		MAX = 5;		
	}		
	
	private int i;
	private int j = 20;	
		
	public static void main(String arg[]){
		InitHaciaAdelante e = new InitHaciaAdelante();
		System.out.println(e.MAX); //5
		//e.imprimir();
	}
	
	public void imprimir(){
		System.out.println("valor i: "+i); //20
		System.out.println("valor j: "+j); //20
	}
}
