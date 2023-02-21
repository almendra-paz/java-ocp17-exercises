public class Switch{

	public static void main(String args[]){
		int mesNumber = 9;
		var mes = switch(mesNumber){
			case 1,2,3-> "Enero";
			case 4,5,6-> "Abril";
			case 7,8,9-> {yield "Julio";}
			default -> "Invalid mes";
		};
		
		System.out.println(mes);
		
		switch(mesNumber){
			case 1,2,3-> System.out.println("Enero");
			case 4,5,6-> System.out.println("Abril");
			case 7,8,9-> System.out.println("Julio");
		};
		
		ButtonState bt = ButtonState.ON;
		var button = switch(bt){
			case ON-> "ON";
			case OFF-> "OFF";
		};
	}
}

enum ButtonState{
	ON, OFF;
}

