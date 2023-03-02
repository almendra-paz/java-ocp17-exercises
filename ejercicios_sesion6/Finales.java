public class Finales{
	public static final int A = 10;	
	//public static final int C;
	static {
		B = 20;		
	}
	
	static {
		System.out.println(A);
		//System.out.println(B);
		//B = 10;	// dará error de compilación
	}
	
	public static final int B;
	
	public static void main(String arg[]){
		System.out.println("Cargando clase");
		final int suma;
		suma = 100;
		System.out.println(suma);		
	}
}
