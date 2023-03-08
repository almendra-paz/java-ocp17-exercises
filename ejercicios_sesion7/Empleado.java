public class Empleado extends Person{
	public static void main(String args[]){
		Empleado e = new Empleado();
		e.name = "Juan"; e.COUNT=2;
		
		Person p = new Person();
		System.out.println("Empleado:[name:"+e.name+", count:"+e.COUNT+"]");
		System.out.println("Persona: [name:"+p.name+", count:"+p.COUNT+"]");
 	}
}
class Person {
	public static int COUNT = 0;
	protected String name = "Pepe";
}
