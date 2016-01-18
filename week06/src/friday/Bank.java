package friday;

import java.util.HashMap;

public class Bank {
	private HashMap<Integer,BankAccount> bank ;
	
	public Bank(){
		bank=null;
	}
	
	public void addAccount(BankAccount account){
		bank.put(account.getID(), account);
	}
	
	public BankAccount getAccount(int ID){
		return bank.get(ID);
	}
	
	public HashMap<Integer, BankAccount> initialize() throws Exception{
		bank.put(1, new BankAccount("pesho","pesho",3,1000,0.2,"complex"));
		bank.put(2, new BankAccount("gosho","gosho",3,1000,0.01,"complex"));
		return bank;
	}
}


