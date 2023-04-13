public class Repoteador1{
	public static void imprimirReporte(Template t){
		t.imprimir();
	}

	public static void main(String args[]){
		// imprimir forma A
		imprimirReporte(()->
		System.out.println("imprimir segun plantilla A"));
		// imprimir forma B
		imprimirReporte(()-> 
		System.out.println("imprimir segun plantilla B"));
		imprimirReporte(()-> 
		System.out.println("imprimir segun plantilla c"));
		imprimirReporte(()-> 
		System.out.println("imprimir segun plantilla D"));
	}
}

interface Template{
	void imprimir();
}