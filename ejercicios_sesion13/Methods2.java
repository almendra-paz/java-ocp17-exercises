import java.util.List;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;

public class Methods2{

	public static void main(String args[]){
		List<Alumno> alumnos = new ArrayList<>();
		alumnos.add(new Alumno(20,"Karla", true));
		alumnos.add(new Alumno(15,"Maria", false));
		alumnos.add(new Alumno(11,"Julia", true));
		alumnos.add(new Alumno(8,"Olga", false));

		Consumer<Alumno> actNota = a -> a.nota = a.nota+2;
		Consumer<Alumno> imprimir = a -> System.out.println(a);
		Consumer<Alumno> actNotaAndImprimir = 						actNota.andThen(imprimir);

		for(Alumno alum: alumnos){
			actNotaAndImprimir.accept(alum);			
		}
		for(Alumno alum: alumnos){			
			System.out.println(alum);
		}
		
		Function<Alumno, Integer> actNota2= a-> a.nota+1;
		Function<Integer, String> imprimir2= a-> "nota: "+a;
		Function<Alumno, String> compuesto = 
								imprimir2.compose(actNota2);

		for(Alumno alum: alumnos){			
			System.out.println(compuesto.apply(alum));
		}
		for(Alumno alum: alumnos){			
			System.out.println(alum);
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