package packagea;

import packageb.Manzana;
import packagec.ManzanaVerde;

public class Frutero{
	
	public static void main(String args[]){
		Fruta fruta = new Fruta();
		fruta.id = 1;
		System.out.println(fruta.id);
		System.out.println(fruta.name);
		
		Manzana manzana = new Manzana();
		System.out.println(manzana.id);
		
		ManzanaVerde manzanaVerde = new ManzanaVerde();
		System.out.println(manzanaVerde.id);
		//System.out.println(manzanaVerde.name);
	}
	
}