package friday;

public class InsufficientFundsException extends Exception{
	
	public InsufficientFundsException(){
		System.out.println("no money");
	}
	
	public InsufficientFundsException(String message){
		super (message);
	}
}
