/**************************************************
Variables locales:
-----------------
 - No se pueden usar sin inicializar
 - Compilador hace un anális de rutas
 - Se pueden evaluar constantes mas no expresiones
***************************************************/
public class Inicializacion{

	public static void main(String args[]){	
		int localVariable;
		String localString;
		
		localVariable = 20;
		
		System.out.println("localVariable:" + localVariable);
		System.out.println("localString:" + localString);
	}

}