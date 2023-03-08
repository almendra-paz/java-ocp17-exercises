public class Sobrescrituras{
	public static void main(String[] args){
		Empleado e = new Empleado();
		System.out.println(e.MAX); //10
		System.out.println(e.getMAX());
		System.out.println(e.edad); //20
		System.out.println(e.getAge());	
		
		Empleador r = new Empleador();
		r.MAX = 100;
		r.edad = 30;
		
		System.out.println(e.MAX);	//100
		System.out.println(e.edad); //20
	}
}

class Person {	
	protected static int MAX = 10;
	protected int edad = 20;
	
	protected int getAge(){
		return this.edad;
	}	
	protected static int getMAX(){
		return MAX;
	}
}

class Empleado extends Person{	

}

class Empleador extends Person{	

}


