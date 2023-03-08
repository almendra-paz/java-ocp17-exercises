public class OverriddenMethods{
	public static void main(String args[]){
		Account a = new DummyAccount(100.00);
		//a.printBalance();	// "No Balance"
		a.printBalance("ok");
	}
}
class Account{
	double balance = 0.0;
	Account(double balance){
		this.balance = balance;
		//this.printBalance();
	}	
	void printBalance(String message){
		System.out.println("OKOK");
	}
}
class DummyAccount extends Account{

	DummyAccount(double b){
		super(b);
	}	
	public void printBalance(){
		System.out.println("No balance");
	}
}