package friday_v1;

public class InsufficientFundsException extends Exception{
	
	public InsufficientFundsException(){
		System.out.println("no money");
	}
	
	public InsufficientFundsException(String message){
		super (message);
	}
}
