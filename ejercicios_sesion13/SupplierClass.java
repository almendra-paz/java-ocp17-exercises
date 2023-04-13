import java.util.List;
import java.util.ArrayList;
import java.util.function.Supplier;

public class SupplierClass{
	public static void main(String args[]){	
		List<Alumno> list = new ArrayList<Alumno>();
		list.add(new Alumno(20,"Juan"));
		list.add(new Alumno(18, "Carlos"));
		list.add(new Alumno(10, "Pedro"));

		Supplier<Alumno> s1 = ()-> list.get(0);
		Supplier<Alumno> s2 = ()-> new Alumno(15,"Ana");
		Supplier<Alumno> s3 = 
			()-> {list.get(0).nota=15;
				return list.get(0);};
		System.out.println(retornarDato(s3));
	}

	public static Alumno retornarDato(Supplier<Alumno> s){
		return s.get();
	}

}

class Alumno{
	public int nota;
	public String nombre;
		
	public Alumno(int nota, String nombre){
		this.nota = nota;
		this.nombre = nombre;
	}

	public String toString(){
		return "nombre: "+ this.nombre + ", nota:" + this.nota;
	}
}