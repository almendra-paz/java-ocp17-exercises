public class ReferenceCasting{

	public static void main(String[] args){
		//Fruit f = new StartFruit();
		Fruit f = new Fruit();
		Poison p = (Poison) f;
		System.out.println("casting ok");
	}

}

interface Poison{}

class Fruit{}
class Mango extends Fruit{}
class Apple extends Fruit{}
class StartFruit extends Fruit implements Poison{}

