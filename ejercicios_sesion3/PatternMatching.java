public class PatternMatching{
	
	public static void main(String arg[]){
		Object saludo = "hello";
		if(saludo instanceof String){
			String str = (String) saludo;
			System.out.println(str.length());
		}
		
		if(saludo instanceof String str && str.length()>4){
			System.out.println(str.length());
		}
		
		String saludo2 = "xxx";
		if(saludo2 instanceof String){
			System.out.println("Es un String");
		}
		
		if(saludo2 instanceof String str){
			System.out.println("Es un String");
		}
	}
	
}