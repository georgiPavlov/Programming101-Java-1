package friday;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BankAccountsCLI {

	enum commands {
		start("start"), stop("stop"), create_bank_account("create_bank_account"), show_history(
				"show_history"), add_money("add_money"), withdraw_money("withdraw_money"), transfer_money(
						"transfer_money"), calculate_amount("calculate_amount");

		private String mCommandText;

		private commands(String commandText) {
			mCommandText = commandText;
		}

	};

	private commands mCommand;
	private BankAccount mActiveAccount;

	public BankAccountsCLI() throws Exception {
		mActiveAccount = null;
		mCommand = commands.start;
		start();
	}

	public void start() {
		Scanner input;
		input = new Scanner(System.in);
		String firstName = null, lastName = null;
		Integer age = null;
		Double balance = null;
		Double interest = null;
		String interestType = null;
		while (true) {
			switch (mCommand.mCommandText) {
			case "create_bank_account": {
				if (firstName == null) {
					System.out.println("Enter name:");
					firstName = input.next();
				} else {
					System.out.println("Name:" + firstName);
				}

				if (lastName == null) {
					System.out.println("Enter last name:");
					lastName = input.next();
				} else {
					System.out.println("Last Name:" + lastName);
				}
				
				try {
					if (age == null) {
						System.out.println("Enter Age:");
						age = input.nextInt();
					} else {
						System.out.println("Age:" + age);
					}
				} catch (Exception e) {
					System.out.println("Invalid Input.");
					input.next();
					break;
				}

				try {
					if (balance == null) {
						System.out.println("Enter balance:");
						balance = input.nextDouble();
					} else {
						System.out.println("Balance:" + balance);
					}
				} catch (Exception e) {
					System.out.println("Invalid Input.");
					input.next();
					break;
				}

				try {

					if (interest == null) {
						System.out.println("Enter interest:");
						interest = input.nextDouble();
					}
					else {
						System.out.println("Interest:" + interest);					
					}

				} catch (Exception e) {
					System.out.println("Invalid Input.");
					input.next();
					break;
				}
				System.out.println("Enter interest Type:");
				interestType = input.next();
				
				if (!isValidString(firstName)) {
					System.out.println("Please enter valid first name");
					firstName = input.next();
				} else if (!isValidString(lastName)) {
					System.out.println("Please enter valid last name");
					lastName = input.next();
				} else {
					try {
						mActiveAccount = createBankAccount(firstName, lastName, age, balance, interest, interestType);
					} catch (InputException e) {
						System.out.println("Invalid Input--.");
						input.next();
						break;
					}
					catch (Exception e){
						e.printStackTrace();
					}
				}
				mCommand.mCommandText = input.next();
				break;
			}

			case "show_history": {
				if (mActiveAccount == null) {
					System.out.println("You Haven't selected a bank account");
				} else {
					mActiveAccount.showHistory();
				}
				mCommand.mCommandText = input.next();
				break;
			}
			case "add_money": {
				System.out.println("Enter sum:");
				double sum;
				try {
					sum = input.nextDouble();
				} catch (Exception e) {
					System.out.println("Invalid Input.");
					input.next();
					break;
				}
				if (mActiveAccount == null) {
					System.out.println("select account");
				} else {
					try {
						mActiveAccount.add(sum);
					} catch (Exception e) {
						System.out.println("Invalid Input.");
						input.next();
						break;
					}
				}
				mCommand.mCommandText = input.next();
				break;
			}
			case "withdraw_money": {
				System.out.println("Enter withdraw sum:");
				double sum;
				sum = input.nextDouble();
				if (mActiveAccount == null) {
					System.out.println("select account");
				} else {
					try {
						mActiveAccount.withdraw(sum);
					} catch (InputException | InsufficientFundsException e) {
						// TODO Auto-generated catch block
						System.out.println("Invalid Input.");
						input.next();
						break;
					} catch (AccountBlockedException e) {
						System.out.println("operation denied");
					}
				}
				mCommand.mCommandText = input.next();
				break;
			}
			case "transfer_money": {
				System.out.println("Enter transfer sum:");
				double sum;
				int ID;
				// Bank bank = bank.initialize();
				System.out.println("Enter recipient ID");
				ID = input.nextInt();
				// BankAccount toAccount = bank.getAccount(ID);
				sum = input.nextDouble();
				if (mActiveAccount == null) {
					System.out.println("select transfer account");
				} else {
					// mActiveAccount.transfer(mActiveAccount,toAccount,sum);
				}
				mCommand.mCommandText = input.next();
				break;
			}
			case "calculate_amount": {

			}

			case "stop": {
				System.exit(0);
			}
			default: {
				System.out.println("enter command");
				input = new Scanner(System.in);
				mCommand.mCommandText = input.next();
				break;
			}

			}
			// input.close();
		}
	}

	private boolean isValidString(String word) {
		int i = 0;
		boolean result = true;
		for (i = 0; i < word.length(); i++) {
			if (!Character.isLetter(word.charAt(i))) {
				result = false;
			}
		}
		return result;
	}

	private BankAccount createBankAccount(String firstName, String lastName, int age, double balance, double interest,
			String interestType) throws InputException,Exception {

		return new BankAccount(firstName, lastName, age, balance, interest, interestType);

	}

	public static void main(String[] args) throws Exception {
		BankAccountsCLI cli = new BankAccountsCLI();
		cli.start();
	}
}
