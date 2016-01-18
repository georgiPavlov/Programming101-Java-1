package friday;

public class AccountBlockedException extends Exception{
	
	public  AccountBlockedException(){
		System.out.println("no");
	}
	
	public AccountBlockedException(String message){
		super(message);
	}
	
}
