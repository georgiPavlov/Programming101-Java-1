package friday_v1;

public class AccountBlockedException extends Exception{
	public  AccountBlockedException(){
		System.out.println("no");
	}
	
	public AccountBlockedException(String message){
		super(message);
	}
	
}
