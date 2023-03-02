package packageb;

import packagea.Fruta;
import packagec.ManzanaVerde;

public class Manzana extends Fruta{
	
	
	public static void main(String args[]){
		Fruta fruta = new Fruta();
		System.out.println(fruta.name);
		//fruta.id = 111;		
		
		Manzana manzana = new Manzana();
		manzana.id = 112;	
				
		ManzanaVerde manzanaVerde = 
		new ManzanaVerde();
		manzanaVerde.id = 113;	// sí compila	
		//manzanaVerde.name = "verde";	
				
	}
}