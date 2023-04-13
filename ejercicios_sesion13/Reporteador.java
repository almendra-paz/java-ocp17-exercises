public class Repoteador{
	public static void imprimirReporte(Template t){
		t.imprimir();
	}

	public static void main(String args[]){
		// imprimir forma A
		imprimirReporte(()->System.out.println("imprimir segun plantilla A"));
		// imprimir forma B
		imprimirReporte(()->System.out.println("imprimir segun plantilla B"));

		// imprimir forma C
		imprimirReporte(()->System.out.println("imprimir segun plantilla C"));

		
	}
}

interface Template{
	void imprimir();
}
