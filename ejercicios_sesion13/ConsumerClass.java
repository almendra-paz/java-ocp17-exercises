import java.util.List;
import java.util.ArrayList;
import java.util.function.Consumer;

public class ConsumerClass{
	public static void main(String args[]){	
		List<Alumno> list = new ArrayList<Alumno>();
		list.add(new Alumno(20,"Juan"));
		list.add(new Alumno(18, "Carlos"));
		list.add(new Alumno(10, "Pedro"));

		Consumer<Alumno> c1 = (Alumno a)-> System.out.println(a);
		Consumer<Alumno> c2 = a-> a.nota=20;
		imprimirListado(list, c2);
		imprimirListado(list, c1);
	}

	public static void imprimirListado(List<Alumno> alumnos, 				Consumer<Alumno> c){
		for(Alumno alum: alumnos){
			c.accept(alum);
		}
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