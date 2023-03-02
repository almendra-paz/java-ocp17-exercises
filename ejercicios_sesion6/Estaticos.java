public class Estaticos{
	private String nombre;
	private static int MAX = 20;
	
	public int suma(){
		return 3;
	}
	
	public static int suma(int a){
		return 3 + a;
	}
	
	public static void main(String arg[]){	
		// no compilan
		
		//acceso a variables de instacia
		//this.nombre = "Juan Perez";	
		//nombre = "Juan Perez";
		
		// acceso a métodos de instancia
		//suma();
		
		//sí compilan
		
		// acceso a métodos estáticos
		int suma = suma(3);
		System.out.println(suma);
		
		//variable estáticas
		System.out.println(Estaticos.MAX);
		
		Estaticos e = new Estaticos();
		e.nombre = "Juan Perez";
		e.suma();
	}
}
