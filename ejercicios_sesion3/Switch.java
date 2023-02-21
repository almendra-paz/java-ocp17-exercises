public class Switch{

	public static void main(String args[]){
		int a = 30;
		//definiciones correctas
		System.out.println(10|20);
		switch(a){}
		switch(a){			
			case 10|20: {
					/*
					System.out.println("dentro");
					a++;
					System.out.println(a);
					*/}
		}
		switch(a){
			case 10: System.out.println("correcto");
		}

		int suma = 0;
		switch(3){
			case 1: suma++; 
			case 2: suma++;
			case 3: suma++; break;
			default: suma++; 
		}
		System.out.println("suma: "+suma);

	}
}



