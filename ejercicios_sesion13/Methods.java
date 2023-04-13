import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;

public class Methods{

	public static void main(String args[]){
		List<Alumno> alumnos = new ArrayList<>();
		alumnos.add(new Alumno(20,"Karla", true));
		alumnos.add(new Alumno(15,"Maria", false));
		alumnos.add(new Alumno(11,"Julia", true));
		alumnos.add(new Alumno(8,"Olga", false));

		Predicate<Alumno> nota = a -> a.nota>11;
		Predicate<Alumno> habilitacion = a -> a.habilitado;

		Predicate<Alumno> notaAndHabilitado = 
				nota.and(habilitacion);
		Predicate<Alumno> notaNoHabilitado = 
				nota.and(habilitacion.negate());
		Predicate<Alumno> notaOrHabilitado = 
				nota.or(habilitacion);

		for(Alumno alum: alumnos){
			if(notaOrHabilitado.test(alum)){
				System.out.println(alum);
			}
		}		
	}
}

class Alumno{
	public int nota;
	public String nombre;
	public boolean habilitado;
		
	public Alumno(int nota, String nombre, boolean habilitado){
		this.nota = nota;
		this.nombre = nombre;
		this.habilitado = habilitado;
	}

	public String toString(){
		return "nombre: "+ this.nombre + ", nota:" + this.nota + ", habilitado:" + this.habilitado;
	}
}