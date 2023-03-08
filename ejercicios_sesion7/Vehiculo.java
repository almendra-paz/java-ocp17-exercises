 abstract class Vehiculo{
	private String tipo;
	//metodos abstractos: public, protected, default
	abstract String getTipo();
	public abstract void ensamblarse();	
	
	//metodos concretos: 
	//metodo final y static: public, private, protected, default
	final void imprimir(){}
	private final void imprimir2(){}
	protected final static void ensamblarse2(){}
	//protected final abstract void ensamblarse2();
	//protected static abstract void ensamblarse2();	

	public static void main(String args[]){
		//Vehiculo ve = new Vehiculo(); //no compila
		Auto auto = new Auto();
		auto.imprimir();
	}
}

class Auto extends Vehiculo{	
	public String getTipo(){return "";}	
	public void ensamblarse(){}
	//final void imprimir(){}
	protected final static void ensamblarse2(){}
}

final class AutoFinal extends Vehiculo{	
	public String getTipo(){return "";}	
	public void ensamblarse(){}
}

/*
final class AutoHija extends AutoFinal{	
	public String getTipo(){return "";}	
	public void ensamblarse(){}
}*/