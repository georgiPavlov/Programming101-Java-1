package friday_v1;

import java.io.PrintStream;
import java.util.Scanner;

final public class BankAccountConsole {

	BankAccountsCommandLineInterface console;

	public BankAccountConsole() throws Exception {
		PrintStream output = new PrintStream(System.out);
		Scanner input = new Scanner(System.in);
		Bank bank = new Bank();
		bank = bank.initialize();
		output.println("creating console...");
		console = new BankAccountsCommandLineInterface(input, output,bank);
		output.println("done.");
	}

}
