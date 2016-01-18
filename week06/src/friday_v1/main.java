package friday_v1;


public class main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BankAccountConsole bankSystem = new BankAccountConsole();
		//System.setIn(bankSystem.console.getInput());
		//System.setOut(new PrintStream(bankSystem.console.getOutput()));
		bankSystem.console.start();
	}

}
