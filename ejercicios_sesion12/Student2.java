import java.util.List;
import java.util.TreeSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Student2 implements Comparable<Student2>{
	private int id;
	private String name;
	
	public Student2(int id, String name){
		this.id = id;
		this.name = name;
	}

	public int compareTo(Student2 student){
		return this.name.compareTo(student.name);
	}

	public String toString(){
		return name+"-"+id;
	}

	public static void main(String args[]){
		var a1= new Student2(10, "Ana");		
		var a2 = new Student2(3, "Belinda");		
		var a3 = new Student2(5, "Carlos");			

		List<Student2> students = new ArrayList<>();
		//Set<Student2> students = new TreeSet<>();
		students.add(a1);
		students.add(a2);
		students.add(a3);
		Collections.sort(students);
		System.out.println(students);

		//1. Comparator implementado con un inner class
		Comparator<Student2> byId = new Comparator<Student2>(){
			public int compare(Student2 e1, Student2 e2){
				return e1.id-e2.id;
			}
		};
		
		//2. Comparator usando lambdas
		Comparator<Student2> byId2 = (a,b)->a.id-b.id;

		//3. Comparator usando métodos estáticos
		Comparator<Student2> byId3 = Comparator.comparing(e->e.id);
		Comparator<Student2> byId4 = Comparator.reverseOrder();

		Collections.sort(students, byId4);
		System.out.println(students);
	}

}
