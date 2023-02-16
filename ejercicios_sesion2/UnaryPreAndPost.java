public class UnaryPreAndPost{

	public static void main(String args[]){
		// post increment
		int i = 1;
		int k = i++;	//i incrementa 2 pero devuelve	1			
		System.out.println(i); //valor de i es 2
		System.out.println(k); //valor de k es 1

		int c = 1;
		c = c++;		//c incrementa a 2 pero asigna 1 -> c
		System.out.println("c: "+c);	//1

		// pre increment
		int a = 1;
		int b = ++a;	//a incrementa a 2 y devuelve 2
		System.out.println(a); //valor de a es 2
		System.out.println(b); //valor de b es 2	

		//final Alumno al1 = new Alumno();
		//al1 = al2;		
		
		// Wrappers
		Integer integeri = 1000;
		Integer integerj = integeri;
		
		System.out.println("integerj == integeri? "+(integerj == integeri));
		
		integeri++;
		
		System.out.println("integerj == integeri? "+(integerj == integeri));
		System.out.println(integerj);

		//int d = 0;
		//int int1 = ++d++;

	}
}



